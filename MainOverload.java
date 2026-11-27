public class MainOverload {
    public static void main(String[] args)
    {
        System.out.println("original main method");
        main(10);
    }

    public static void main(int a)
    {
        System.out.println("overloaded main method with int parameter: " + a);
    }
}
