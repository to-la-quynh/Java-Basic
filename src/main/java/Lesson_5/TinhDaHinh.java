package Lesson_5;

class Bike {
    void run() {
        System.out.println("Chạy");
    }

}

public class TinhDaHinh extends Bike {
    void run() {
        System.out.println("Chạy khoảng 30 km/h");
    }

    void stop() {
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println("Ví dụ về đa hình:");
        bike.run();

        Bike bike2 = new TinhDaHinh();
        bike2.run(); //gọi được vì trùng với phương thức run trên lớp cha Bike
//        bike2.stop();

        //Thực tế sử dụng thì:
        TinhDaHinh tinhDaHinh = new TinhDaHinh(); //Sử dụng của cha và con
        tinhDaHinh.run();
        tinhDaHinh.stop();

        Bike bike3 = new Bike();
        bike3.run(); //Sử dụng của cha mà con bị trùng
    }
}
