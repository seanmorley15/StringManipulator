import java.util.Scanner;

public class StringScrambleRunner {
    public static void main(String[] args) {
        StringScramble ss = new StringScramble();
        StringReverse sr = new StringReverse();
        RepeatLetter rl = new RepeatLetter();

        boolean status = true;

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Welcome to the String Playground!\nTo get started, enter a string: ");

            String string = scan.nextLine();

            while (status) {

            System.out.println("Enter an option number:\n1. String Scramble\n2. String Reverse\n3. Repeat Letter\ne. Exit");
            
            String menuSelect = scan.nextLine();

            if (menuSelect.equals("1")) {

                String result = ss.stringScramble(string);
                System.out.println(result);
            }
            else if (menuSelect.equals("2")) {
                String result = sr.stringReverse(string);
                System.out.println(result);
            }
            else if (menuSelect.equals("3")) {
                System.out.println("Enter a letter to repeat");
                String t = scan.nextLine();
                while (t.length() > 1) {
                    System.out.println("Enter one letter only.");
                    t = scan.nextLine();
                }
                String result = rl.repeatLetter(string, t);
                System.out.println(result);
            }
            else if (menuSelect.equals("e")) {
                status = false;
            }
            }


    }
}
}

