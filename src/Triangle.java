import java.util.Scanner;

public class Triangle {
        static void checkTriangle(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào độ dài cạnh thứ nhất");
            int a = sc.nextInt();
            System.out.println("Nhập vào độ dài cạnh thứ hai");
            int b = sc.nextInt();
            System.out.println("Nhập vào cạnh thứ ba");
            int c = sc.nextInt();

            if (a + b > c && a + c > b && c + b > a){
                if(a*a == (b*b + c*c) || b*b == ( a*a + c*c) || c*c ==(a*a + b*b)){
                    System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác vuông");
                }else if(a==b && a==c){
                    System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác đều");
                }else if (a==b || b==c || c==a){
                    System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác cân");
                }else if(a*a >(b*b + c*c) || b*b>(a*a + c*c) || c*c >(a*a + b*b)){
                    System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác tù");
                }else
                    System.out.println("Ba cạnh bạn vừa nhập hợp thành một tam giác nhọn");
            }else{
                System.out.println("Ba cạnh bạn vừa nhập không hợp thành một tam giác");
            }
        }
    }


