package BT4_VongLapFor_Array;

public class SoChan {
    public static void main(String[] args) {
        int mang[] = new int[50];
        int soChan = 0 ;
        System.out.println("Các số chẵn từ 0 đến 50 là: ");
        for (int i = 0; i <= 50;  i = i + 2  ) {
            if (i %  2 == 0) {
                System.out.println(i);
                mang[soChan] = i;
                soChan++;
            }
        }
        // Duyệt mảng
        System.out.println("Duyệt mảng: ");
        for (int i : mang) {
            System.out.println(i);
        }
    }
}
