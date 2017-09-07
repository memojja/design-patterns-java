package structural.composite;

public class TeamMember implements Employee {

    private String name;
    private String salary;


    public TeamMember(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printInformations() {
        System.out.println("Name : " +  name + " Salary : " + salary );
    }
}
