public class Factorial {
    public int factorial(int n) {
        if(n==1){
            return 1;
        } else {
            if (n == 2) {
                return 2;
            } else {
                return n * factorial(n - 1);
            }
        }

    }
}
