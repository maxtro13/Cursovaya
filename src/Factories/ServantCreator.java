package Factories;

import Characters.Character;
import Characters.Servant;

public class ServantCreator extends CharacterCreator{
    @Override
    public Character createCharacter() {
        return new Servant();
    }
}
