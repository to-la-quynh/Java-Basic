package Lesson_3;

public class Function {

    /**
     * Hàm gán cùng một giá trị cho tất cả phần tử trong mảng.
     *
     * @param arr          Mảng cần khởi tạo dữ liệu
     * @param number_value Giá trị được gán cho từng phần tử
     */
    static void inputData(int arr[], int number_value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number_value;
        }
    }

    /**
     * Hàm hiển thị tất cả phần tử trong mảng.
     *
     * @param arr Mảng cần in ra màn hình
     */
    static void printData(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + " = " + arr[i]);
        }
    }

    /**
     * Hàm tìm giá trị nhỏ nhất trong mảng số nguyên
     *
     * @param arr Mảng số nguyên cần tìm giá trị nhỏ nhất
     * @return Giá trị nhỏ nhất trong mảng
     */
    static int getMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Khởi tạo mảng số nguyên gồm 100 phần tử
        int arr[] = new int[100];
        // Gán giá trị 25 cho tất cả phần tử trong mảng
        inputData(arr, 25);
        // In toàn bộ phần tử của mảng ra màn hình
        printData(arr);

        int min = getMin(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
