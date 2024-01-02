package BT3_Ifelse;

public class OnTap {
    public static void check(int n){
        int number = 100;
        if (n > number){
            System.out.println("n lon hon " +number);
        } else if (n<number){
            System.out.println("n nho hon " +number);
        }else {
            System.out.println("n bang " +number);
        }
    }
    public static void main(String[] args) {
        int a = 28;
        int b = 30;
        int c = 10;
        int d = 10;
        String name = "Tien";
        String diaChi = "Gia Lai";


        //Toán tử số học
        System.out.println("Toan tu so hoc : ");
        System.out.println(a %= 5);
        System.out.println(--b);

        // Toán tử quan hệ
        System.out.println("Toan tu quan he: ");
        System.out.println(name == "Tien");
        System.out.println(diaChi != "Da Nang");
        System.out.println(a >= b);

        // Toán tử logic
        System.out.println("Toan tu logic: ");
        System.out.println((b >= 30) && name != "Dung");
        System.out.println((name == "Tien") || b < 30);

        // Toán từ điều kiện
        System.out.println("Toan tu dieu kien: ");
        String p = (c - d == 0) ? " c tru cho d" : " d tru cho c";
        System.out.println(p);

        // Toán tử gán
        int x, y, z;
        x = y = z = 15;
        System.out.println("Toan tu gan: ");
        System.out.println(x + y + z);

        //Điều kiện if else
        System.out.println("Toan tu dieu kien: ");
        check(101);

    }
}
