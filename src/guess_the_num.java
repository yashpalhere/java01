import java.util.Scanner;
import java.util.Random;
class game{
    Scanner sc=new Scanner(System.in);
    Random rn=new Random();
    int userinput;
    int randomnum;
    public game(){
        randomnum=rn.nextInt(101);
        System.out.println("The computer choose its num now its your turn\nRemember you have only 10 choices \nGood luck");
        System.out.println(randomnum);
    }
    public int takeuserinput(){
        System.out.println("Enter the number: ");
        userinput= sc.nextInt();
        return userinput;
    }
    public boolean iscorrectnum(){
        boolean ans;
        if (userinput==randomnum){
            ans=true;
        }
        else if (userinput<randomnum){
            ans=false;
            System.out.println("You guessed smaller number.....");

        }
        else {
            ans=false;
            System.out.println("You guessed bigger number.....");
        }
        return ans;
    }
}
public class guess_the_num {
    public static void main(String[] args) {
        System.out.println("The Game starts......\n");
        game user=new game();
        int score=0;
        int tries=0;
        for (int i=1;i<101;i++){
            user.takeuserinput();
            boolean answer=user.iscorrectnum();
            score=score+1;
            if (answer==false){
//                System.out.println("Wrong guess.... try again");
            }
            else if(answer==true){
                System.out.println("Yayyyy you guessed it...."+"\nScore:"+score+"\nGame over....");

                break;
            }
            tries=tries+1;
            if (tries==100){
                System.out.println("Oops.. you are out of tries..");
                break;
            }
        }

    }
}
