import java.util.Scanner;

public class intornot {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //int number= num.nextInt();
        boolean boo=num.hasNextInt();
        System.out.println(boo);
    }
}
