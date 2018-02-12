package behavioral.observer;

public class BoxChart implements Observer {

    int [] data;

    public BoxChart(int[] data) {
        this.data = data;
    }

    @Override
    public void handleNotification() {
        System.out.println("box chart data is : " + data[0]);
    }
}
