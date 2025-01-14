/** Деревья */

class Node {
    constructor(key, value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    constructor() {
        this.root = null;
    }

    find(key) {
        let current = this.root;

        while (current.key !== key) {
            if (current.key < key) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current === null) {
                return null;
            }
        }
        return current;
    }

    insert(key, value) {
        const newNode = new Node(key, value);
        if (this.root === null) {
            this.root = newNode;
        } else {
            let current = this.root;
            let parent;

            while (true) {
                parent = current;
                if (key === current.key) {
                    return;
                } else if (key < current.key) {
                    current = current.left;
                    if (current === null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current === null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    print(data) {
        console.log(data);
    }
}

const bt = new BinaryTree();
bt.insert(1, "node 1");
bt.insert(2, "node 2");
bt.insert(3, "node 3");
bt.insert(4, "node 4");

bt.print();
console.log(bt.find(1));
