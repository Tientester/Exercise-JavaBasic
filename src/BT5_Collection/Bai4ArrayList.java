package BT5_Collection;

import java.util.ArrayList;
import java.util.List;

public class Bai4ArrayList {
    public static void main(String[] args) {
        //So chan
        List<Integer> listSoChan = new ArrayList<Integer>();

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                listSoChan.add(i);
            }
        }
        System.out.println("Mang so chan dung ArrayList: ");
        for (int i : listSoChan) {
            System.out.println(i);

        }

    }
}
