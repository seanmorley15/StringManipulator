public class StringReverse {
    
public String stringReverse(String str) {

    if (str.indexOf(0) == -1) {
        return ("ERROR: Not enough words provided. Please provide more than one word.");
    }

    String reversed = "";
    String wordTemp = "";
    String before = "";
    String after = "";

    int firstSpace = str.indexOf(" ");

    // deal with first word
    String firstWord = str.substring(0, firstSpace).trim();
    reversed = reversed + firstWord;
    after = str.substring(firstSpace);
    
    while (str.indexOf(" ") > 0) {
        int spaceIndex = str.indexOf(" ");
        int nextSpace = str.indexOf("", spaceIndex+1);

        if (nextSpace != -1) {

        }

        
    }

    return(str);
}

}