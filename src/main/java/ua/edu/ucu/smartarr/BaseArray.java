package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {

    private Object[] innerArray;

    public BaseArray(Object[] arr) {
        this.innerArray = Arrays.copyOf(arr, arr.length);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(innerArray, innerArray.length);
    }

    @Override
    public String operationDescription() {
        return "Base Array";
    }

    @Override
    public int size() {
        return innerArray.length;
    }
}
