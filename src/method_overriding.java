class A{
    public int harry(){
        System.out.println("harry");
        return 4;
    }
    public void meth2(){
        System.out.println("I'm am method 2 of class A");
    }
}
class B extends A{

    @Override
    public void meth2(){
        System.out.println("I'm am method 2 of class B");
    }
    public void meth2(int x){
        System.out.println("I'm am method 2 of class B");
    }
    public void methb(){
        System.out.println("I'm am method b of class b");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a= new A();
        a.meth2();
        B b= new B();
        b.meth2();
        b.meth2(5 );
    }
}
