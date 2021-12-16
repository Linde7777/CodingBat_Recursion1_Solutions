public class Factorial {
    public int factorial(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        return n * factorial(n - 1);

    }
}
