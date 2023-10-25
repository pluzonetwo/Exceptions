package homework_2.task_1;

import java.util.Scanner;

public class Request {
    double value;
    public double UserRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        if(sc.hasNextDouble()) {
            value = sc.nextDouble();
            sc.close();
        }else {
            System.out.println("No! Input a number: ");
            UserRequest();
        }
        return value;
    }
}
