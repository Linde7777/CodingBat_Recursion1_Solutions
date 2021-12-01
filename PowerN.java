public class PowerN {
    public int powerN(int base, int n) {
        if(n>0){
            return base * powerN(base, n - 1);
        }else{
            return 1;
        }
    }
}
