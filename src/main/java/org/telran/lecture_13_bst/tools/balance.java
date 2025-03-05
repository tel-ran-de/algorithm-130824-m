//private void balance(Node node) {
//    if (node.balanceFactor > 1) {
//        if (node.right.balanceFactor < 0) {
//            rightRotate(node.right);
//        }
//        leftRotate(node);
//    } else if (node.balanceFactor < -1) {
//        if (node.left.balanceFactor > 0) {
//            leftRotate(node.left);
//        }
//        rightRotate(node);
//    }
//}

//private Node leftRotate(Node node) {
//    Node rightChild = node.right;
//    node.right = rightChild.left;
//    rightChild.left = node;
//    updateBalanceFactor(node);
//    updateBalanceFactor(rightChild);
//    if (node == root) {
//        root = rightChild;
//    }
//    return rightChild;
//}

//private Node rightRotate(Node node) {
//    Node leftChild = node.left;
//    node.left = leftChild.right;
//    leftChild.right = node;
//    updateBalanceFactor(node);
//    updateBalanceFactor(leftChild);
//    if (node == root) {
//        root = leftChild;
//    }
//    return leftChild;
//}