
import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("For User one:\n\tRock: Enter R or r\n\tPaper: Enter P or p\n\tScissors: Enter S or s \nChoose one of above: ");
        String userone= sc.next();
        userone=userone.toLowerCase();
        System.out.print("For User two:\n\tRock: Enter R or r\n\tPaper: Enter P or p\n\tScissors: Enter S or s \nChoose one of above: ");
        String usertwo=sc.next();
        usertwo=usertwo.toLowerCase();

        switch (userone){
            case "r":
                if (usertwo.equals("p")){
                    System.out.println("User Two wins.... Paper covers Rock\nGame over");
                }
                else if (usertwo.equals("s")){
                    System.out.println("User One wins... Rock breaks Scissor\nGame over");
                }
                else {
                    System.out.println("Enter a valid choice :(");
                }
                break;
            case "p":
                if (usertwo.equals("r")){
                    System.out.println("User One wins.... Paper covers Rock\nGame over");
                }
                else if (usertwo.equals("s")){
                    System.out.println("User two wins... Scissor cuts paper\nGame over");
                }
                else {
                    System.out.println("Enter a valid choice :(");
                }
                break;
            case "s":
                if (usertwo.equals("p")){
                    System.out.println("User One wins.... Scissor cuts paper\nGame over");
                }
                else if (usertwo.equals("r")){
                    System.out.println("User Two wins... Rock breaks Scissor\nGame over");
                }
                else {
                    System.out.println("Enter a valid choice :(");
                }
                break;


        }
    }
}
