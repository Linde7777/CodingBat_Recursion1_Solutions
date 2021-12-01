public class SumDigits {
    public int sumDigits(int n) {
        if(n>0){
            return n % 10 + sumDigits(n / 10);
        }
        else{
            return 0;
        }
    }

    
}

