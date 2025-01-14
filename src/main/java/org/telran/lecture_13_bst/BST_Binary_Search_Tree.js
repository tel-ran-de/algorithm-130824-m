/** Самобалансирующиеся деревья */

class Node {
    constructor(key, value, height, left, right) {
        this.key = key;
        this.value = value;
        this.height = height;
        this.left = left;
        this.right = right;
    }
}

class AvlTree {
    constructor(root) {
        this.root = root;
    }

    insert(node, key) {
        // if the root is null, create a new node and return it
        if (!node) {
            return new Node(key);
        }

        // if the given key is less than the root node, recur for the left subtree
        if (key < node.key) {
            node.left = this.insert(node.left, key);
        } else { // otherwise, recur for the right subtree
            node.right = this.insert(node.right, key);
        }

        return this.balanceTree(key, node);
    }

    balanceTree(key, newNode) {
        /* 2. Update height of this parent node */
        newNode.height = 1 + Math.max(Util.getHeightNode(newNode.left), Util.getHeightNode(newNode.right));

        /* 3. Get the balance factor */
        let balance = Util.getBalanceFactor(newNode);

        // If this node becomes unbalanced, then there
        // are 4 cases LeftLeft Case
        if (balance > 1 && key < newNode.left.key) {
            return Util.leftRotate(newNode);
        }

        // RightRight Case
        if (balance < -1 && key > newNode.right.key) {
            return Util.leftRotate(newNode);
        }

        // LeftRight Case
        if (balance > 1 && key > newNode.left.key) {
            newNode.left = Util.leftRotate(newNode.left);
            return Util.rightRotate(newNode);
        }

        // RightLeft Case
        if (balance < -1 && key < newNode.right.key) {
            newNode.right = Util.rightRotate(newNode.right);
            return Util.leftRotate(newNode);
        }

        /* return the (unchanged) node pointer */
        return newNode;
    }
}

class Util {
    static getHeightNode(node) {
        if (!node) {
            return 0;
        }
        return node.height;
    }

    static max(a, b) {
        return (a > b) ? a : b;
    }

    static rightRotate(b) {
        let c = b.left;
        let temp = c.right;

        // Perform rotation
        c.right = b;
        b.left = temp;

        // Update heights
        b.height = Util.max(Util.getHeightNode(b.left), Util.getHeightNode(b.right)) + 1;
        c.height = Util.max(Util.getHeightNode(c.left), Util.getHeightNode(c.right)) + 1;

        // Return new root
        return c;
    }

    static leftRotate(a) {
        let b = a.right;
        let temp = b.left;

        // Perform rotation
        b.left = a;
        a.right = temp;

        //  Update heights
        a.height = Util.max(Util.getHeightNode(a.left), Util.getHeightNode(a.right)) + 1;
        b.height = Util.max(Util.getHeightNode(b.left), Util.getHeightNode(b.right)) + 1;

        // Return new root
        return b;
    }

    // Get Balance factor of node N
    static getBalanceFactor(node) {
        if (!node) {
            return 0;
        }

        return Util.getHeightNode(node.left) - Util.getHeightNode(node.right);
    }
}

class AvlPractice {
    static main() {
        let tree = new AvlTree();
        let keys = [10, 20, 30, 40, 50, 25];
        let root = AvlPractice.constructBST(tree, keys);

        console.log(tree.root);
    }

    static constructBST(tree, keys) {
        let root = null;
        for (let key of keys) {
            root = tree.insert(root, key);
        }
        return root;
    }
}
