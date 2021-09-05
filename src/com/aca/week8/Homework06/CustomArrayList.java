package com.aca.week8.Homework06;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;

public class CustomArrayList<T extends Comparable<T>> {

    private int size = 0;
    private static int capacity = 2;
    private static final int MAX_CAPACITY = 3000;
    private T data[];
    Class<T> c;

    public T[] getData() {
        return data;
    }

    public CustomArrayList(Class<T> c) {
        this(c, capacity);
    }

    public CustomArrayList(Class<T> c, int capacity) {
        data = (T[]) Array.newInstance(c, capacity);
        this.c = c;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int i) throws IndexOutOfBoundsException {

        checkIndexRange(i);
        return data[i];
    }

    private void checkIndexRange(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Illegal index: " + index);
        }
    }

    private void checkArrayCapacity() {

        if(capacity >= MAX_CAPACITY) {
            throw new ArrayIndexOutOfBoundsException("Capacity is reached to the maximum. " +
                    "Cannot add any more elements into the CustomArrayList.");
        }
    }

    private void checkArrayResize() {
        if(size >= capacity) {
            resizeArray();
        }
    }

    private void resizeArray() {

        capacity = capacity * 2;
        T tempArr[] = (T[]) Array.newInstance(c, capacity);

        for (int i = 0; i < size; i++) {
            tempArr[i] = data[i];
        }
        data = tempArr;
    }

    public void addAtBeginning(T element) {

        checkArrayCapacity();
        checkArrayResize();

        T tempArr[] = (T[]) Array.newInstance(c, capacity);

        tempArr[0] = element;
        int index = 0;
        for (int i = 1; i < size + 1; i++) {
            tempArr[i] = data[index];
            index++;
        }

        size++;
        data = tempArr;

    }

    public void addAtEnd(T element) {

        checkArrayCapacity();

        checkArrayResize();

        T tempArr[] = (T[]) Array.newInstance(c, capacity);
        for (int i = 0; i < size; i++) {
            tempArr[i] = data[i];
        }

        tempArr[size] = element;
        size++;
        data = tempArr;

    }

    public void addAtGivenIndex(T element, int index) {
        checkIndexRange(index);
        checkArrayCapacity();
        checkArrayResize();

        if(index == 0) {
            addAtBeginning(element);
            return;
        }

        T tempArr[] = (T[]) Array.newInstance(c, capacity);
        boolean flag = false;

        for (int i = 0; i < size + 1; i++) {
            if(i == index) {
                tempArr[i] = element;
                flag = true;
            }
            if(!flag) {
                tempArr[i] = data[i];
            }
            else {
                tempArr[i] = data[i - 1];
            }
        }
        size++;
        data = tempArr;
    }

    public void delete(T element) {
        int index = -1;
        // find and delete element at current index
        for (int i = 0; i < size; i++) {
            if(data[i].equals(element)) {
                data[i] = null;
                index = i;
                break;
            }
        }

        if(index == -1) {
            throw new InvalidParameterException("No element: " + element + " found to delete");
        }

        checkIndexRange(index);

        // shift the rest of the array
        for (int i = index; i + 1 < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void remove(int index) {

        checkIndexRange(index);

        data[index] = null;

        // shift the rest of the array
        for (int i = index; i + 1 < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public int search(T element) {
        for (int i = 0; i < size; i++) {
            if(data[i].equals(element)) {
               return i;
            }
        }
        return -1;
    }

    private void swap(int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void bubbleSort() {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                SortClass<T> s = new SortClass<T>();
                if(s.compare(data[j], data[i]) < 0) {
                    swap(i, j);
                }
            }
        }

        System.out.println((System.currentTimeMillis() - startTime) + " milli seconds bubbleSort execution");

    }

    public void quickSortIterative()
    {
        long startTime = System.currentTimeMillis();
        int l = 0;
        int h = size - 1;
        int[] stack = new int[h - l + 1];

        int top = -1;

        // push initial values of l and h to stack
        stack[++top] = l;
        stack[++top] = h;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            h = stack[top--];
            l = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int p = partition(data, l, h);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
        System.out.println((System.currentTimeMillis() - startTime) + " milli seconds quickSortIterative execution");
    }

    //O(n)
    public int partition(T[] arr,  int start, int end)
    {
        T pivot = arr[end];
        int pivotIndex = start;

        for(int i = start; i < end; i++)
        {
            SortClass<T> s = new SortClass<T>();

            if(s.compare(arr[i], pivot) < 0)
            {
                swap(i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(end, pivotIndex);
        return pivotIndex;
    }

    public void quickSortInPlace( T data[], int a, int b)
    {
        if (a >= b)
            return; // subarray is trivially sorted
        int left = a;
        int right = b - 1;
        T pivot = data[b]; // using last as arbitrary pivot
        T temp; // temp object used for swapping
        SortClass<T> s = new SortClass<T>();

        while (left <= right) {
            // scan until reaching value equal or larger than pivot (or right marker)
            while (left <= right && s.compare(data[left] , pivot) < 0)
                left++;
            // scan until reaching value equal or smaller than pivot (or left marker)
            while (left <= right && s.compare(data[right] , pivot) > 0)
                right--;
            if (left <= right) { // indices did not strictly cross
                // so swap values and shrink range
                temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++; right--;
            }
        } // put pivot into its final place (currently marked by left index)
        temp = data[left];
        data[left] = data[b];
        data[b] = temp;
        // make recursive calls quickSortInPlace(S, a, left - 1);
        quickSortInPlace(data, left + 1, b);
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
