package Lesson_4;

import Lesson_3.*;

public class TestPackage {
    public static void main(String[] args) {
        Lesson_3.Function function = new Lesson_3.Function();
        int arr[] = {1, 2, 1, 3, 4, 2};
        int min = function.getMin(arr);
        System.out.println("Giá trị nhỏ nhất của mảng: " + min);
    }
}
