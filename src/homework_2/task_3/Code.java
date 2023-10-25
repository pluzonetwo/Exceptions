package homework_2.task_3;

public class Code {

    public void divNumbers(Integer value1, Integer value2) {
        if (value2 != 0) {
            System.out.println(value1 / value2);
        }else {
            System.out.println("Divide by null!");
        }
    }

    public void printSum(Integer value1, Integer value2) {
        if (value1 != null || value2 != null) {
            System.out.println(value1 + value2);
        }else {
            System.out.println("Операнд не может иметь тип null!");
        }
    }

    public void getArrEl(Integer[] arr) {
        int el = 2;
        if (el < arr.length) {
            System.out.println(arr[el]);
        }else {
            System.out.println("Индекс находится за пределами массива!");
        }
    }

}
