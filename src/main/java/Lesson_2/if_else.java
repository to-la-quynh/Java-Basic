package Lesson_2;

public class if_else {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 12;
        //IF else
        if (number1 < number2) {
            System.out.println(number1 + " nhỏ hơn " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " bằng " + number2);
        } else {
            System.out.println(number1 + " lớn hơn " + number2);
        }
    }

}