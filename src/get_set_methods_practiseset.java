//quiz 01
//class cylinder{
//    float rad;
//    float height;
//
//    public void setHeight(float height) {
//        this.height = height;
//    }
//    public void setRad(float rad){
//        this.rad=rad;
//    }
//    public float getHeight(){
//        return height;
//    }
//
//    public float getRad() {
//        return rad;
//    }
//    public double vol(){
//        return ((Math.PI)*(rad*rad)*height);
//    }
//    public double sarea(){
//        return (2*(Math.PI)*rad*(rad+height)); //2πr(r + h)
//    }
//}

    //quiz02

    class cylinder{
    public cylinder(double height, double rad){
        double sarea=(2*(Math.PI)*rad*(rad+height));
        double vol= ((Math.PI)*(rad*rad)*height);
        System.out.println("The volume is: "+vol);
        System.out.println("The surface area is: "+sarea);
    }

    }
public class get_set_methods_practiseset {
    public static void main(String[] args) {
        //QUIZ 01
//        cylinder obj= new cylinder();
//        obj.setHeight(2.0f);
//        obj.setRad(0.5f);
//        System.out.println(obj.getHeight());
//        System.out.println(obj.getRad());
//        System.out.println(obj.vol());
//        System.out.println(obj.sarea());


        //quiz 02
        cylinder b1=new cylinder(5,2);

    }
}
