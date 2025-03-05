public class Manager extends Employee implements Workable {
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary*0.2;
    }

    public void work() {
        System.out.println("Managing the team and overseeing projects.");
    }

}
