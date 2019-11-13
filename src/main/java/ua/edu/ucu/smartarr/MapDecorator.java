package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Mapping";
    }

    @Override
    public int size() {
        return super.size();
    }
}
