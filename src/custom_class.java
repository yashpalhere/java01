class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is :"+id);
        System.out.println("my name is :"+name);
    }
}
public class custom_class {
    public static void main(String[] args) {
        employee harry= new employee();
        employee john = new employee();
        // setting attributes
        harry.id=45;
        john.id=13;
        harry.name="yashpal";
        john.name="jayesh";
        //printing the atttributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);

        //callinig printdetails function in class employee

        harry.printdetails();
        john.printdetails();

    }
}
