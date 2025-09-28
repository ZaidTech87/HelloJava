 interface Test {
    public  void test();


}
class Test2 implements Test{
public void test(){
    System.out.println("test");
}

}
class Main {
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.test();
        System.out.println("hello i am zaid ");
    }
}

