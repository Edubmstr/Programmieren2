package algo_ds;

public class ZinsenZins {
    public static void main(String[] args){
        System.out.println(calculateInterest(10000f, 5.25f, 1));
    }

    public static float calculateInterest(float amount, float interest, int years){
        interest = (interest / 100) + 1; 
        for (int i = 0; i < years; i++) {
            amount = amount * interest;
        }
        return amount;
    }

    public static double calculateInterestOptimized(double amount, double interest, int years){
        interest = (interest / 100) + 1; 
        amount = amount * Math.pow(interest, years);
        return amount;
    }

}
