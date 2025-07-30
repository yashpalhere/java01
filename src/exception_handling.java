public class exception_handling {
    public static void main(String[] args) {
        int a=10;
        int b=0;
//        int c=a/b;
        try {
            int c=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Invalid Denominator !");
        }
        finally {
            System.out.println("Exception handling ");
        }

    }
}
