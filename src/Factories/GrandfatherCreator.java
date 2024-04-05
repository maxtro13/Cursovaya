package Factories;

import Characters.Character;
import Characters.Grandfather;

public class GrandfatherCreator extends CharacterCreator {

    @Override
    public Character createCharacter() {
        return new Grandfather();
    }
}
