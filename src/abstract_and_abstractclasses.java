abstract class base2{
    base2(){
        System.out.println("base 2 ka constructor hoon");
    }
    public void sayhello(){
        System.out.println("Hell0");
    }
    abstract public void greet();
}
class base3 extends base2{
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}
abstract class base4 extends base2{
    public void tha(){
        System.out.println("i am good");
    }
}
public class abstract_and_abstractclasses {
    public static void main(String[] args) {
            base3 base = new base3();
    }
}
