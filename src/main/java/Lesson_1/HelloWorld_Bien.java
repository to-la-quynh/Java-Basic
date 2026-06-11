package Lesson_1;

public class HelloWorld_Bien {
    public static String name = "Ka"; //Biến instance (biến toàn cục)
    public static int age = 20;
    public static String job = "Tester";

    public String name1; //chỉ được gọi trong các phương thức không có static
    public static String name2 = "Ka2"; //Biến static

    public String name3 = "Quynh";
    public int age1 = 21;
    public String job1 = "Manual Tester";

    public void getInfo(){
        System.out.println("Tên: " + name3);
        System.out.println("Tuổi " + age1);
        System.out.println("Nghề nghiệp: " + job1);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Hello world!");

        System.out.println("Biến cục bộ: " + n);

        //In thông tin với biến static
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Nghề nghiệp: " + job);

        //In thông tin sử dụng hàm và biến toàn cục
        System.out.println("In thông tin bằng phương thức getInfo");
        HelloWorld_Bien info = new HelloWorld_Bien();
        info.getInfo();

        //Biến
        float weight = 50.1f;

        boolean sex = true; //true = nam

        System.out.println("Cân nặng: " + weight);
        System.out.println(sex);
    }
}