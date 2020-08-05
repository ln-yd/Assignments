public class StringManipulator{
    public String trimAndConcat(String strA, String strB){
        String strATrimmed = strA.trim()+strB.trim();
        // String strATrimmed = strB.trim();
        // System.out.println(strATrimmed);
        return strATrimmed;
    }
    public Integer getIndexOrNull(String str, char letter){
        int strIndex = str.indexOf(letter);
        if (strIndex > 0){
            return strIndex;
        } else {
            return null;
        }

    }
    public Integer getIndexOrNull(String str, String subStr){
        int strIndex = str.indexOf(subStr);
        if( strIndex > 0){
            return strIndex;
        } else {
            return null;
        }
    }
    public String concatSubstring(String strA, int x, int y, String strB){
        String stringSub=strA.substring(x, y);
            String catString=stringSub + strB;
            return catString;

    }

}
    