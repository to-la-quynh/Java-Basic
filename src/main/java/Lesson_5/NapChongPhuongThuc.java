package Lesson_5;

/**
 * Lớp Adder dùng để minh họa nạp chồng phương thức.
 */
class Adder {
    /**
     * Hàm cộng 2 số nguyên.
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * Hàm cộng 3 số nguyên.
     */
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Hàm nối 3 chuỗi.
     */
    static String add(String a, String b, String c) {
        return a + b + c;
    }
}

public class NapChongPhuongThuc {
    public static void main(String[] args) {
        System.out.println("Ví dụ về nạp chồng phương thức:");
        // Gọi hàm add(int, int)
        System.out.println(Adder.add(1, 3));
        // Gọi hàm add(int, int, int)
        System.out.println(Adder.add(1, 3, 4));
        // Gọi hàm add(String, String, String)
        System.out.println(Adder.add("a", "b", "3"));
    }
}
