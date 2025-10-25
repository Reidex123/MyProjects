import java.util.*;

public class stack<T> implements iterable<T> {
    private T[] list;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public stack(int size) {
        list = new T[size];
    }

    public stack() {
        list = new T[DEFAULT_SIZE];
    }

    public class listIterator<T> implements iterator<T> {
        private int count = 0;

        @Override
        public boolean hasNext() {
            if (0 == size) {
                return false;
            }

            return count < size;
        }

        @Override
        public <T> T next() {
            return list[count++];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new listIterator();
    }

    public void push(T item) {
        if (isFull()) {
            resize();
            list[size - 1] = item;
            size++;
        } else {
            list[size - 1] = item;
            size++;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.exit(0);
        }
        T value = list[size - 1];
        for (int i = 0; i < size - 1; i++) {
            list[i] = list[i];
            size--;
        }
        return value;
    }

    public T peek() {
        if (isFull()) {
            System.exit(0);
        }
        if (isEmpty()) {
            System.exit(0);
        }

        return list[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == DEFAULT_SIZE;
    }

    private void resize() {
        T[] data = new T[2 * DEFAULT_SIZE];
        for (int i = 0; i < size; i++) {
            data[i] = list[i];
        }

        list = data;
        data = null;
    }
}