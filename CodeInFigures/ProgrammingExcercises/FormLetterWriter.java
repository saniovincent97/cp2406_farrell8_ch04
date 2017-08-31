package ProgrammingExcercises;

public class FormLetterWriter {
    public static void main(String[] args){
        String f_name = "David";
        String l_name = "Anderson";
        displaySalutation(l_name);
        displaySalutation(f_name, l_name);

    }
    public static void displaySalutation(String l_name){
        System.out.println("Dear Mr or Mrs " + l_name);
    }
    public static void displaySalutation(String f_name, String l_name){
        System.out.println("Dear " + f_name + l_name + ", Thank you for you recent order.");
    }
}
