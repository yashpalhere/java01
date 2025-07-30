import java.util.Scanner;

public class input {
    public static void main(String[] args) {
    Scanner stdid =new Scanner(System.in);
    System.out.println("Enter ID: ");
    int a= stdid.nextInt();


    Scanner stdname = new Scanner(System.in);
    System.out.println("Enter Student Name: ");
    String Name = stdname.nextLine();

    Scanner stdprcnt = new Scanner(System.in);
    System.out.println("Enter Student percent: ");
    float b=stdprcnt.nextFloat();


    System.out.println("Student ID is: "+a);
        System.out.println("Name of Student is: "+Name);
    System.out.println("Percent scored by Student are: "+b);
    if(b<33.0){
        System.out.println("Student Failed :(");
    }
    else{
            System.out.println("Passed :)");
        }

    }
}
