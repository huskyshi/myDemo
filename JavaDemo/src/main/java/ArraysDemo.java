import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, 0, 2, 4));
        Arrays.fill(a, 3);
        System.out.println(Arrays.toString(a));

        String[] s = new String[]{"aa", "bbb", "c", "d"};
        for (String ss : s) {
            System.out.println(ss);
        }

        int[][] n = new int[][]{{1, 2, 3, 4}, {6, 8, 9}, {11, 222, 33}};
        int num = 0;
        for (int[] m : n) {
            for (int i : m) {
                num = num + i;
            }
        }
        System.out.println(num);

    }
}
