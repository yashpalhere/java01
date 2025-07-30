import java.util.Scanner;

public class quiz1_cbseboard {
    public static void main(String[] args) {
        Scanner sub1=new Scanner(System.in);
        System.out.println("Enter marks of subject 1: ");
        int mark1 = sub1.nextInt();

        Scanner sub2=new Scanner(System.in);
        System.out.println("Enter marks of subject 2: ");
        int mark2 = sub2.nextInt();

        Scanner sub3=new Scanner(System.in);
        System.out.println("Enter marks of subject 3: ");
        int mark3 = sub3.nextInt();

        Scanner sub4=new Scanner(System.in);
        System.out.println("Enter marks of subject 4: ");
        int mark4 = sub4.nextInt();

        Scanner sub5=new Scanner(System.in);
        System.out.println("Enter marks of subject 5: ");
        int mark5 = sub5.nextInt();

        int prcnt= (((mark1+mark2+mark3+mark4+mark5)/5) );
        if(prcnt<=100) {
            System.out.println("The percentage of student are: " + prcnt);
        }
        else{
            System.out.println("Enter Valid Scores Please :(");
        }
    }
}
