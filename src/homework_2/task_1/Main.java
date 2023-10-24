package homework_2.task_1;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        System.out.println("You input: " + request.UserRequest());
    }
}