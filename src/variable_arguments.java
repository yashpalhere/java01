public class variable_arguments {

    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int ...arr){
        //it will be available as itn arr[];
        int result=0;
        for (int a: arr){
            result=result+a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome");
        sum(5,4);

        //for sumof 3 num
        System.out.println(sum(4,5,5,7));


    }
}
