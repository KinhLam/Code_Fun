import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Java_Loops_I {
    public static void main(String[] args) {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int N = Integer.parseInt(bufferedReader.readLine().trim());

        // bufferedReader.close();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <=10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }

    }
}