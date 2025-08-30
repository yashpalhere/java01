interface Sample{
    void meth1();
    void meth2();
}
interface ChildSample extends Sample{
//    void meth1();
//    void meth2();
    void meth3();
    void meth4();
}
class Mysampleclass implements ChildSample{
    public void meth1(){
        System.out.println("method one from Parent inheritance");
    }
    public void meth2(){
        System.out.println("method two from Parent inheritance");
    }
    public void meth3(){
        System.out.println("method three from Child inheritance");
    }
    public void meth4(){
        System.out.println("method four from Child inheritance");
    }
}

public class inheritence_in_interfaces {
    public static void main(String[] args) {
    Mysampleclass cone= new Mysampleclass();
    cone.meth1();
    cone.meth2();
    cone.meth3();
    cone.meth4();
    }
}
