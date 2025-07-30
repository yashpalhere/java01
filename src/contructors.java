class mymainemployee{
    public mymainemployee(){
        id=45;
        name="yashpal";
    }
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
public class contructors {
    public static void main(String[] args) {
    mymainemployee yash= new mymainemployee();
        System.out.println(yash.getid());
        System.out.println(yash.getname());
    }
}
