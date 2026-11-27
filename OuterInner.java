public class OuterInner 
{
    public static void main(String[] args) 
    {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(outer.x+inner.y);
        System.out.println(inner.myInnerMethod());
        
    }
}

class Outer 
{
    int x = 10;
    class Inner 
    {
        public int myInnerMethod() 
        {
            return x;
        }
        int y = 5;
        
    }
}