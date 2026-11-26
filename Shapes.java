

public class Shapes 
{
    public static void main(String[] args)
    {
        Shape a = new Shape();
        a.Area();
        a.Perimeter();

        Square b = new Square();
        b.Area(2);
        b.Perimeter(2);

        Circle c = new Circle();
        c.Area(2);
        c.Perimeter(2);

        Rectangle d = new Rectangle();
        d.Area(3,4);
        d.Perimeter(3,4);

        Triangle e = new Triangle();
        e.Area(3,4);
        e.Perimeter(4,4,4);





    }

    
}
class Shape
{
    public void Area()
    {
        System.out.println("Shapes ocupy an area");
        
    }

    public void Perimeter()
    {
        System.out.println("Shapes have an perimeter");

    }

}

class Square extends Shape
{
    public void Area(int a)
    {
        System.out.println("Area of square is" + Math.pow(a, 2));
    }

    public void Perimeter(int a)
    {
        System.out.println("Perimeter of square is" + 4 * a);
    }

}

class Circle extends Shape
{
    public void Area(int r)
    {
        System.out.println("Area of cirlce is" + (Math.PI * Math.pow(r, 2)));
    }

    public void Perimeter(int r)
    {
        System.out.println("Diameter of circle is" + 2 * r);
    }

}

class Rectangle extends Shape
{

    public void Area(int l, int w)
    {
        System.out.println("Area of rectangle is" + l * w);
    }

    public void Perimeter(int l, int w)
    {
        System.out.println("Perimeter of rectangle is" + 2 * (l+w));
    }

}
class Triangle extends Shape
{
    public void Area(int b, int h)
    {
        System.out.println("Area of triangle is" + 0.5 * b * h);
    }

    public void Perimeter(int a, int b, int c)
    {
        System.out.println("Perimeter of triangle is" + (a + b + c));
    }

}
