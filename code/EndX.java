public class EndX {
    public String endX(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.substring(0, 1).equals("x")) {
            return endX(str.substring(1)) + "x";
        } else {
            return str.substring(0, 1) + endX(str.substring(1));
        }

    }

}
