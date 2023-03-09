//Đề bài: Chúng tôi sử dụng các số nguyên a, b và n để tạo chuỗi sau:
//(a+2^0.b),(a+2^0.b+ 2^1.b),...,(a+2^0.b+2^1.b+...+2^n-1.b).
//Bạn được cung cấp các truy vấn ở dạng a, b, và n. Đối với mỗi truy vấn, hãy in chuỗi tương ứng với , và n các giá trị đã cho dưới dạng một dòng các số nguyên được phân tách bằng dấu cách.

import java.util.*;
import java.io.*;

public class Java_Loops_II {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        // Hàm nhập số lần truy vấn
        System.out.print("Nhap so lan truy van: ");
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            // Nhập dữ liệu
            System.out.println("Nhap a: ");
            int a = in.nextInt();

            System.out.println("Nhap b: ");
            int b = in.nextInt();

            System.out.println("Nhap c: ");
            int n = in.nextInt();

            // Hàm ktra và chạy vòng lặp chuỗi
            for (int j = 0; j < n; j++) {
                a += b;
                if (j > 0)
                    System.out.print(" ");
                    System.out.print(a);

                b = b * 2;
            }
            System.out.println("");
        }
        in.close();
    }
}