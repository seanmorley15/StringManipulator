public class StringReverse {
    
public String stringReverse(String str) {

    if (str.indexOf(" ") == -1) {
        return ("ERROR: Not enough words provided. Please provide more than one word.");
    }

    str = str.trim();
    str = str.replaceAll("\\s+", " "); // remove extra whitespace
    String word = "";
    String after = "";
    String result = "";

    while (str.length() > 0 && str.indexOf(" ")!=-1) {
        word = str.substring(0, str.indexOf(" ")).trim();
        after = str.substring(str.indexOf(" ")).trim();
        result = word + " " + result;
        str = after;
    }
    return(str.trim() + " " + result);
}

}