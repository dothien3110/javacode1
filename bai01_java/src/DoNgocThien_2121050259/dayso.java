package DoNgocThien_2121050259;

import java.util.ArrayList;
import java.util.Scanner;

public class dayso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dayso = new ArrayList<>();
        int tong = 0;

        // Nhập dãy số cho đến khi tổng lớn hơn 2018
        while (tong <= 2018) {
            System.out.print("Nhap mot so nguyen: ");
            int so = scanner.nextInt();
            dayso.add(so);
            tong += so;
        }

        // a. Tính tổng các số dương chia hết cho 3
        int tongso_chiahetcho_3 = 0;
        for (int so: dayso) {
            if (so > 0 && so % 3 == 0) {
                tongso_chiahetcho_3 += so;
            }
        }
        System.out.println("Tong cac so chia het cho 3: " + tongso_chiahetcho_3);

        // b. Tính trung bình cộng của các số đã nhập
        double trungbinhcong = tong / (double) dayso.size();
        System.out.println("Trung binh cong cac so da nhap la: " + trungbinhcong);
        scanner.close();
    }
}
