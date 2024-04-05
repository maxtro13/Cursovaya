package Factories;

import Characters.Character;
import Characters.Merchant;

public class MerchantCreator extends CharacterCreator{
    @Override
    public Character createCharacter() {
        return new Merchant();
    }
}
