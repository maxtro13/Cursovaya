package Factories;

import Characters.Character;
import Characters.Witch;

public class WitchCreator extends CharacterCreator{
    @Override
    public Character createCharacter() {
        return new Witch();
    }
}
