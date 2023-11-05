public class StringScramble {


private String word = "";


public String stringScramble(String str) {
    if (str.indexOf(" ")==-1) {
        return ("ERROR: Not enough words provided. Please provide more than one word.");
    }
    else {
        String randomWord = randomStart(str);
        return randomWord;
    }

    
}


public String randomStart(String str) {
    str = str.trim();
    str = str.replaceAll("\\s+", " "); // remove extra whitespace

    // calculate a random starting point for the space search
    int randomStart = (int) (Math.random() * (str.length()-1));

    //find the location of the nearest space from the random starting point
    int firstSpace = str.indexOf(" ", randomStart);
    int secondSpace = 0;

    // select the first word if it was closest to it.
    if (randomStart < str.indexOf(" ")) {
        word = str.substring(0, str.indexOf(" "));
    }
    else {

    while (firstSpace==-1) {
            randomStart -= 1;
            firstSpace = str.indexOf(" ", randomStart - 1);
        }


    secondSpace = str.indexOf(" ", firstSpace + 1);

    if (secondSpace == -1) {
        word = str.substring(firstSpace);
    }
    else {
        word = str.substring(firstSpace, secondSpace);
    }

    }

    String before = "";
    String after = "";

    System.out.println(firstSpace);
    System.out.println(secondSpace);

    before = str.substring(0, firstSpace);

    if (secondSpace!= -1) {
    after = str.substring(secondSpace); }

    if (secondSpace<firstSpace && secondSpace!= -1) {
        before = "";
        int starter = str.indexOf(" ");
        after = str.substring(starter);
    }

    System.out.println(before + after);

    return(word);
}

// public String removeFromString(String word) {

// }

}
