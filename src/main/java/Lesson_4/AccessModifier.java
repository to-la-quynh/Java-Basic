package Lesson_4;

class A_Private{
    private int data = 40;

    private void msg(){
        System.out.println("Hello Java");
    }
}

class B_Protected{


}

/**
 * 1. Default: khi không khai báo modifier nào, chỉ được truy cập trong cùng package
 * 2. Private: chỉ truy cập trong 1 class
 * 3. Protected: truy cập trong package, ngoài package thì phải kế thừa
 */
public class AccessModifier {
    protected void msg(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        //Private
        A_Private obj = new A_Private();
//        System.out.println(obj.data); //Compile Time Error
//        obj.msg();//Compile Time Error

        //Default

        //Protected
    }
}
