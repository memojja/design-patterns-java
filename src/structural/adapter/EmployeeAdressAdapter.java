package structural.adapter;

public class EmployeeAdressAdapter implements Adress {

    private final Employee employee;

    public EmployeeAdressAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDistrict() {
        return employee.getDistrict();
    }

    @Override
    public String getCity() {
        return employee.getCity();
    }

    @Override
    public String getCountry() {
        return employee.getCountry();
    }
}
