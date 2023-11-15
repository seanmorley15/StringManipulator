public class RepeatLetter {
    public String repeatLetter(String str, String t) {
        str = str.trim().toLowerCase();
        t = t.trim().toLowerCase();
        int psn = str.indexOf(t);
        
        String before = "";
        String result = "";
        
        if (psn == -1) {
            return str;
        }
        else {
            before = str.substring(0, psn + 1) + t;
            result = before;
            psn++;
            while (psn <= str.length() - 1) {
                String current = str.substring(psn, psn+1);
                
                if (current.equals(t)) {
                    result = result + current + current;
                }
                else {
                    result = result + current;
                }
                
                psn++;
            }
            return result;
        }
    }
}
