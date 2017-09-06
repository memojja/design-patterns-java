package creational.factory;

public class Gif implements ImageFormatBase {
    @Override
    public void generateImage(int width, int height) {
        System.out.println("Gif");
    }
}
