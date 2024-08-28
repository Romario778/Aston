package HW03.Collections;

import java.util.Collection;
import java.util.List;

public class MyArrayList {

    private int size; // текущий размер коллекции
    private int capacity; // размер внутреннего массива по умолчанию
    private Object[] elements; // массив под капотом

    public MyArrayList() {
        capacity = 10;
        size = 0;
        elements = new Object[capacity];
    }

    public void add(Object element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public <T> boolean addAll(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        } else {
            for (T obj : collection) {
                add(obj);
            }
            return true;
        }
    }

    public Object get(int index) {
        if (index >= size) {
            return new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    public Object remove(int index) {
        if (index >= size) {
            return new IndexOutOfBoundsException();
        }
        int newSize;
        Object removeValue = elements[index];
        if ((newSize = size - 1) > index)
            System.arraycopy(elements, index + 1, elements, index, newSize - index);
        size--;
        return removeValue;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        Object[] newElements = new Object[capacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public int size() {
        return size;
    }

    public static void sortBubble(List<Integer> list) {
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                } flag = false;
            }
        }
    }
}
