import javax.crypto.spec.PSource;

public class method_overloading {
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int a){
        System.out.println("good morning "+a);
    }

    static void dumb(int a){
        a=54;
    }
    static void telljoke(){
        System.out.println("joke");
    }
    static void change(int arr[]){
        arr[1]=68;
    }

    public static void main(String[] args) {
//        telljoke();
//    int x=45;
//    dumb(x);
//        System.out.println(x);

//        int marks[]={1,75,41,87,56,17,55};
//        change(marks);
//        System.out.println(marks[1]);


        //method overloading

        foo();
        foo(300);
    }

}
