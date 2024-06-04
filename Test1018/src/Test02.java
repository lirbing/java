import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        double a=1.0;
        double b=3.0;
        double c=-4.0;
        System.out.println(Math.sqrt(2));
        double m=Math.sqrt(b*b-4*a*c);
        double r1=(-b+m)/2*a;
        double r2=(-b-m)/2*a;
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println(r1==1&& r2==-4?"OK":"NG");

        double d1=0.0/0;
        double d2=1.0/0;
        double d3=-1.0/0;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        int age = 7;
        boolean isPrimaryStudent = age>=6 && age<=12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");

        String s="hello";
        String t= s;
        s="world";
        System.out.println("t = " + t);

        int n1='A';
        System.out.println("n1 = " + n1);
        int n2='中';
        System.out.println("n2 = " + n2);

        char c3 = '\u0041';
        System.out.println("c3 = " + c3);

    }
}
