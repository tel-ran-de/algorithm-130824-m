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

    private int size = 0;

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
            size = 1;
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
        if (newNode.key < node.key) {
            if (node.left == null) {
                node.left = newNode;
                size++;
            } else {
                insertNode(node.left, newNode);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
                size++;
            } else {
                insertNode(node.right, newNode);
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

    /**
     * Рекурсивно ищет узел с заданным ключом в поддереве.
     *
     * @param node Текущий узел.
     * @param key  Ключ искомого узла.
     * @return Найденный узел или null, если узел не найден.
     */
    private Node searchNode(Node node, int key) {
        // TODO-3: напишите реализацию метода

        // Если узел найден, возвращаем его значение(value)
        // Если не найден, продолжаем поиск в левой или правой части
        return node;
    }

    /**
     * Находит минимальный узел в дереве.
     *
     * @return Минимальный узел или null, если дерево пустое.
     */
    public Node min() {
        // TODO-4: напишите реализацию метода
        return new Node(0, "zero"); // Заглушка
    }

    /**
     * Находит максимальный узел в дереве.
     *
     * @return Максимальный узел или null, если дерево пустое.
     */
    public Node max() {
        // TODO-5: напишите реализацию метода
        return new Node(0, "zero"); // Заглушка
    }

    public int length() {
        // TODO-2: реализуйте метод, возвращающий количество узлов в дереве
        return size;
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

        bst.insert(3, "Roman");
        bst.insert(1, "Ivan");
        bst.insert(5, "John");
        bst.insert(2, "Sam");
        bst.insert(22, "One");
        bst.insert(11, "Two");
        bst.insert(23, "Three");
        bst.insert(12, "Four");
        bst.insert(10, "Five");
        bst.insert(23, "Six");

        System.out.println(bst.length());
    }
}