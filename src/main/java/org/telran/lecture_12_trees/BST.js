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
    }
}

/**
 * Класс, представляющий бинарное дерево поиска.
 */
class BinarySearchTree {
    /**
     * Создает новое бинарное дерево поиска.
     */
    constructor() {
        this.root = null;
    }

    /**
     * Вставляет новый узел в дерево.
     * @param key Ключ нового узла.
     * @param value Значение нового узла.
     */
    insert(key, value) {
        const newNode = new Node(key, value);

        if (this.root === null) {
            this.root = newNode;
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
        // TODO-1: Доработайте код, чтобы все ключи были уникальные.
        if (newNode.key < node.key) {
            if (node.left === null) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, newNode);
            }
        } else {
            if (node.right === null) {
                node.right = newNode;
            } else {
                this.insertNode(node.right, newNode);
            }
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
        // // TODO-3:  напишите реализацию метода

        // Если узел найден, возвращаем его значение(value)
        // Если не найден, продолжаем поиск в левой или правой части
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
        // TODO-5: напишите реализацию метода
    }

    length() {
        // TODO-2: реализуйте метод, возвращающий количество узлов в дереве
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
            // console.log(displayPrefix + node.key + ':' + node.value);
            console.log(displayPrefix + node.key);

            const childPrefix = prefix + (isLeft ? '│   ' : '    ');
            if (node.left || node.right) {
                this.displayNode(node.left, childPrefix, true);
                this.displayNode(node.right, childPrefix, false);
            }
        }
    }
}

// Пример использования
const bts = new BinarySearchTree();
bts.insert(1, "1");
bts.insert(3, "1");
bts.insert(4, "1");
bts.insert(2, "1");
bts.insert(6, "1");
bts.insert(7, "1");
bts.insert(5, "1");

bts.displayTree();