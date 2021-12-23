public class NextParen {
    public boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }

        if (str.substring(0, 1).equals("(") &&
                str.substring( str.length() - 1, str.length() ).equals(")")) {
            return nestParen(str.substring(1, str.length() - 1));
        } else {

            if (str.substring( 0, str.length() ).equals("()")) {
                return true;
            } else {
                return false;
            }

        }

    }
}
