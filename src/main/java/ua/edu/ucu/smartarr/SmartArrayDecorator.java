package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    private SmartArray smartArray;

    public SmartArrayDecorator(SmartArray incomeSmartArray) {
        this.smartArray = incomeSmartArray;
    }

    public SmartArray getSmartArray() {
        return smartArray;
    }

    public void setSmartArray(SmartArray incomeSmartArray) {
        this.smartArray = incomeSmartArray;
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }

}
