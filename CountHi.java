public class CountHi {
    public int countHi(String str){
        if(str.length()<=1){
            return 0;
        }
        if(str.substring(0,2).equals("hi")){
            return 1+countHi(str.substring(1));
        }else{
            return 0+countHi(str.substring(1));
        }
    }
    
}
