package Jeneric;

public class Test <X, Y> {
    public X data1;
    public Y data2;
    public Test(X data1, Y data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public X getData1() {
        return data1;
    }

    public void setData1(X data1) {
        this.data1 = data1;
    }

    public Y getData2() {
        return data2;
    }

    public void setData2(Y data2) {
        this.data2 = data2;
    }
}
