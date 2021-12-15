public class StrCopies {
    public boolean strCopies(String str, String sub, int n){
        if(str.length()<sub.length()){
            if(n==0){
                return true;
            }
            if(n!=0){
                return false;
            }
        }

        if(sub.equals(str.substring(0,sub.length()))){
            return strCopies(str.substring(1), sub,n-1);
            //Attention: n-1 is not equal to n--
        }else{
            return strCopies(str.substring(1), sub,n);
        }
    }   

}
