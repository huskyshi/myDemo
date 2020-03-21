import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String s = "abcabd";
        System.out.println(s.compareTo("abc"));
        System.out.println(s.compareTo("Abc"));
        System.out.println(s.equals("abcabd"));
        System.out.println(s.equalsIgnoreCase("Abc"));
        System.out.println(s.indexOf("a"));
        System.out.println(s.indexOf("c", 2));
        System.out.println(s.lastIndexOf("d", 1));

        int i = 1;
        i *= 0.1;// 注意，扩展运算等于i =(int)i * 0.1  ,会有强制转换
        System.out.println(i);
        i++;
        System.out.println(i);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("2");
        stringBuilder.append("c");
        stringBuilder.append("d");
        stringBuilder.delete(1, 2);
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.length());

        Scanner scanner = new Scanner(System.in);
        System.out.println("what's your name?");
        System.out.println(scanner.nextLine());

        System.out.println("how old are you?");
        System.out.println(scanner.nextInt());
    }
}
