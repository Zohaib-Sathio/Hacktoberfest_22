public class ArrayBinarySort {

    public static void main(String[] args) {
        ArrayBinarySort sort = new ArrayBinarySort();
        int[] testArray = {55,22,12,34,2,7,15,26};

        int[] sortedArray = sort.sortArray(testArray);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    int[] sortedArray;
    int index;
    int arrayLength = 0;

    public int[] sortArray(int[] arrayToSort) {
        index = 0;
        arrayLength = arrayToSort.length;
        sortedArray = new int[arrayLength];
        BinaryTree tree = new BinaryTree(arrayToSort[0]);
        for(int num : arrayToSort){
            tree.insert(tree.getNode(), num);
        }

        storeInOrder(tree.getNode());

        return sortedArray;
    }

    public void storeInOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        storeInOrder(node.getLeft());
        sortedArray[index++] = node.getValue();
        storeInOrder(node.getRight());
    }

    private class BinaryTree {
        BinaryNode node;

        public BinaryTree(int value){
            node = new BinaryNode(value);
        }

        public BinaryNode getNode() {
            return node;
        }

        public BinaryNode insert(BinaryNode node, int value) {
            if (node == null) {
                return new BinaryNode(value);
            }
            if (value < node.value) {
                node.left = insert(node.left, value);
            }
            else if (value > node.value) {
                node.right = insert(node.right, value);
            }
            return node;
        }
    }

    private class BinaryNode {
        int value;
        BinaryNode left;
        BinaryNode right;
        BinaryNode(int value){
            this.value = value;
            left = null;
            right = null;
        }

        public int getValue() {
            return value;
        }

        public BinaryNode getLeft() {
            return left;
        }

        public BinaryNode getRight() {
            return right;
        }
    }
}