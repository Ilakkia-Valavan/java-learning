public class Student 
{
    private String name;
    private int age;
    private double grade;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Age cannot be negative.");
        }

    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        if (grade >= 0.0 && grade <= 100.0)
        {
            this.grade = grade;
        }
        else
        {
            System.out.println("Grade must be between 0 and 100.");
        }
    }
    
    
       public static void main(String[] args) 
    {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        student.setGrade(85.5);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Grade: " + student.getGrade());
    

    }

    
    
}
