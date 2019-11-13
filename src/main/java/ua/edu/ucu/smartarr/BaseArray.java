package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {

    private Object[] innerArray;

    public BaseArray(Object[] arr) {
        this.innerArray = arr;
    }

    @Override
    public Object[] toArray() {
        return innerArray;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return innerArray.length;
    }
}
