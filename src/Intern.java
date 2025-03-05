public class Intern extends Employee implements Workable{
    private String universityName;

    Intern(String name, int id, double salary, String universityName) {
        super(name,id,salary);
        this.universityName = universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double calculateBonus() {
        return salary*0.05;
    }

    public void work() {
        System.out.println("Learning and assisting in software development.");
    }

}
