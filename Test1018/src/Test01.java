import java.util.Scanner;

public class Test01 {

    static int a=110;

    public static void main(String[] args) {
        int num=1000;
        byte b10=(byte)num;
        System.out.println("b10 = " + b10);

        Integer a=0x123456;
        System.out.println("a = " + a);
        Integer b=0712;
        System.out.println("b = " + b);
        Integer c=0b11110;
        System.out.println("c = " + c);

        System.out.println(+10);
        int i=+11;
        int j=10;
        int k=i+j;
        System.out.println("k = " + k);
        System.out.println(i+j);
        System.out.println(i+j+"i+j = " + i+j);
        System.out.println(i+j+"i+j = " + (i+j));

        System.out.println(Character.MIN_VALUE);

        int m=10;
        int n=10;
        int x=++m;
        int y=n++;
        int z=n++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
