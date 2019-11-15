package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        this.smartArray = proceed(function);
    }

    private SmartArray proceed(MyFunction function){
        System.out.println(operationDescription());
        return new BaseArray(Arrays.stream(this.smartArray.toArray()).map(function::apply).toArray());
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
