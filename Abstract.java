public class Abstract {
    public static void main(String[] args) 
    {
        Employee manager = new Manager("John Doe", 35, 50000, 10);
        manager.displayDetails();
        manager.bonus();

    } 
    
}

abstract class Employee{
        String name;
        int age;
        double salary;

        Employee(String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        abstract void bonus();

        void displayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }

    class Manager extends Employee{
        double bonusPercentage;

        Manager(String name, int age, double salary, double bonusPercentage){
            super(name, age, salary);
            this.bonusPercentage = bonusPercentage;
        }

        @Override
        void bonus() {
            double bonusAmount = salary * (bonusPercentage / 100);
            System.out.println("Manager Bonus: " + bonusAmount);
        }
    }
