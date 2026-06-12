package Lesson_3;

public class Array {
    public static void main(String[] args) {
        //khai báo mảng
        int a[] = new int[3];
        //gán giá trị cho mảng a
        a[0] = 10;
        a[1] = 20;
        a[2] = 40;

        int arr[] = {10, 12, 13};


        //in mảng ra màn hình
        for (int i : arr) {
            System.out.println(i + " ");
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //Bài toán: Gán giá trị hàng 25 cho 1 mảng 100 phần tử
        int arr1[] = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 25;
        }

        //in giá trị của các phân tử trong mảng arr1
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Giá trị phẩn tử thứ " + (i + 1) + " = " + arr1[i]);
        }
    }
}
