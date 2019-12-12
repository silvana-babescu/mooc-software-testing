package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        // here the bug was begin < end
        for (; begin <= end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                if(begin == 0) return "No mirror!";
                break;
            }
        }

        return begin == end ? string : mirror;
    }
}
