
/*
Project: Employee Management System
Description can be found here: https://shorturl.at/ftLeS
*/

public class Company {
    public static void main(String[] args) {
        Manager mg = new Manager("Serafim Nascimento",1234,4585.45,10);
        Developer dev = new Developer("Seraphim Birth",1235,2485.75,"Java");
        Intern in = new Intern("June",1236,1354.55,"UofA");
        mg.displayInfo();
        dev.displayInfo();
        in.displayInfo();
    }
}