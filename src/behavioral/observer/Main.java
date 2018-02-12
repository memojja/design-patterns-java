package behavioral.observer;

public class Main {
    public static void main(String[] args) {

        int [] data = {1};

        BoxChart boxChart = new BoxChart(data);
        PieChart pieChart = new PieChart(data);

        ConcreteObserable obserable = new ConcreteObserable();
        obserable.addObserver(boxChart);
        obserable.addObserver(pieChart);
        obserable.notifyObservers();

        data[0] = 10;

        obserable.notifyObservers();
    }
}
