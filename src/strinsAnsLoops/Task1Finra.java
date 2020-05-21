package strinsAnsLoops;

public class Task1Finra {

    /*
    write a program that prints out 1 to 30; but for numbers which are multiple of 3 print fin,
     */

    //loop through 1 to 30
    //find numbers divisible by 3
    //print fin
    //find numbers divisible by 5
    //print ra

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
//            if (i %3 ==0 && i%5 ==0){
//                System.out.println(i+"Finra");
//            }else if(i%5 ==0){
//                System.out.println(i+"ra");
//            }else if (i %3 ==0 ){
//                System.out.println(i+"fin");
//            }

            String print ="";
            if (i%3 ==0 ) print = "fin";

            if(i%5 ==0) print +="ra";

            if (print.isEmpty()){
                System.out.println(i);

            }else {
                System.out.println(print);
            }
        }
    }


}
