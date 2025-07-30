import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
         //Switch casse is used to give choices to user

        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to become an adult ");
            case 21 -> System.out.println("You are going to join a job ");
            case 60 -> System.out.println("You are going to retire ");
            default -> System.out.println("Enjoy your life lil bro ...");
        }



    }
}
