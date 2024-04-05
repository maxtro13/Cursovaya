package Factories;

import Characters.Alenushka;
import Characters.Character;

public class AlenushkaCreator extends CharacterCreator {
    @Override
    public Character createCharacter() {
        return new Alenushka();
    }
}
