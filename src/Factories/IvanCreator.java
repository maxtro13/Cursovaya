package Factories;

import Characters.Character;
import Characters.Ivan;

public class IvanCreator extends CharacterCreator{
    @Override
    public Character createCharacter() {
        return new Ivan();
    }
}
