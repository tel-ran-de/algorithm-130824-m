class Node {
    constructor(key, value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.balanceFactor = 0;
    }
}

class AVLTree {
    constructor(showDetails = false) {
        this.root = null;
        this._length = 0;
        this.isBalanced = true;
        this.showDetails = showDetails;
    }

    insert(key, value) {
        const newNode = new Node(key, value);
        if (this.root === null) {
            this.root = newNode;
            this._length++;
        } else {
            this.insertNode(this.root, newNode);
        }
    }

    insertNode(node, newNode) {
        if (newNode.key < node.key) {
            if (node.left === null) {
                node.left = newNode;
                newNode.parent = node;
                this._length++;
                this.updateBalancePath(newNode);
            } else {
                this.insertNode(node.left, newNode);
            }
        } else if (newNode.key > node.key) {
            if (node.right === null) {
                node.right = newNode;
                newNode.parent = node;
                this._length++;
                this.updateBalancePath(newNode);
            } else {
                this.insertNode(node.right, newNode);
            }
        } else {
            node.value = newNode.value;
        }
    }

    search(key) {
        const node = this.searchNode(this.root, key);
        return node ? node.value : null;
    }

    searchNode(node, key) {
        if (node === null) {
            return null;
        }

        if (key < node.key) {
            return this.searchNode(node.left, key);
        } else if (key > node.key) {
            return this.searchNode(node.right, key);
        } else {
            return node;
        }
    }

    min(node) {
        let currentNode = node;
        if (node === null) {
            currentNode = this.root;
        }
        if (this.root === null) {
            return null;
        }

        while (currentNode.left !== null) {
            currentNode = currentNode.left;
        }
        return currentNode;
    }

    max() {
        // TODO-5: напишите реализацию метода
        return new Node(0, "zero"); // Заглушка
    }

    length() {
        return this._length;
    }

    updateBalancePath(node) {
        while (node !== null) {
            this.updateBalanceFactor(node);
            this.balance(node);
            node = node.parent;
        }
    }

    updateBalanceFactor(node) {
        node.balanceFactor = this.getNodeHeight(node.right) - this.getNodeHeight(node.left);
    }

    getNodeHeight(node) {
        if (node === null) {
            return 0;
        }
        return Math.max(this.getNodeHeight(node.left), this.getNodeHeight(node.right)) + 1;
    }

    isBalanced() {
        return this.isBalanced;
    }

    balance(node) {
        if (node === null) {
            return;
        }

        if (node.balanceFactor > 1) {
            if (node.right.balanceFactor < 0) {
                node.right = this.rightRotate(node.right);
            }
            node = this.leftRotate(node);
        } else if (node.balanceFactor < -1) {
            if (node.left.balanceFactor > 0) {
                node.left = this.leftRotate(node.left);
            }
            node = this.rightRotate(node);
        }

        if (node.left !== null) {
            this.updateBalanceFactor(node.left);
        }
        if (node.right !== null) {
            this.updateBalanceFactor(node.right);
        }
        this.updateBalanceFactor(node);

        if (node.parent === null) {
            this.root = node;
        }
    }

    leftRotate(node) {
        if (this.showDetails) {
            console.log("leftRotate");
            this.displayTree();
        }

        const rightChild = node.right;
        node.right = rightChild.left;

        if (rightChild.left !== null) {
            rightChild.left.parent = node;
        }

        rightChild.left = node;
        rightChild.parent = node.parent;
        node.parent = rightChild;

        if (rightChild.parent !== null) {
            if (rightChild.parent.left === node) {
                rightChild.parent.left = rightChild;
            } else {
                rightChild.parent.right = rightChild;
            }
        }

        this.updateBalanceFactor(node);
        this.updateBalanceFactor(rightChild);

        return rightChild;
    }

    rightRotate(node) {
        if (this.showDetails) {
            console.log("rightRotate");
            this.displayTree();
        }

        const leftChild = node.left;
        node.left = leftChild.right;

        if (leftChild.right !== null) {
            leftChild.right.parent = node;
        }

        leftChild.right = node;
        leftChild.parent = node.parent;
        node.parent = leftChild;

        if (leftChild.parent !== null) {
            if (leftChild.parent.left === node) {
                leftChild.parent.left = leftChild;
            } else {
                leftChild.parent.right = leftChild;
            }
        }

        this.updateBalanceFactor(node);
        this.updateBalanceFactor(leftChild);

        return leftChild;
    }

    remove(key) {
        const nodeToRemove = this.searchNode(this.root, key);
        if (nodeToRemove === null) {
            return; // Узел не найден
        }
        this.removeNode(nodeToRemove);
    }

    removeNode(nodeToRemove) {
        let replacementNode;
        const parent = nodeToRemove.parent;

        if (nodeToRemove.left === null || nodeToRemove.right === null) {
            replacementNode = nodeToRemove.left !== null ? nodeToRemove.left : nodeToRemove.right;
        } else {
            replacementNode = this.min(nodeToRemove.right);
            nodeToRemove.key = replacementNode.key;
            nodeToRemove.value = replacementNode.value;
            this.removeNode(replacementNode); // Рекурсивно удаляем узел замены
            this.updateBalancePath(nodeToRemove);
            this._length--;
            return;
        }

        if (replacementNode !== null) {
            replacementNode.parent = parent;
        }

        if (parent === null) {
            this.root = replacementNode;
        } else if (parent.left === nodeToRemove) {
            parent.left = replacementNode;
        } else {
            parent.right = replacementNode;
        }

        this.updateBalancePath(parent);
        this._length--;
    }

    displayTree() {
        if (this.root === null) {
            console.log("Дерево пустое.");
            return;
        }
        this.displayNode(this.root, "", true);
    }

    displayNode(node, prefix, isLeft) {
        if (node !== null) {
            const displayPrefix = prefix + (isLeft ? "├── " : "└── ");
            const directionIndicator = isLeft ? "L: " : "R: ";

            console.log(displayPrefix + directionIndicator + node.key + ":" + node.balanceFactor);

            const childPrefix = prefix + (isLeft ? "│   " : "    ");
            if (node.left !== null || node.right !== null) {
                this.displayNode(node.left, childPrefix, true);
                this.displayNode(node.right, childPrefix, false);
            }
        }
    }
}

// Пример использования
const tree = new AVLTree();
tree.insert(50, "1");
tree.insert(60, "1");
tree.insert(10, "1");
tree.insert(8, "1");
tree.insert(20, "1");
tree.insert(15, "1");

console.log("result tree");
tree.displayTree();

tree.remove(10);
// tree.remove(8);
tree.displayTree();


