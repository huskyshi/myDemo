import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalenndarDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
//        System.out.println(month);
//        System.out.println(localDate.minusDays(day - 1));
        localDate = localDate.minusDays(day - 1); // 获取当月第一天2020-03-01
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int value = dayOfWeek.getValue(); //获取是星期几

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (localDate.getMonthValue() == month) {
            System.out.printf("%3d", localDate.getDayOfMonth());
            if (localDate.getDayOfMonth() == day) {
                System.out.print("*"); // 如果是当天，日期后面用*标示
            } else {
                System.out.print(" ");
            }
            // 加1天
            localDate = localDate.plusDays(1);
            // 判断最后一天是否是星期一，如果是，换行
            if (localDate.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        // 判断最后一天是否是星期一，如果不是，换行
        if (localDate.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }

    }
}
