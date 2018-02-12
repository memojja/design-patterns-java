package behavioral.observer;

public class PieChart implements Observer {

    int [] data;

    public PieChart(int[] data) {
        this.data = data;
    }

    @Override
    public void handleNotification() {
        System.out.println("pie chart data is " + data[0]);
    }
}
