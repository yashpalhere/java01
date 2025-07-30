public class strings_methods {
    public static void main(String[] args) {
        String name = "Yashpal";
        int value=name.length();
        System.out.println(value);
        String lowercasename= name.toLowerCase();
        System.out.println(lowercasename);
        String uppercasename = name.toUpperCase();
        System.out.println(uppercasename);

        System.out.println(name.toLowerCase()); // No new string needed
        System.out.println(lowercasename.toUpperCase());


        String nontrimmmedstring= "      My name is Yashpal Bishnoi   ";
        System.out.println(nontrimmmedstring);
        System.out.println(nontrimmmedstring.trim());

        System.out.println(name.substring(2));
        System.out.println(nontrimmmedstring.substring(10));

        System.out.println((nontrimmmedstring.substring(9,15)));
        System.out.println((name.substring(2,7)));

        System.out.println(name.replace('h','s'));
        System.out.println(name.replace('a','x'));
        System.out.println((name.replace("pal"," paal")));


        System.out.println("i am escape sequence \"double quote\"");
    }
};


