/**
 * Балансирует дерево, начиная с заданного узла.
 * @param node Узел, с которого начинается балансировка.
 */
// balance(node) {
//     if (node.balanceFactor > 1) {
//         if (node.right.balanceFactor < 0) {
//             this.rightRotate(node.right);
//         }
//         this.leftRotate(node);
//     } else if (node.balanceFactor < -1) {
//         if (node.left.balanceFactor > 0) {
//             this.leftRotate(node.left);
//         }
//         this.rightRotate(node);
//     }
// }

/**
 * Выполняет левый поворот.
 * @param node Узел, относительно которого выполняется поворот.
 */
// leftRotate(node) {
//     const rightChild = node.right;
//     node.right = rightChild.left;
//     rightChild.left = node;
//     this.updateBalanceFactor(node);
//     this.updateBalanceFactor(rightChild);
//     if (node === this.root) {
//         this.root = rightChild;
//     }
//     return rightChild;
// }

/**
 * Выполняет правый поворот.
 * @param node Узел, относительно которого выполняется поворот.
 */
// rightRotate(node) {
//     const leftChild = node.left;
//     node.left = leftChild.right;
//     leftChild.right = node;
//     this.updateBalanceFactor(node);
//     this.updateBalanceFactor(leftChild);
//     if (node === this.root) {
//         this.root = leftChild;
//     }
//     return leftChild;
// }