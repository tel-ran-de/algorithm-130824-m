package org.telran.lecture_12_trees.hw;

public class MyTree {
    // Обертка над классом `Node`
    static class NodeWrapper {
        public Node node;

        NodeWrapper() {
            this.node = null;
        }

        NodeWrapper(int data) {
            this.node = new Node(data);
        }
    }

    // Функция для выполнения неупорядоченного обхода дерева
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Функция для обмена данными заданных узлов дерева
    public static void swapData(Node first, Node second) {
        int data = first.data;
        first.data = second.data;
        second.data = data;
    }

    // Рекурсивная функция для вставки ключа в BST
    public static Node insert(Node root, int key) {
        // если корень нулевой, создаем новый узел и возвращаем его
        if (root == null) {
            return new Node(key);
        }

        // если заданный ключ меньше корневого узла, повторить для левого поддерева
        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        // если данный ключ больше, чем корневой узел, повторить для правого поддерева
        else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Рекурсивная функция для исправления бинарного дерева, состоящего только из одного свопа
    // от того, чтобы стать BST. Здесь `prev` — это ранее обработанный узел.
    // в неупорядоченном обходе, а `x` и `y` хранят узел, который нужно поменять местами (если есть).
    public static void correctBST(Node root, NodeWrapper x, NodeWrapper y,
                                  NodeWrapper prev) {
        // базовый вариант
        if (root == null) {
            return;
        }

        // повторяется для левого поддерева
        correctBST(root.left, x, y, prev);

        // если текущий узел меньше предыдущего узла
        if (root.data < prev.node.data) {
            // если это первое вхождение, обновить `x` и `y` до предыдущего
            // и текущий узел соответственно
            if (x.node == null) {
                x.node = prev.node;
            }

            // если это второе вхождение, обновить `y` до текущего узла
            y.node = root;
        }

        // обновить предыдущий узел и повторить для правого поддерева
        prev.node = root;
        correctBST(root.right, x, y, prev);
    }

    // Исправление данного бинарного дерева, которое находится всего в одном свопе от того, чтобы стать BST
    public static void correctBST(Node root) {
        // обернуть узлы `x`, `y` и `prev`, чтобы можно было изменить их ссылку
        // внутри метода `correctBST()`

        // `x` и `y` хранят узел, который нужно поменять местами
        NodeWrapper x = new NodeWrapper();
        NodeWrapper y = new NodeWrapper();

        // сохраняет ранее обработанный узел в порядке обхода
        // инициализируем его с помощью -INFINITY
        NodeWrapper prev = new NodeWrapper(Integer.MIN_VALUE);

        // исправить бинарное дерево
        correctBST(root, x, y, prev);

        // поменять местами узлы
        if (x.node != null && y.node != null) {
            swapData(x.node, y.node);
        }
    }
}
