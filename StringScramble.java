public class StringScramble {

// create instance data
private String result = "";
private String scrambleThis = "";


public String stringScramble(String str) {
    
    scrambleThis = str;

    // System.out.println(scrambleThis);
    
    if (str.indexOf(" ")==-1) {
        return ("ERROR: Not enough words provided. Please provide more than one word.");
    }
   
        
        while (scrambleThis.trim().length() > 0) {
            randomStart(scrambleThis);
            // System.out.println(scrambleThis.trim().length());
        }
        
    
String returnAns = result;
    
    // System.out.println("ok");
return(returnAns.trim());

    
}


public void randomStart(String str) {
    str = str.trim();
    str = str.replaceAll("\\s+", " "); // remove extra whitespace
    String word = "";
    // calculate a random starting point for the space search


    // special case to handle when there is only one word left in the string to scramble
    if (str.indexOf(" ") ==-1) {
        result = result + " " + str.trim();
        scrambleThis = "";
    }

    else {

    // calculate a random starting location for the search of a space
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

    // create the before and after strings
    String before = "";
    String after = "";

    // DEBUG
    // System.out.println(firstSpace);
    // System.out.println(secondSpace);

    // create the substring of before the first space of the word
    before = str.substring(0, firstSpace);

    // CASE - if the word is the last in the string
    if (secondSpace!= -1) {
    after = str.substring(secondSpace); }
    
    // CASE - if the word is the first in the string
    if (secondSpace<firstSpace && secondSpace!= -1) {
        before = "";
        int starter = str.indexOf(" ");
        after = str.substring(starter);
    }

    // print result without word
    // System.out.println(before + after);

    scrambleThis = (before + after).trim(); // replace str without the word
    
    result = result + " " + word.trim();

    // System.out.println(result);

    // System.out.println(scrambleThis);
    
    // return(word);
}
}
}
