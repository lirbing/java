public class Test08 {
    public static void main(String[] args) {
        Person p = new Person();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 15还是20?

        int x = 10;

        do{
            System.out.print("value of x : " + x );
            x--;
            System.out.print("\n");
        }while( x < 20 );

    }
}
