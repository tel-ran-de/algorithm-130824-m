searchNode(node, key) {
        // // TODO-3:  напишите реализацию метода

        // Если узел найден, возвращаем его значение(value)
        // Если не найден, продолжаем поиск в левой или правой части
        if (node === null) {
        return null;
      }
  
        if (node.value === key) {
        return node.value; 
      }
  
        if (key < node.value) {
        return this.searchNode(node.left, key); 
      }
        if (key > node.value) {
        return this.searchNode(node.right, key);
    }
    }
