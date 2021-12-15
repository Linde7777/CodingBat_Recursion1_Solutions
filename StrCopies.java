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
            return strCopies(str.substring(sub.length()), sub,n-1);
        }else{
            return strCopies(str.substring(1), sub,n);
        }
    }   
}
