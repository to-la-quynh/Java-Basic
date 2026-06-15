package Lesson_4;
/**
 * Lớp Student1 dùng để quản lý thông tin sinh viên.
 */
class Student1{
    // Thuộc tính của từng đối tượng sinh viên
    public String name;
    public int age;
    public float height;

    // Thuộc tính static - dùng chung cho tất cả sinh viên
    public static String universityName = "University Name";
    // Biến đếm tổng số sinh viên được tạo
    public static int total = 0;

    /**
     * Constructor dùng để khởi tạo đối tượng Student1.
     *
     * @param name Tên sinh viên
     * @param age Tuổi sinh viên
     * @param height Chiều cao sinh viên
     */
    public Student1(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
        // Mỗi lần tạo một sinh viên mới thì tăng biến đếm lên 1
        total++;
    }
}

public class Static {
    public static void main(String[] args) {
        // Tạo sinh viên thứ nhất
        Student1 s1 = new Student1("John", 23, 0.5f);
        // Truy cập biến static thông qua tên class (khuyến nghị)
        System.out.println("University (from class): " + Student1.universityName);
        // Truy cập biến static thông qua object (vẫn chạy được nhưng không nên)
        System.out.println("University (from instance): " + s1.universityName);
        // Hiển thị tổng số sinh viên đã được tạo
        System.out.println("Total students (from class): " + Student1.total);

        // Tạo sinh viên thứ hai
        Student1 s2 = new Student1("Ka", 21, 0.4f);
        // Sau khi tạo thêm 1 sinh viên, total tăng lên
        System.out.println("Total students (from class): " + Student1.total);
    }
}
