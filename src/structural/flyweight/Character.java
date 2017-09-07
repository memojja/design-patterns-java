package structural.flyweight;

public class Character {

    private  final char chracter;

    public Character(char chracter) {
        this.chracter = chracter;
    }

    public void print(){
        System.out.println("-"+ chracter +"-,");
    }
}
