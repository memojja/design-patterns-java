package structural.flyweight;

import java.lang.Character;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterFactory {

    private final Map<Character, structural.flyweight.Character> characterPool = new HashMap<Character, structural.flyweight.Character>();

    public structural.flyweight.Character getChracter(char character){

        if(characterPool.containsKey(character)){
            return characterPool.get(character);
        }
        structural.flyweight.Character newCharacter = new structural.flyweight.Character(character);
        characterPool.put(character,newCharacter);

        return newCharacter;
    }

}
