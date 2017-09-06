package creational.factory;

public class ImageFactory {

    public ImageFormatBase getImage(int width, int height){
        int area = width*height;
        if (area > 500) return  new Jpeg();
        else return new Gif();
    }
}
