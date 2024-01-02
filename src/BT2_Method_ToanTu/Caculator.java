package BT2_Method_ToanTu;

public class Caculator {
    int a, b;
    double c, d;
    public void displaySum(){
        int a = 10; int b = 50;
        System.out.println(a + b);

    }
    public void displayMultiply(double c, double d) {
        System.out.println(c * d);
    }

    public static void main(String[] args) {
        Caculator cc1 = new Caculator();
        Caculator cc2 = new Caculator();
        cc1.displaySum();
        cc2.displayMultiply(8.5, 9.2);

    }
}
