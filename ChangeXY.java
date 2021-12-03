public class ChangeXY {
    public String changeXY(String str) {
        int ix=str.lastIndexOf("x");

        if(ix!=-1){
            if(ix==0){
                return "y"+str.substring(ix+1);               
            }
            if(ix==str.length()-1){
                return str.substring(0, ix)+"y";
            }
            return str.substring(0,ix) + "y" + str.substring(ix + 1);
        }
        else{
            return str;
        }
    }
    
}
