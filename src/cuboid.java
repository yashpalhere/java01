import java.util.Scanner;
class Cuboidcal{
        public float sarea(float l, float b,float h) {
             return (2*(l*b+b*h+l*h));
        }
        public float Vol(float l, float b,float h) {
            return (l*b*h);
    }
}
public class cuboid {
    public static void main(String[] args) {
        float l;
        float b;
        float h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of cuboid(in cm): ");
        l= sc.nextFloat();
        System.out.println("Enter Width of cuboid(in cm): ");
        b= sc.nextFloat();
        System.out.println("Enter Height of cuboid(in cm): ");
        h= sc.nextFloat();
        Cuboidcal obj= new Cuboidcal();
        System.out.println(obj.sarea(l,b,h)+ " square units");
        System.out.println(obj.Vol(l,b,h)+ " square units");

    }
}

