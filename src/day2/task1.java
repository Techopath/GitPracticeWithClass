package day2;

public class task1 {

    public static void main(String[] args) {

        String s = "java"; //immutable
        StringBuilder ss = new StringBuilder("java"); //mutable
        //StringBuffer //mutable
        System.out.println(s.hashCode());

        s = s +" is fun"; //we assigned to s
        System.out.println(s + " is fun");
        System.out.println(s);
        System.out.println("s: "+s.hashCode());
        System.out.println("ss "+ss.hashCode());

        ss.append(" is fun");
        System.out.println(ss.toString());
        System.out.println("ss: "+ ss.hashCode());
    }
}
