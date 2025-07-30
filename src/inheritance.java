class Base{
    Base(){
        System.out.println("I'm a constructor of base class");
    }
    Base(int a){
        System.out.println("I am a overloaded base class constructor");
    }
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    Derived(){
        super(5);
        System.out.println("I'm a constructor of derived class");
    }
    Derived(int b){
        System.out.println("I'm a overlaoded constructor of derived class");
    }
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}
public class inheritance {
    public static void main(String[] args) {

        Base b= new Base();
        b.setX(5);
        System.out.println(b.getX());
        Base c= new Base(5);

        Derived d= new Derived();
        d.setX(65);
        System.out.println(d.getX());
        d.setY(12);
        System.out.println(d.getY());
        Derived a= new Derived(5);
    }
}
