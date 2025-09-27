public class Sum {
    public static class A{
        public String meth() {
            return "class a";
        }
    }
    public static class B extends A{
        public String meth() {
            return "class b";
        }
    }
    public static void main(String[] args) {
         B a =new B();
        A b = new B();
        System.out.println(a.meth());
        System.out.println(b.meth() );
    }
}
