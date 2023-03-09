import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_of_File {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while (sc.hasNext()) {
            System.out.println(++line_num + " " + sc.nextLine());
        }
        sc.close();
    }
}

//Hiểu nôm na là đoạn code trên sẽ hiển thị thêm số dòng ở từng đoạn nhập 
//Có thể tự tìm hiểu thêm về hasNext() 