public class CountPairs {
    public int countPairs(String str) {
        if(str.length()<=2){
            return 0;
        }
        if(str.substring(0, 1).equals(str.substring(2,3))){
            return 1+countPairs(str.substring(1));
        }else{
            return 0+countPairs(str.substring(1));
        }

    }

    
}
