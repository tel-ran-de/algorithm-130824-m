/**
 * Класс, представляющий узел бинарного дерева поиска.
 */
class Node {
    /**
     * Создает новый узел.
     * @param key Ключ узла.
     * @param value Значение узла.
     */
    constructor(key, value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
        this.balanceFactor = 0;
        // TODO: добавить отслеживание баланса this.balanceFactor = 0;
        //  Реализовать обновление при вставке
    }
}

/**
 * Класс, представляющий бинарное дерево поиска.
 */
class AVLTree {
    /**
     * Создает новое бинарное дерево поиска.
     */
    constructor() {
        this.root = null;
        this.num_nodes = 0;
    }

    /**
     * Вставляет новый узел в дерево.
     * @param key Ключ нового узла.
     * @param value Значение нового узла.
     */
    insert(key, value) {
        const newNode = new Node(key, value);
        // newNode = {"key": 2, "value": "Вася", "left": null, "right": null};
        if (this.root === null) {
            this.root = newNode;
            this.updateBalanceFactor(this.root);
        } else {
            this.insertNode(this.root, newNode);
        }
    }

    /**
     * Рекурсивно вставляет новый узел в поддерево.
     * @param node Текущий узел.
     * @param newNode Новый узел.
     */
    insertNode(node, newNode) {
        // TODO-1[complete]: Доработайте код, чтобы все ключи были уникальные.
        if (newNode.key < node.key) {
            if (node.left === null) {
                node.left = newNode;
                this.num_nodes++;
                this.updateBalanceFactor(this.root);
            } else {
                this.insertNode(node.left, newNode);
            }
        } else if (newNode.key > node.key) {
            if (node.right === null) {
                node.right = newNode;
                this.num_nodes++;
                this.updateBalanceFactor(this.root);
            } else {
                this.insertNode(node.right, newNode);
            }
        } else { // Найдена дублирующая Нода
            node.value = newNode.value;
        }
    }

    /**
     * Ищет значение узла по заданному ключу.
     * @param key Ключ искомого узла.
     * @returns Значение найденного узла или null, если узел не найден.
     */
    search(key) {
        const node = this.searchNode(this.root, key);
        return node ? node.value : null;
    }

    /**
     * Рекурсивно ищет узел с заданным ключом в поддереве.
     * @param node Текущий узел.
     * @param key Ключ искомого узла.
     * @returns Найденный узел или null, если узел не найден.
     */
    searchNode(node, key) {
        // TODO-3[complete]:напишите реализацию метода

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

    /**
     * Находит минимальный узел в дереве.
     * @returns Минимальный узел или null, если дерево пустое.
     */
    min() {
        // TODO-4: напишите реализацию метода
    }

    /**
     * Находит максимальный узел в дереве.
     * @returns Максимальный узел или null, если дерево пустое.
     */
    max() {
        // TODO-5[complete]: напишите реализацию метода
        if (this.root === null) {
            return null;
        }
        let currentNode = this.root;
        while (currentNode.right != null) {
            currentNode = currentNode.right;
        }
        return currentNode;
    }

    length() {
        // TODO-2[complete]: реализуйте метод, возвращающий количество узлов в дереве
        return this.num_nodes;
    }

    getHeight(node) {
        if (node === null) {
            return 0;
        }
        return Math.max(this.getHeight(node.left), this.getHeight(node.right)) + 1;

    }

    updateBalanceFactor(node) {
        if (node === null) {
            return;
        }
        node.balanceFactor = this.getHeight(node.right) - this.getHeight(node.left);
        // console.log("key:", node.key, "bf:", node.balanceFactor);
        this.updateBalanceFactor(node.right);
        this.updateBalanceFactor(node.left);
    }

    /**
     * Отображает дерево в виде древовидной структуры в терминале.
     */
    displayTree() {
        if (this.root === null) {
            console.log('Дерево пустое.');
            return;
        }

        this.displayNode(this.root, '', true);
    }

    /**
     * Рекурсивно отображает узел и его поддеревья.
     * @param node Текущий узел.
     * @param prefix Префикс для отображения уровня дерева.
     * @param isLeft Флаг, указывающий, является ли узел левым дочерним.
     */
    displayNode(node, prefix, isLeft) {
        if (node !== null) {
            const displayPrefix = prefix + (isLeft ? '├── L:' : '└── R:');
            console.log(displayPrefix + node.key + ': bf ' + node.balanceFactor);
            // console.log(displayPrefix + node.key);

            const childPrefix = prefix + (isLeft ? '│   ' : '    ');
            if (node.left || node.right) {
                this.displayNode(node.left, childPrefix, true);
                this.displayNode(node.right, childPrefix, false);
            }
        }
    }
}

// Пример использования
const tree = new AVLTree();
tree.insert(3, "1");
tree.insert(12, "1");
tree.insert(2, "1");
tree.insert(15, "1");
tree.insert(16, "1");

tree.displayTree();
// let maxNode = tree.max();
// if (maxNode === null) {
//     console.log("Дерево пустое")
// }else {
//     console.log(maxNode.key,":", maxNode.value);
// }


