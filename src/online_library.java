import javax.xml.transform.Source;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
class Library {
    ArrayList<String> books = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    String userchoice;

    Library() {
        books.add("Gunaaho ka devta");
        books.add("Godan");
        books.add("Nirmala");
        books.add("Suraj ka Satva Ghoda");
        books.add("Madhushala");
        int exitnum=0;
        for (int lib=1;lib>exitnum;lib++){
            exitnum=exitnum+lib;


            System.out.println("Welcome To Library:\n\tChoose an action: \n\t\tWant to add a book(type add)\n\t\tWant to borrow a book(type borrow)\n\t\tWant to return a book(type return\n\t\tWant to Exit the Library(type exit)");
            System.out.print("Type action here: ");
            userchoice = sc.nextLine();
            userchoice = userchoice.toLowerCase();


            switch (userchoice) {
                case "add":
                    System.out.println("Enter Book Name you're adding to System: ");
                    String newbook = sc.nextLine();
                    addBook(newbook);
                    System.out.println("Added..... Thanks for your contribution. we appreciate it :)");
                    System.out.println(books);
                    break;
                case "borrow":
                    showAvailableBooks();
                    System.out.println("Enter Book Name you want to borrow: ");
                    String borrowbook = sc.nextLine();
                    issueBook(borrowbook);
                    System.out.println("The book" + borrowbook + " is issued to You... Please Handle with care and return within a week\nThank You :))");
                    System.out.println(books);
                    break;
                case "return":
                    System.out.println("Enter Book Name you want to return: ");
                    String returnbook = sc.nextLine();
                    addBook(returnbook);
                    System.out.println("The book" + returnbook + " is collected. \nThank You :))");
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Enter Valid Operation :(");
            }
        }
    }

    public void showAvailableBooks() {
        for (String i : books) {
            System.out.println(i);
        }

    }

    public void addBook(String newbook) {
        books.add(newbook);
    }

    public void issueBook(String borrowbook) {
        books.remove(borrowbook);
    }

}
public class online_library {
    public static void main(String[] args) {
        Library person= new Library();
        System.out.println();
    }
}
