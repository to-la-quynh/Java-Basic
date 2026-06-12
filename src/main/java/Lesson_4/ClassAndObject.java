package Lesson_4;

/**
 * Class TestClass chứa thuộc tính và phương thức xử lý dữ liệu.
 */
class TestClass{
    //Thuộc tính của Class TestClass
    public int number1 = 10;
    public int number2 = 20;

    /**
     * Phương thức tính tổng hai số nguyên
     *
     * @param a Số thứ nhất
     * @param b Số thứ hai
     * @return Tổng của a và b
     */
    public int sum(int a, int b){
        return a + b;
    }

    /**
     * Phương thức in kết quả tổng của hai số ra màn hình.
     *
     * @param a Số thứ nhất
     * @param b Số thứ hai
     */
    public void print(int a, int b){
        System.out.println(sum(a, b));
    }
}

class Student{
    public String name;
    public int age;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void getInformation(){

    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        //Khởi tạo 2 biến
        int a = 1;
        int b = 2;

        //Tạo đối tượng từ lớp TestClass
        TestClass obj = new TestClass();

        // Gọi hàm print để in tổng của a và b
        obj.print(a, b);

        Student s = new Student();
        s.name = "Ka";
        s.age = 20;
        s.display();
    }
}
