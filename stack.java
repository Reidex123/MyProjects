import java.util.*;

public class stack<T> implements Iterable<T> {
    private T[] list;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public stack(int size) {
        list = (T[]) new Object[size];
        DEFAULT_SIZE = size;
    }

    @SuppressWarnings("unchecked")
    public stack() {
        list = (T[]) new Object[DEFAULT_SIZE];
    }

    private class listIterator implements Iterator<T> {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return list[count++];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new listIterator();
    }

    public void push(T item) {
        if (size == list.length) {
            resize();
        }
        list[size++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = list[--size];
        list[size] = null; // Avoid memory leak
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] data = (T[]) new Object[list.length * 2];
        for (int i = 0; i < size; i++) {
            data[i] = list[i];
        }
        list = data;
    }
}