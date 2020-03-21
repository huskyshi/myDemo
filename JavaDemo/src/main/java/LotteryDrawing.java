import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("你要抽取的池子深度：");
        int j = in.nextInt();

        System.out.println("你要抽取的次数：");
        int k = in.nextInt();

        // 创建抽奖池
        int[] m = new int[j];
        for (int i = 0; i < m.length; i++) {
            m[i] = i;
        }

        // 创建中奖池
        int[] result = new int[k];
        // 开始抽奖
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * k); // 抽取0~k-1之间的数作为下标

            result[i] = m[r];  // 抽中的数字存入中奖池

            System.out.println(m[r]);
            m[r] = m[j - 1];
            System.out.println(Arrays.toString(m));

            k--;  // 抽奖次数递减
        }
        // 中奖结果排序
        Arrays.sort(result);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
