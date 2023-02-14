import java.util.Scanner; // importing Scanner class

public class DelimiterExample { // class with main()
    public static void main(String[] args) {
        Scanner sc = new Scanner("Life is good....."); // creating object of Scanner class ie. "sc" and passing a string as parameter
        sc.useDelimiter(" "); // using usedelimiter() with Scanner object and passing " " blank space as parameter
        while (sc.hasNext()) { //looping until sc has some inout string
            System.out.println(sc.next()); // printing words from sc object
        }
        // Scanner sc = new Scanner("Life-is-good....."); // creating object of Scanner class ie. "sc" and passing a string as parameter
        // sc.useDelimiter("-"); // using usedelimiter() with Scanner object and passing "-" minus as parameter
        // while (sc.hasNext()) {  //looping until sc has some inout string
        //     System.out.println(sc.next()); // printing words from sc object
        // }
    }
}