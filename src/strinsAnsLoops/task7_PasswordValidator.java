package strinsAnsLoops;

public class task7_PasswordValidator {

    public static void main(String[] args) {

        String password = "a@1Assssss";
        boolean length = password.length()>=8;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@#&].*");

        boolean valid = length && lower && upper && number && special ;
       if (valid == true){
           System.out.println(password +" is valid");
       }
    }
}

