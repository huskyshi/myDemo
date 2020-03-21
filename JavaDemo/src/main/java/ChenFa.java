import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ChenFa {
    public static void main(String[] args) {
        //九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(i + "*" + m + "=" + (i * m) + " ");
            }
            System.out.println();
        }

        String[] s = new String[9];
        for (int i = 1; i <= 9; i++) {
            String q = "";
            for (int m = 1; m <= i; m++) {
                System.out.print(i + "*" + m + "=" + (i * m) + " ");
                q = q + i + "*" + m + "=" + (i * m) + " ";
            }
            System.out.println();
            s[i - 1] = q;
        }
        for (String ss : s) {
            System.out.println(ss);
        }

        // 1-100质数
        for (int i = 1; i <= 100; i++) {
            int cnt = 0;
            for (int m = 1; m <= i; m++) {
                if (i % m == 0) {
                    cnt += 1;
                }
            }
            if (cnt == 2) {
                System.out.println(i);
            }
        }
    }
}
