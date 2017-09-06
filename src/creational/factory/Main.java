package creational.factory;

public class Main {

    public static void main(String[] args){

        ImageFactory factory = new ImageFactory();
        ImageFormatBase image =factory.getImage(100,20);
        image.generateImage(100,20);
    }
}
