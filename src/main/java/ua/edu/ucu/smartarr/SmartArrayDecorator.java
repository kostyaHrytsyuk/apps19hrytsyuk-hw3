package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    public SmartArray getSmartArray() {
        return smartArray;
    }

    public void setSmartArray(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    private SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }



    @Override
    public int size() {
        return this.smartArray.size();
    }

}
