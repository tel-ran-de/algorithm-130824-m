package org.telran.lecture_13_bst.practice;

public class AvlTree {
    private Node root;

    public Node insert(Node node, int key) {

        /* 1.  Perform the normal BST insertion */
        // if the root is null, create a new node and return it
        if (node == null) {
            Node res = new Node();
            res.setKey(key);
            return res;
        }

        // if the given key is less than the root node,
        // recur for the left subtree
        if (key < node.getKey()) {
            node.setLeft(insert(node.getLeft(), key));
        }
        else { // otherwise, recur for the right subtree
            // key >= root.key
            node.setRight(insert(node.getRight(), key));
        }

        return balanceTree(key, node);
    }

    private Node balanceTree(int key, Node newNode) {
        /* 2. Update height of this parent node */
        newNode.setHeight(1 + Util.max(Util.getHeightNode(newNode.getLeft()), Util.getHeightNode(newNode.getRight())));

        /* 3. Get the balance factor */
        int balance = Util.getBalanceFactor(newNode);

        // If this node becomes unbalanced, then there
        // are 4 cases LeftLeft Case
        if (balance > 1 && key < newNode.getLeft().getKey())
            return Util.leftRotate(newNode);

        // RightRight Case
        if (balance < -1 && key > newNode.getRight().getKey())
            return Util.leftRotate(newNode);

        // LeftRight Case
        if (balance > 1 && key > newNode.getLeft().getKey()) {
            newNode.setLeft(Util.leftRotate(newNode.getLeft()));
            return Util.rightRotate(newNode);
        }

        // RightLeft Case
        if (balance < -1 && key < newNode.getRight().getKey()) {
            newNode.setRight(Util.rightRotate(newNode.getRight()));
            return Util.leftRotate(newNode);
        }

        /* return the (unchanged) node pointer */
        return newNode;
    }
}
