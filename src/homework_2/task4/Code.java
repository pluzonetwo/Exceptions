package homework_2.task4;

import java.util.Objects;
import java.util.Scanner;

public class Code {
    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String input = sc.nextLine();
        if (Objects.equals(input, "")) {
            System.out.println("Not empty string!");
            userInput();
        }else {
            System.out.println("Your input: " + input);
            sc.close();
        }
    }
}
