package day2;

public class task_1 {

    public static void main(String[] args) {
       printPrimes(20);
    }



    public static void printPrimes(int num){
        for (int i = 2; i <= num; i++) {

            if (isPrime(i)){
                System.out.println(i);
            }

        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
