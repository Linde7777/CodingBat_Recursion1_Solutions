public class NoX {
    
    public String noX(String str) {
        int ix=str.indexOf("x");
        if(ix==-1){
            return str;
        }else{

            if(ix==0){
                return noX(str.substring(ix+1));
            }
            if(ix==str.length()-1){
                return noX(str.substring(0, str.length()-1));
            }

            return noX(str.substring(ix-1, ix)+str.substring(ix+1));
        }
    }
}
