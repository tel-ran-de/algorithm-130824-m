package org.telran.lecture_13_bst.practice;

class Node {
    int key;
    String value;
    Node left;
    Node right;
    int balanceFactor;

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
        this.balanceFactor = 0;
        // TODO: добавить отслеживание баланса this.balanceFactor = 0;
        //  Реализовать обновление при вставке
    }
}

public class AVLTree {

    Node root;
    private int length = 0;

    /**
     * Конструктор для создания нового бинарного дерева поиска.
     */
    public AVLTree() {
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
            length++;
            this.updateBalanceFactor(root);
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
        // TODO-1[complete]: Доработайте код, чтобы все ключи были уникальные.
        if (newNode.key < node.key) {
            if (node.left == null) {
                node.left = newNode;
                length++;
                this.updateBalanceFactor(root);
            } else {
                insertNode(node.left, newNode);
            }
        } else if (newNode.key > node.key) {
            if (node.right == null) {
                node.right = newNode;
                length++;
                this.updateBalanceFactor(root);
            } else {
                this.insertNode(node.right, newNode);
            }
        } else { // Найдена дублирующая Нода
            node.value = newNode.value;
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
        // TODO-3[complete]: напишите реализацию метода

        if (node == null) {
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
     *
     * @return Минимальный узел или null, если дерево пустое.
     */
    public Node min() {
        // TODO-4[complete]: напишите реализацию метода
        if (root == null) {
            return null;
        }
        Node currentNode = root;
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode;
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
        // TODO-2[complete]: реализуйте метод, возвращающий количество узлов в дереве
        return length;
    }


    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(this.getHeight(node.left), this.getHeight(node.right)) + 1;

    }

    private void updateBalanceFactor(Node node) {
        if (node == null) {
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

            System.out.println(displayPrefix + directionIndicator + node.key + ":" + node.balanceFactor);

            String childPrefix = prefix + (isLeft ? "│   " : "    ");
            if (node.left != null || node.right != null) {
                displayNode(node.left, childPrefix, true);
                displayNode(node.right, childPrefix, false);
            }
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(3, "1");
        tree.insert(12, "1");
        tree.insert(2, "1");
        tree.insert(15, "1");
        tree.insert(16, "1");

        tree.displayTree();
//        Node minNode = tree.min();
//        if (minNode == null) {
//            System.out.println("Дерево пустое");
//        }else {
//            System.out.println(minNode.key + ":" + minNode.value );
    }

}
