public class StrDist {
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (sub.equals(str.substring(0, sub.length()))) {

            if (str.lastIndexOf(sub) == 0) {
                return sub.length();
            } else {
                return 0 + str.lastIndexOf(sub) + sub.length();
                /*
                 * 0 is the index of the first occurrence of sub.
                 * e.g. strDist("hihihi","hih"), 0 is the index of
                 * the first occurrence of "hih"
                 */

            }

        } else {
            return 0 + strDist(str.substring(1), sub);
        }
    }

}
