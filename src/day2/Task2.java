package day2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));

armstrongNumber();

        System.out.println(isArmstrong2(153));

    }

    public static void armstrongNumber(){
        int a = 153;
        String aStr = a+"";

        int sum = 0;
        for (int i = 0; i < aStr.length(); i++) {
            int length = aStr.length();
            int digit = Integer.parseInt(aStr.charAt(i)+"");
            sum += digit*digit*digit;
            System.out.println(sum);
        }
        System.out.println(sum);

    }

    public static boolean isArmstrong(int num){
        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {

            int digit = Integer.parseInt(""+number.charAt(i));

            sum+= Math.pow(digit, power);

        }
        return sum == num;

    }


    public static boolean isArmstrong2(int num){
        int digits = num;
        int sum = 0;
        int power = String.valueOf(num).length();

        // num % 10 --> last digit

        while (digits != 0){

            int each = digits % 10;
            digits /= 10;
            sum += Math.pow(each,power);

        }

        return sum == num;
    }
}
