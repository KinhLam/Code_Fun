import java.util.Scanner;

public class Chuoi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        
        
        scan.nextLine();//Khi chuyển đổi giữa các dòng mã lệnh như từ kiểu số sang kiểu chữ thì thêm dòng lệnh này
        String s = scan.nextLine();
        
        
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}