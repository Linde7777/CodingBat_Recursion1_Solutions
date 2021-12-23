public class AllStar {

    public String allStar(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        return str.substring(0, 1) + "*" + allStar(str.substring(1, str.length()));

        /**
         * We can't pass the index,
         * but the length of the str can be pass along with str,
         * which can be used as index
         */
    }

}
