package strinsAnsLoops;

public class Anagram {

    public static void main(String[] args) {


        String a = "listtena";
        String b = "silentb";
        if (a.length() != b.length() ){
            System.out.println("not an anagram");
            System.out.println(0);
        }

        a = a.toLowerCase().replace(" ","");
        b = b.toLowerCase().replace(" ","");

        for (int i = 0; i < a.length(); i++) {
           b = b.replaceFirst(""+a.charAt(i),"");
           //replaceFirst matches index by index
        }

        if (b.isEmpty()){
            System.out.println("Anagram");
        }else{
            System.out.println("not an anagram");
        }


    }


}
