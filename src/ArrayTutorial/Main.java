package ArrayTutorial;


import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] friendsArray = {"John", "Peter", "Duke", "dan"};
        ArrayList<String> friendsList = new ArrayList<>();
        ArrayList<String> friendsList2 = new ArrayList<>(Arrays.asList("John", "Peter", "Duke", "Dan"));

        System.out.println(friendsArray[1]);
        System.out.println(friendsList2.get(1));

        System.out.println(friendsArray.length);
        System.out.println(friendsList2.size());

        friendsList2.add("Mitch");
        System.out.println(friendsList2.get(4));

        int[] myIntArray = {0,1,2,3,4,5};

    }
}
