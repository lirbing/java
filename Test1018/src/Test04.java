import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //*请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），
        // 然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。

        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入上次的考试成绩:");
        int result1= scanner.nextInt();
        System.out.print("请输入本次的考试成绩:");
        int result2=scanner.nextInt();
        double d= (double)(result2-result1)/result1*100;
        System.out.printf("成绩提高的百分比为:"+"%.2f%%",d);
    }
}
