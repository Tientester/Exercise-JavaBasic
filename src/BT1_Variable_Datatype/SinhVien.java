package BT1_Variable_Datatype;

public class SinhVien {
    String ten = "Tien";   //Biến instance
    static int tuoi = 23;          //Biến static

    public void liLich() {
        String diaChi = "Gia Lai";   // Biến local
        System.out.println("Ten toi la: " + ten);
        System.out.println("Toi nam nay: " + tuoi);
        System.out.println("Que quan o: " + diaChi);
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.liLich();
        ThongTin tt = new ThongTin();
        tt.name = "Dung";
        tt.address = "HaNoi";
        tt.old = 22;
        System.out.println("My name is: " + tt.name);
        System.out.println("My address is: " + tt.address);
        System.out.println("I am : " + tt.old + "years old");

    }
}
