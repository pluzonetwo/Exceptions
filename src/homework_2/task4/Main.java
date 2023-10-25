package homework_2.task4;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Code code = new Code();
        try{
            code.userInput();
        }catch (RuntimeException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
