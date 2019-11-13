package ua.edu.ucu.smartarr;

import java.util.Arrays;
import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        this.smartArray = proceed(predicate);
    }

    private SmartArray proceed(MyPredicate predicate) {
        System.out.println(operationDescription());
        return new BaseArray(Arrays.stream(this.smartArray.toArray()).filter(predicate::test).toArray());
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Filtering";
    }

    @Override
    public int size() {
        return super.size();
    }
}
