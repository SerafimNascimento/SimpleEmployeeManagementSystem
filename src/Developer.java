public class Developer extends Employee implements Workable {
    private String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public double calculateBonus() {
        return salary*0.15;
    }

    public void work() {
        System.out.println("Writing and testing code in Java.");
    }

}
