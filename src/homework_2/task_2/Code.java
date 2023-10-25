package homework_2.task_2;

public class Code {
    public void LessonCode() {

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            Integer d = 0;
            double catchRes = intArray[2] / d;
            System.out.println("catchRes = " + catchRes);
        } catch (ArithmeticException e) {
            System.out.println(" Catching exception: divide by zero" + "\n" + " Exception's name: " + e);
        }
    }
}
