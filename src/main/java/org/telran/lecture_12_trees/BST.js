insertNode(node, newNode) {
        // TODO-1: Доработайте код, чтобы все ключи были уникальные.
        if (newNode.key < node.key) {
            if (node.left === null) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, newNode);
            }
        } 
        if (newNode.key > node.key) {
            if (node.left === null) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, newNode);
            }
        }
        if (newNode.key === node.key){
            console.log(`"Ошибка, дублированный ключ ${newNode.key}"`);
            
        }
    }
