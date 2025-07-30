import java.util.Scanner;
public class practise_set04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the marks of sub1: ");
//        float mark1= sc.nextFloat();
//
//        System.out.println("Enter the marks of sub2: ");
//        float mark2= sc.nextFloat();
//
//        System.out.println("Enter the marks of sub3: ");
//        float mark3= sc.nextFloat();
//
//        float prcnt = (mark1+ mark2+mark3)/300*100;
//        if(mark1>100 || mark2>100 ||mark3>100){
//            System.out.println("Please enter valid marks :(");
//        }
//        else if(prcnt>=33.0f) {
//            if (mark1 >= 33.00f && mark2 >= 33.00f && mark3 >= 33.0f) {
//                System.out.println("Student is passed in each subject with a total percentage of: " + prcnt);
//            } else {
//                System.out.println("Student failed in one subject :( \nTotal percentage scored are: "+ prcnt);
//
//            }
//        }
//        else{
//                System.out.println("Student failed to achieve overall 33% criteria :( ");
//        }

//
//        System.out.println("Enter your income (in lacs): ");
//        float income= sc.nextFloat();
//        float tax=0.0f;
//        if (income<2.5f){
//            System.out.println("No tax to be paid...");
//        }
//        else if (income>=2.5f && income<5.0f){
//            tax = 0.05f*income;
//            System.out.println("THe tax amount that should be paid is: "+tax+" lacs");
//        }
//        else if (income>=5.0f && income<10.0f){
//            tax = 0.2f*income;
//            System.out.println("THe tax amount that should be paid is: "+tax+" lacs");
//        }
//        else{
//            tax = 0.3f*income;
//            System.out.println("THe tax amount that should be paid is: "+tax+" lacs");
//        }

        System.out.println("Enter the url: ");
        String st= sc.nextLine();
        if(st.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(st.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if(st.endsWith(".in")){
            System.out.println("Indian website");
        }
    }
}
