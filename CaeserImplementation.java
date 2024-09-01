public class CaeserImplementation{
    public static void main(String[] args) {
        String test = "";
        try {
            test = args[0];
        } catch (Exception e) {
            System.exit(0);
        }
        //String test = "ESBZOPS QJH QFO";
        findAll(test);
    }
    public static char getChar(int mov, char cChar) {
        int cInt = ((int)(Character.toUpperCase(cChar))+mov);
        if (cInt > 90)
            cInt -= 26;
        return (char)cInt;
    }
    public static String getString(int mov, String cString) {
        String resString = "";
        for (int i = 0; i < cString.length(); i++) {
            if (cString.charAt(i) != ' ') {
                resString += getChar(mov, cString.charAt(i));
            } else {
                resString += ' ';
            }
        }
        return resString;
    }
    public static void findAll(String cString) {
        for (int i = 0; i < 26; i++) {
            System.out.printf("%2d%s%s%n", i+1, ". ", getString(i, cString));
        }
    }
}