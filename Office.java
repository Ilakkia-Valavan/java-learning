public class Office {
    public static void main(String[] args)
    {
        Manager manager = new Manager("Alice", 35, 80000, "Sales");
        Developer developer = new Developer("Bob", 28, 60000, "Java");

        manager.displayDetails();
        manager.inMeeting();

        System.out.println();

        developer.displayDetails();
        developer.coding();

    }
}

class Employee
{
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee
{
    String department;

    Manager(String name, int age, double salary, String department)
    {
        super(name, age, salary);
        this.department = department;
    }

    void inMeeting()
    {
    
        System.out.println(name +" is conducting meeting in department: " + department);
    }
}

class Developer extends Employee
{
    String programmingLanguage;

    Developer(String name, int age, double salary, String programmingLanguage)
    {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void coding()
    {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}
