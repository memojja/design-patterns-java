package creational.factory;

public class Jpeg implements ImageFormatBase {
    @Override
    public void generateImage(int width, int height) {
        System.out.println("Jpeg");
    }
}
