package homework_2.task_3;

public class Main {
    public static void main(String[] args) throws Exception {
        Code code = new Code();
        try {
            code.divNumbers(90, 0);
            code.printSum(10, 5);
            Integer[] abc = { 1, 2, 3 };
            code.getArrEl(abc);
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так..." + ex);
        }
    }
}
