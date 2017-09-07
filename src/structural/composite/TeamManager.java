package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamManager implements Employee {

    private List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void printInformations() {
        employees.forEach( employee ->  employee.printInformations());
    }

    public void addTeamMember(Employee employee){
        employees.add(employee);
    }

    public void removeTeamMember(Employee employee){
        employees.remove(employee);
    }
}
