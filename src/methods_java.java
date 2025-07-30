public class methods_java {
     int fact(int a){
         for (int i=0;i<11;i++){
             System.out.println(a+"X"+i+"="+a*i);
         }
         return 0;
     }
    public static void main(String[] args) {
//        System.out.println(fact(5));
        //calling a method by object ---> non static

        methods_java obj= new methods_java();
//        int c=obj.fact(5);
//        System.out.println(c);
        System.out.println(obj.fact(5));


    }
}
