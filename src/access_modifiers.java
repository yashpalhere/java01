class myemployee{
    private int id;
    private String name;
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public void setName(String st){
        name = st;
    }
    public  void setId(int i){
        id = i;
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        myemployee harry = new myemployee();
//        harry.id=12;
//        harry.name="yashpal";

        harry.setId(5);
        harry.setName("Yashpal");
        System.out.println(harry.getid());
        System.out.println(harry.getname());
    }
}
