package BT5_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ThongTinNhanVien {
    public void showInfor() {
        Map<String, String> nhanVien = new HashMap<>();
        // Thêm giá trị key - value vào hashMap
        nhanVien.put("Ho Va Ten", "Nguyen Anh Tien");
        nhanVien.put("Tuoi", "23");
        nhanVien.put("Dia Chi", "Da Nang");

        //Cách 1: dùng vòng lặp for để in ra thông tin nhân viên trên
        for (Map.Entry<String, String> item : nhanVien.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
        System.out.println("----------");

        //Cách 2: dùng vòng lặp for để in ra thông tin nhân viên trên
        Set<String> keySet = nhanVien.keySet();
        for (String key: keySet) {
            System.out.println(key + " - " + nhanVien.get(key));
        }

    }

    public static void main(String[] args) {
        System.out.println("Thong tin nhan vien la: ");
        //In ra Thông tin nhân viên
        ThongTinNhanVien tt = new ThongTinNhanVien();
        tt.showInfor();
    }
}
