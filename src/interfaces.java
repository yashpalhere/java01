interface bycycle{
    int a = 45;
    void applybrake(int decrement);
    void applyrace(int increment);
}

class avoncycle implements bycycle{
    int speed=4;


    public void applybrake(int decrement) {
        speed= speed-decrement;
        System.out.println(speed);
    }

    @Override
    public void applyrace(int increment) {
        speed=speed+increment;
        System.out.println(speed);
    }
}

public class interfaces {
    public static void main(String[] args) {
        avoncycle c1= new avoncycle();
        c1.applybrake(2 );
        c1.applyrace(4  );
        System.out.println(avoncycle.a);
    }
}
