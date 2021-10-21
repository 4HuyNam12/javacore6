import java.util.Scanner;

public class TBC {
    static void xepLoai() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm toán của học sinh A");
        float maths = sc.nextFloat();
        System.out.println("Nhập vào điểm văn của học sinh A");
        float literature = sc.nextFloat();
        System.out.println("Nhập vào điểm lý của học sinh A");
        float physics = sc.nextFloat();
        System.out.println("Nhập vào điểm hóa của học sinh A");
        float chemistry = sc.nextFloat();
        float tbc = (maths + literature + physics + chemistry) / 4;

        if (tbc < 4.5) {
            System.out.println("Học sinh A xếp loại học lực yếu");
        } else if (tbc >= 4.5 && tbc < 6.5) {
            System.out.println("Học sinh A xếp loại học lực trung bình");
        } else if (tbc >= 6.5 && tbc < 8.0) {
            System.out.println("Học sinh A xếp loại học lực khá");
        } else if (tbc >= 8.0 && tbc <= 10.0) {
            System.out.println("Học sinh A xếp loại học lực giỏi");
        } else {
            System.out.println("Bạn đã nhập sai số điểm của môn học (yêu cầu từ 0 đến 10 )");
        }
    }
}
