import java.util.Scanner;

public class StringScrambleRunner {
    public static void main(String[] args) {
        StringScramble ss = new StringScramble();
        StringReverse sr = new StringReverse();

        

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Welcome to the String Playground!\nTo get started, enter a string: ");

            String string = scan.nextLine();
            
            System.out.println("Enter an option number:\n1. String Scramble\n2. String Reverse");
            
            String menuSelect = scan.nextLine();

            if (menuSelect.equals("1")) {

                String result = ss.stringScramble(string);
                System.out.println(result);
            }
            else if (menuSelect.equals("2")) {
                String result = sr.stringReverse(string);
                System.out.println(result);
            }
    }
}
}
