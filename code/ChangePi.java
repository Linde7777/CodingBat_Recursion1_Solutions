public class ChangePi {
    public String changePi(String str) {
        int ix = str.indexOf("pi");
        if (ix != -1) {
            if (ix == 0) {
                return changePi("3.14" + str.substring(ix + 2));
            }
            if (ix == str.length() - 1) {
                return changePi(str.substring(0, ix + 1) + "3.14");
            }

            return changePi(str.substring(0, ix) + "3.14" + str.substring(ix + 2));

        } else {
            return str;
        }
    }

}
