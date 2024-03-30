import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {48, 93, 69, 54, 72, 18, 30, 6, 51, 2, 25, 31, 84};
        BinaryHeap heap = new BinaryHeap();
    }

    public static class BinaryHeap {
        private ArrayList<Integer> heap;
        private int size;

        public BinaryHeap() {
            this.heap = new ArrayList<>();
            this.size = 0;
        }

        private int parent(int i) {
            return (i - 1) / 2;
        }

        private int leftChild(int i) {
            return 2 * i + 1;
        }

        private int rightChild(int i) {
            return 2 * i + 2;
        }

        private void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }

        public void insert(int key) {
            heap.add(key);
            int i = size;
            size++;

            while (i != 0 && heap.get(parent(i)) > heap.get(i)) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        public int delete() {
            if (size <= 0)
                return Integer.MAX_VALUE;

            if (size == 1) {
                size--;
                return heap.remove(0);
            }

            int root = heap.get(0);
            heap.set(0, heap.get(size - 1));
            heap.remove(size - 1);
            size--;

            heapify(0);

            return root;
        }

        private void heapify(int i) {
            int left = leftChild(i);
            int right = rightChild(i);
            int smallest = i;

            if (left < size && heap.get(left) < heap.get(smallest))
                smallest = left;

            if (right < size && heap.get(right) < heap.get(smallest))
                smallest = right;

            if (smallest != i) {
                swap(i, smallest);
                heapify(smallest);
            }
        }
    }
}