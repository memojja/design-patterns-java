package structural.flyweight;

public class WordProcesser {

    public static void main(String[] args){

        String line ="Hello World! Hello World!";

        CharacterFactory factory = new CharacterFactory();

        for(char a : line.toCharArray()){
            Character character =factory.getChracter(a);
            character.print();
        }
    }
}
