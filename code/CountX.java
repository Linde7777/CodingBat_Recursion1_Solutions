public class CountX {

    public int countX(String str) {
        if (str.indexOf("x") != -1) {
            return 1 + countX(str.substring(str.indexOf("x") + 1));
        } else {
            return 0;
        }
    }

}
