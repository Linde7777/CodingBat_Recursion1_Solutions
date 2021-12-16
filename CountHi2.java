public class CountHi2 {
    public int countHi2(String str) {
        if(str.length()<=1){
            return 0;
        }

        if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            return 0 + countHi2(str.substring(3));
        }

        if (str.length() >= 2 && str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(1));
        } else {
            return 0 + countHi2(str.substring(1));
        }
        
    }

}
