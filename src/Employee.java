abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateBonus();

    public void displayInfo() {
        System.out.println("-----------------------------");
        System.out.println("Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("-----------------------------");
    }

}
