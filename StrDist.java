public class StrDist {
    public int strDist(String str, String sub) {
        if(str.length()<sub.length()){
            return 0;
        }
        if(sub.equals(str.substring(0,sub.length()))){
            if(str.lastIndexOf(sub)!=-1){
                return 2 * sub.length() + str.substring(sub.length(), str.lastIndexOf(sub)).length();
            }else{
                return sub.length();
            }
        }else{
            return 0+strDist(str.substring(1), sub);
        }
    }
    
}
