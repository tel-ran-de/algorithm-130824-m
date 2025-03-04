package org.telran.lecture_12_trees.practice;

class Node {
    int key;
    String value;
    Node left;
    Node right;

    /**
     * Конструктор для создания нового узла.
     *
     * @param key   Ключ узла.
     * @param value Значение узла.
     */
    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root;
    private int length = 0;
    /**
     * Конструктор для создания нового бинарного дерева поиска.
     */
    public BST() {
        this.root = null;

    }

    /**
     * Вставляет новый узел в дерево.
     *
     * @param key   Ключ нового узла.
     * @param value Значение нового узла.
     */
    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            insertNode(root, newNode);
        }
    }

    /**
     * Рекурсивно вставляет новый узел в поддерево.
     *
     * @param node    Текущий узел.
     * @param newNode Новый узел.
     */
    private void insertNode(Node node, Node newNode) {
        // TODO-1: Доработайте код, чтобы все ключи были уникальные.

        if (newNode.key == node.key) {
            node.value = newNode.value;
            return;
        }
        if (newNode.key < node.key) {
            if (node.left == null) {
                node.left = newNode;
                length++;
            } else {
                insertNode(node.left, newNode);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertNode(node.right, newNode);
                length++;
            }
        }
    }


    /**
     * Ищет значение узла по заданному ключу.
     *
     * @param key Ключ искомого узла.
     * @return Значение найденного узла или null, если узел не найден.
     */
    public String search(int key) {
        Node node = searchNode(root, key);
        return node != null ? node.value : null;
    }

    private Node searchNode(Node node, int key) {
        if (node == null || node.key == key) {
            return node;
        }
        return key < node.key ? searchNode(node.left, key) : searchNode(node.right, key);
    }

    /**
     * Рекурсивно ищет узел с заданным ключом в поддереве.
     *
     * @param node Текущий узел.
     * @param key  Ключ искомого узла.
     * @return Найденный узел или null, если узел не найден.
     */


    /**
     * Находит минимальный узел в дереве.
     *
     * @return Минимальный узел или null, если дерево пустое.
     */
    public Node min() {
        // TODO-4: напишите реализацию метода
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    /**
     * Находит максимальный узел в дереве.
     *
     * @return Максимальный узел или null, если дерево пустое.
     */
    public Node max() {
        // TODO-5: напишите реализацию метода
        if (root == null) {
            return null;
        }
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }


    // TODO-2: реализуйте метод, возвращающий количество узлов в дереве
    public int length() {
        return length;
    }


    /**
     * Отображает дерево в виде древовидной структуры в терминале.
     */
    public void displayTree() {
        if (root == null) {
            System.out.println("Дерево пустое.");
            return;
        }
        displayNode(root, "", true);
    }

    /**
     * Рекурсивно отображает узел и его поддеревья.
     *
     * @param node   Текущий узел.
     * @param prefix Префикс для отображения уровня дерева.
     * @param isLeft Флаг, указывающий, является ли узел левым дочерним.
     */
    private void displayNode(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            String displayPrefix = prefix + (isLeft ? "├── " : "└── ");
            String directionIndicator = isLeft ? "L: " : "R: ";

            System.out.println(displayPrefix + directionIndicator + node.key + ":" + node.value);

            String childPrefix = prefix + (isLeft ? "│   " : "    ");
            if (node.left != null || node.right != null) {
                displayNode(node.left, childPrefix, true);
                displayNode(node.right, childPrefix, false);
            }
        }
    }

    public static void main(String[] args) {

        BST bst = new BST();
        bst.insert(3,"Ivan");
        bst.insert(2,"Olga");
        bst.insert(8,"Petr");
        bst.insert(8,"Kiril");
        bst.insert(6,"John");

        bst.displayTree();
        System.out.println("Количество узлов: " + bst.length());

        System.out.println("Поиск ключа 8: " + bst.search(8));
        System.out.println("Минимальный узел: " + bst.min().key + " " + bst.min().value);
        System.out.println("Максимальный узел: " + bst.max().key + " " + bst.max().value);

    }
}
