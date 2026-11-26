public class OverLoading {
    public int add(int a, int b)
    {
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    
    public static void main (String[] args)
    {
        OverLoading sum = new OverLoading();
        System.out.println(sum.add(1,2));
        System.out.println(sum.add(1,2,3));

    }
}
