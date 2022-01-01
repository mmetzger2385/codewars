public class Isogram {
    /**
     * https://www.codewars.com/kata/54ba84be607a92aa900000f1
     *
     * @param str The input String
     * @return The returned boolean, either true or false
     */
    public static boolean isIsogram(String str) {

        String strLow = str.toLowerCase();

        for (char a : strLow.toCharArray()) {
            if (strLow.indexOf(a) != strLow.lastIndexOf(a)) {
                return false;
            }
        }

        return true;
    }
}
