public class breakandcontinue {
    public static void main(String[] args) {
        //break and continue using loops

//        for (int i=0;i<10;i++){
//            System.out.println(i);
//            System.out.println("I'm great...");
//            if (i==2){
//                System.out.println("loop breaked ....");
//                break;
//            }
//        }

        //continue
        for (int i=0;i<10;i++) {
            if (i == 2) {
                System.out.println("loop breaked ....");
                continue; //skips itration i =2
            }
                System.out.println(i);
                System.out.println("I'm great...");

        }

    }
}
