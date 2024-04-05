package Factories;

import Characters.Character;
import Characters.Grandmother;

public class GrandmotherCreator extends CharacterCreator{
    @Override
    public Character createCharacter() {
        return new Grandmother();
    }
}
