//create a void method that accept 2 parameters of type string firstname and lastname

//a void method does not a return statement and does not return a value but return a print message
public class MethodTutorial {
    public static void duke(String firstname, String lastname) {
        System.out.println("my firstname and lastname are: " + firstname + " " + lastname);

    }

    public static void printSomething(String message, int rand) {
        System.out.println(message);
    }


    //To return a value or statement;

    public static int addition(int x, int y) {
        int sum = x + y;
        return sum;
    }

    //how to test the method above
//so add the main method to the class
//and call the method
    public static void main(String[] args) {
        //void that return a print message
        printSomething("this is me", 22);
        // non void returns a value or statement
        addition(20, 40);
        System.out.println(addition(20, 40));
        duke("duke", "umeh");

    }
}

