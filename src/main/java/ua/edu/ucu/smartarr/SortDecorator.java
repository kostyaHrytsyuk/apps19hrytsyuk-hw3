package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator comparator) {
        super(smartArray);
        this.setSmartArray(proceed(comparator));
    }

    private SmartArray proceed(MyComparator comparator) {
        System.out.println(operationDescription());
        return new BaseArray(Arrays.stream(this.getSmartArray().toArray()).sorted(comparator).toArray());
    }

    @Override
    public Object[] toArray() {
        return this.getSmartArray().toArray();
    }

    @Override
    public String operationDescription() {
        return "Sorting";
    }

    @Override
    public int size() {
        return 0;
    }
}
