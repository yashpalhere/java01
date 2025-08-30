
interface MyCamera{
    void takesnap() ;
    void recordvideo() ;
    default void record4k(){
        greet();
        System.out.println("recordin in 4k");
    }
    private void greet(){
        System.out.println("good morning");
    }
}
interface MyWifi{
    String[] getnetworks();
    void connecttonetwork(String network);


}
class MySmartphone implements MyCamera,MyWifi {

    public void takesnap(){
        System.out.println("taking snap");
    }

    public void recordvideo(){
        System.out.println("recoring video");
    }
    public String[] getnetworks(){
        System.out.println("getting networks");
        String networklist[]= {"harry","yash","sania"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connnecting to "+ network);
    }
}

public class polymorphism_in_java {
    public static void main(String[] args) {
//        MySmartphone samsung= new MySmartphone();
//        samsung.takesnap();
//        samsung.recordvideo();
//        String[] ar= samsung.getnetworks();
//        for (String item: ar){
//            System.out.println("\t"+item);
//        }
//        samsung.connecttonetwork("yash");
//        samsung.record4k();

          MyCamera cam1= new MySmartphone();
//          cam1.getnetwork(); --> not allowed
        cam1.record4k();
    }
}
