import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bạn chọn 1 trong ba chương trình :");
        System.out.println("Chương trình 1 : Kiểm tra tam giác ");
        System.out.println("Chương trình 2 : Xét học lực");
        System.out.println("Chương trình 3 : Giải phương trình bậc 2");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> Triangle.checkTriangle();
            case 2 -> TBC.xepLoai();
            case 3 -> QuadraticEquation.calculate();
            default -> System.exit(0);
        }
    }
}
