
public class helloWorld {

    public static void main(String[] args) {
        HereAndThere ht = new HereAndThere();
        Amaze a = new Amaze();

        // Prints "Hello World" into terminal window
        String test = "Hello " + a.getText() + " World";
        System.out.println(test);

        System.out.println("Here: " + ht.here(test));
        System.out.println("There: " + ht.there(test));
        
    }
}
