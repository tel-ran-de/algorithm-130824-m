package org.telran.lecture_12_trees.practice;

public class BinaryTree {
    private Node root;

    public Node find(int key) {
        Node current = root; // начинаем поиск с корневого узла

        while (current.getKey() != key) { // поиск пока не будет найден элемент или не будут перебраны все
            if (current.getKey() < key) { // движение влево?
                current = current.left;
            } else {
                current = current.right; //движение вправо
            }
            if (current == null) { // если потомка нет,
                return null;
            }
        }
        return current; // возвращаем найденный элемент
    }

    public void insert(int key, String value) {
        Node newNode = new Node(); // создание нового узла
        newNode.setKey(key);
        newNode.setValue(value);
        if (root == null) { // если корневой узел не существует
            root = newNode;// то новый элемент и есть корневой узел
        } else { // корневой узел занят
            Node current = root;
            Node parent = null;

            while (true) // мы имеем внутренний выход из цикла
            {
                parent = current;
                if (key == current.getKey()) {   // если такой элемент в дереве уже есть, не сохраняем его
                    return;    // просто выходим из метода
                } else if (key < current.getKey()) {   // движение влево?
                    current = current.getLeft();
                    if (current == null) { // если был достигнут конец цепочки,
                        parent.setLeft(newNode); //  то вставить слева и выйти из методы
                        return;
                    }
                } else { // или направо?
                    current = current.getRight();
                    if (current == null) { // если был достигнут конец цепочки,
                        parent.setRight(newNode);  //то вставить справа
                        return; // и выйти
                    }
                }
            }
        }

    }


//        private Node insertNodeRecursive (Node current,int value){
//            if (current == null) {
//                Node node = new Node();
//                node.setValue(value);
//                return node;
//            }
//
//            if (value < current.getValue()) {
//                current.left = insertNodeRecursive(current.left, value);
//            } else if (value > current.getValue()) {
//                current.right = insertNodeRecursive(current.right, value);
//            } else {
//                return current;
//            }
//
//            return current;
//        }

    public boolean delete(int value) {
        return false;
    }

    public void print(Node node) {
        if (node != null) {
            print(node.left);
            node.printNode();
            print(node.right);
        }
    }
}
