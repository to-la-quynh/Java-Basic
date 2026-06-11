package Lesson_2;

public class ToanTu {

    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 3;

        int number3, number4;
        number3 = number4 = 22;

        float number5 = 5.5f;

        String string1 = "Cao";
        String string2 = "Ka";

        Boolean sex1 = true;
        Boolean sex2 = false;

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

        System.out.println(string1 + " " + string2);

        System.out.println(sex1&&sex2);
        System.out.println(sex1||sex2);

        System.out.println(number3);

        number3 = number3++;
        System.out.println(number4);
    }
}
