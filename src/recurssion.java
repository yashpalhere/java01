public class recurssion {
    static int fact(int n){
            if (n==0 || n==1){
                return 1;
            }
            else {
                return n*fact(n-1);
            }
    }
    static int factittrative(int n){
        int factoril=1;
        for (int i=n;i>0;i--){
            factoril=factoril*i;
        }
        return factoril;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
        System.out.println(factittrative(n));
     }
}
