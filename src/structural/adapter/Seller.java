package structural.adapter;

public class Seller {

    public static void main(String[] args){
        Employee employee = new Employee("Kadikoy","Istanbul","TURKEY");

        //the same thing both of them
        EmployeeAdressAdapter adapter = new EmployeeAdressAdapter(employee);
        Adress adress = new EmployeeAdressAdapter(employee);

        System.out.println("District : "+ adress.getDistrict() +" City : " + adress.getCity() + " Country : " + adress.getCountry());
        System.out.println("District : "+ adapter.getDistrict()+" City : " + adapter.getCity()+ " Country : " + adapter.getCountry());
    }
}
