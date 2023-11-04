public class StringScramble {
    
public static void main(String[] args) {
    String scrambled = randomStart("This is a test");
    // System.out.println(scrambled);
}

public static String randomStart(String str) {
    str = str.trim();

    String word = "";
    if (str.indexOf(" ")==-1) {
        return ("ERROR: Not enough words provided. Please provide more than one word.");
    }

    int randomStart = (int) (Math.random() * (str.length()-1));

    System.out.println(randomStart);

    int firstSpace = str.indexOf(" ", randomStart);

    if (randomStart < str.indexOf(" ")) {
        word = str.substring(0, firstSpace);
    }
    else {

    while (firstSpace==-1) {
            randomStart -= 1;
            firstSpace = str.indexOf(" ", randomStart - 1);
        }

    System.out.println(firstSpace);

    int secondSpace = str.indexOf(" ", firstSpace + 1);

    if (secondSpace == -1) {
        word = str.substring(firstSpace);
    }
    else {
        word = str.substring(firstSpace, secondSpace);
    }

    }


    System.out.println(word);
    return(str);
}

//TODO: include the first word

}
