abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public void displayInfo() {
        System.out.println("-----------------------------");
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("-----------------------------");
    }

}
