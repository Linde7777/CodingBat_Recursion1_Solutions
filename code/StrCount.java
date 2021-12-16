public class StrCount {
    public int strCount(String str, String sub) {
        if(str.length()<sub.length()){
            return 0;
        }

        if(sub.equals(str.substring(0,sub.length()))){
            return 1+strCount(str.substring(sub.length()), sub);
        }else{
            return 0+strCount(str.substring(1), sub);
        }
    }

}
