package Lesson_5;

/**
 * ẩn giấu thông tin
 * giới hạn sử dụng: chỉ cho read-only or write-only
 */
public class TinhDongGoi {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TinhDongGoi tinhDongGoi = new TinhDongGoi();
        tinhDongGoi.setName("Auto");
        System.out.println(tinhDongGoi.getName());

        tinhDongGoi.setName("Auto Test");
        System.out.println(tinhDongGoi.getName());
    }
}
