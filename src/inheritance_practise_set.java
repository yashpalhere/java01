class circle{
    float radius=7;
    public double area(float rad){
        radius=rad;
        return (Math.PI)*(radius*radius);
    }
}
class Cylinder extends circle{
    public double vol( float height){
        return (Math.PI)*(radius*radius)*(height);
    }
}

public class inheritance_practise_set {
    public static void main(String[] args) {
        circle c1= new Cylinder();
        System.out.println(c1.area(7));
        Cylinder c2= new Cylinder();
        System.out.println((c2.vol(2)));

    }
}
