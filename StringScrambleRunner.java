import java.util.Scanner;

public class StringScrambleRunner {
    public static void main(String[] args) {
        StringScramble ss = new StringScramble();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a String to Scramble!");
            String toScramble = scan.nextLine();
            String result = ss.stringScramble(toScramble);
            System.out.println(result);
        }
    }
}
