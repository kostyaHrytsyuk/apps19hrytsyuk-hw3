package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        this.setSmartArray(proceed());
    }

    private SmartArray proceed() {
        System.out.println(operationDescription());
        return new BaseArray(Arrays.stream(this.getSmartArray().toArray()).distinct().toArray());
    }

    @Override
    public Object[] toArray() {
        return this.getSmartArray().toArray();
    }

    @Override
    public String operationDescription() {
        return "Distinction";
    }
}
