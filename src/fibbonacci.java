public class fibbonacci {
    static int series(int n){
        int a1=0;
        int a2=1;
        System.out.println("0\n1");
        for (int i=0;i<=n;i++){
            int sum=a1+a2;
            System.out.println(sum );
            a1=a2;
            a2=sum;
        }
    return 0;
    }

    public static void main(String[] args) {
        System.out.println(series(7));
    }
}
