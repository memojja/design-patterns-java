package structural.adapter;

public class JobAdress implements Adress {
    @Override
    public String getDistrict() {
        return "Atasehir";
    }

    @Override
    public String getCity() {
        return "Istanbul";
    }

    @Override
    public String getCountry() {
        return "TURKEY";
    }
}
