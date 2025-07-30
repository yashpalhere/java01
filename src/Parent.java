public class Parent {
    public int a= 5;
    protected void display(){
        System.out.println("This is parent class methods");
    }
    static class Child extends Parent{
        int xyz=651;
        public void show(){
            System.out.println("this is child class");
        }
    }

    public static void main(String[] args) {
        Child object= new Child();
        object.display();
    }
}

