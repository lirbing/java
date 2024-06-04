public class Test05 {
    public static void main(String[] args) {
        int  option=2 ;
        switch (option) {
            case 1:
                System.out.println("Selected 0");
                break;
            case 2:
            case 3:
                System.out.println("Selected2,3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }
}
