
//q1
//abstract class Pen{
//    abstract void write() ;
//    abstract void refill() ;
//}
//class natrajpen extends Pen{
//    void write(){
//        System.out.println("writing");
//    }
//    void refill(){
//        System.out.println("refilling");
//    }
//    public void chnagenib(){
//        System.out.println("nib chnaged");
//    }
//}

//q2

class Monkey{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void jump(){
        System.out.println("jumping");
    }
}
class Human extends Monkey{
    public void hunting(){
        System.out.println("hunting");
    }
}


public class practise_set_interface_abstractclass {
    public static void main(String[] args) {
        //q1
//        natrajpen penone=new natrajpen();
//        penone.refill();

        //q2
        Human yash= new Human();
        yash.eat();
        yash.sleep();
        yash.jump();


    }
}
