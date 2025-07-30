class One{
    public void greet(){
        System.out.println("Good Morning!");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class Two extends One{
    @Override
    public void name(){
        System.out.println("My name is java inn class two");
    }
    public void swagat(){
        System.out.println("aapka welcome h");
    }
}
public class dynamic_mathod_dispatch {
    public static void main(String[] args) {
//        One obj = new One();
//        Two obj2= new Two();
//        obj.name();

        One obj= new Two(); //superclass refrence can be equal to subclass object but not vice versa
//        Two obj2= new One(); // Throws an error
        obj.greet();
        obj.name();
//        obj.swagat;//error
    }
}
