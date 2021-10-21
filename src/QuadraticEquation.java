import java.util.Scanner;

public class QuadraticEquation {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các giá trị a b c tương ứng với phương trình : ax^2 + bx +c =0 (a#0)");
        System.out.println("Nhập vào giá trị a");
        int a = sc.nextInt();
        System.out.println("Nhập vào giá trị b");
        int b = sc.nextInt();
        System.out.println("Nhập vào giá trị c");
        int c = sc.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào có dạng " + a + "x^2+" + b + "x+" + c + "=0");
        double delta, x1, x2;
        delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            x1 =(double) -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có nghiệm thứ nhất x1 = " + x1);
            System.out.println("Phương trình có nghiệm thứ nhất x2 = " + x2);
        }
    }
}
