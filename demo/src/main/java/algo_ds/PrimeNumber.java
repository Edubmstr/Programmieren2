package algo_ds;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(3));
    }

    private static boolean isPrime(int n){ // 3 + 2 + sqrt(n)*7 + 1 = 6 + 7*sqrt(n)
        if(n < 2) return false; // 3

        for (int i = 2; i <= Math.sqrt(n); i++) { // 2 + sqrt(n) * 7 + 1
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
