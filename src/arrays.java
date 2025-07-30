public class arrays {
    public static void main(String[] args) {
        int marks[]={1,5,7,8,4};
        System.out.println(marks[4 ]);
        System.out.println(marks.length);

        //display an array
        System.out.println("Printing an array...,.");
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        for (int element: marks){
            System.out.println(element);

        }
    }
}
