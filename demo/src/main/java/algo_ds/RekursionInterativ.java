package algo_ds;

public class RekursionInterativ {
    
    public static void main(String[] args){
        
        long start1 = System.nanoTime();
        System.out.println(calculateFibonacciAsIteration(10));
        long end1 = System.nanoTime();
        System.out.println("Fibonacci iterativ: "+ (end1-start1));

        start1 = System.nanoTime();
        System.out.println(calculateFibonacciAsRecursion(10));
        end1 = System.nanoTime();
        System.out.println("Fibonacci rekursiv: "+ (end1-start1));

        start1 = System.nanoTime();
        System.out.println(calculateGGTAsIteration(24, 36));
        end1 = System.nanoTime();
        System.out.println("GGT iterativ: "+ (end1-start1));

        start1 = System.nanoTime();
        System.out.println(calculateGGTAsRecursion(36, 24));
        end1 = System.nanoTime();
        System.out.println("GGT rekursiv: "+ (end1-start1));
    }

    private static long calculateFibonacciAsIteration(int n){
        long startOne = 0;
        long startTwo = 1;
        long sum = 0;

        if(n == 1){
            return startTwo;
        }

        while(n > 1){
            sum = startOne + startTwo;
            startOne = startTwo;
            startTwo = sum;
            n--;
        }
        return sum;
    }

    private static long calculateFibonacciAsRecursion(int n){
        if(n <= 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }
        return calculateFibonacciAsRecursion(n - 1) + calculateFibonacciAsRecursion(n - 2);
    }

    private static int calculateGGTAsIteration(int x, int y){
        int c;

        while(y != 0){
            c = x % y;
            x = y;
            y = c;
        }

        return x;

    }

    private static int calculateGGTAsRecursion(int x, int y){
        int c;
        if(x > y){
            c = x % y;
        }else{
            c = y % x;
        }

        if(c == 0) return y;

        return calculateGGTAsRecursion(y, c);
    }
}
