package Factories;

import Characters.*;
import Characters.Character;

public class CharacterFactory {




    public Character createCharacter(String name) {
        Character character = null;
        if(name.equalsIgnoreCase("alena")){
            character=new AlenushkaCreator().createCharacter();
        }else if(name.equalsIgnoreCase("ivan")){
            character=new IvanCreator().createCharacter();
        }else if(name.equalsIgnoreCase("Grandfather")){
            character=new GrandfatherCreator().createCharacter();
        }else if(name.equalsIgnoreCase("Grandmother")){
            character=new GrandmotherCreator().createCharacter();
        }else if(name.equalsIgnoreCase("servant")){
            character=new ServantCreator().createCharacter();
        }else if(name.equalsIgnoreCase("merchant")){
            character= new MerchantCreator().createCharacter();
        }else if(name.equalsIgnoreCase("witch")){
            character= new WitchCreator().createCharacter();
        }
        return character;
    }
}
