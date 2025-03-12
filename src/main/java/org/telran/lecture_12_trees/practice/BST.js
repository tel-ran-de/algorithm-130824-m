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
    #length=0
    constructor(root, length) {
        this.root = null;
        this.#length=this.#length
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
            this.#length++;
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
                this.#length++
            }
        } 
        if (newNode.key > node.key) {
            if (node.left === null) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, newNode);
                this.#length++
            }
        }
        if (newNode.key === node.key){
            console.log(`"Ошибка, дублированный ключ ${newNode.key}"`);
            
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
        if (node === null) {
        return null;
      }
  
        if (node.key === key) {
        return node; 
      }
  
        if (key < node.key) {
        return this.searchNode(node.left, key); 
      }
        if (key > node.key) {
        return this.searchNode(node.right, key);
    }
    }

    /**
     * Находит минимальный узел в дереве.
     * @returns Минимальный узел или null, если дерево пустое.
     * // TODO-4: напишите реализацию метода
     */
    min() {
        if (this.root === null) {
            return null;
        }

        let current = this.root;

        while (current.left !== null) {
            current = current.left;
        }

        return current; 
    }

    /**
     * Находит максимальный узел в дереве.
     * @returns Максимальный узел или null, если дерево пустое.
     *  // TODO-5: напишите реализацию метода
     */
    max() {
        if (this.root === null) {
            return null;
        }

        let current = this.root;

        while (current.right !== null) {
            current = current.right;
        }
        return current; 
    }

    // TODO-2: реализуйте метод, возвращающий количество узлов в дереве
    // length() {
        
    //     const countNodes = (node) => {
    //         if (node === null) {
    //             return 0; 
    //         }
    //         return 1 + countNodes(node.left) + countNodes(node.right);
    //     };        
    //     return countNodes(this.root);        
    // }

    length() {
        return this.#length;
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
bts.insert(8, "1");
bts.insert(5, "1");

bts.displayTree();

console.log(bts.length());
