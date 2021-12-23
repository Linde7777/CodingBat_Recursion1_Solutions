public class StringClean {

    public static String stringClean(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.substring(0, 1).equals(str.substring(1, 2))) {
            return "" + stringClean(str.substring(0, 1) + str.substring(2));
        } else {
            return str.substring(0, 1) + stringClean(str.substring(1));
        }

    }

    public static void main(String[] args) {
        String str = "aaaa";
        str = stringClean(str);
        System.out.println(str);
    }
}
