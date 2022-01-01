public class Isogram {
    public static boolean  isIsogram(String str) {

        String strLow = str.toLowerCase();

        for(char a : strLow.toCharArray()){
            if(strLow.indexOf(a) != strLow.lastIndexOf(a)){
                return false;
            }
        }

        return true;
    }
}
