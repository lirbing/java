public class Test03 {
    public static void main(String[] args) {

        int a = 72;
        char a1=(char)a;
        int b = 105;
        char b1=(char)b;
        int c = 65281;
        char c1=(char)c;
        String s=""+a1+b1+c1;
        System.out.println("s = " + s);
        String s1 = "\u0048"+"\u0069"+"\uff01";
        System.out.println("s1 = " + s1);

        int []ns = new int [3];
        int n=2;
        System.out.println(ns[n]);


        String[] names = {"ABC", "XYZ", "zoo"};
        String s2 = names[1];
        names[1] = "cat";
        System.out.println(s2);


    }
}
