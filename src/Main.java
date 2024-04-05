import Characters.Character;
import Command.*;
import Factories.AlenushkaCreator;
import Factories.CharacterFactory;

public class Main {
    public static void main(String[] args) {

        CharacterFactory characterFactory=new CharacterFactory();
         Character alena=characterFactory.createCharacter("alena");
         Character ivan=characterFactory.createCharacter("ivan");
         Character gf=characterFactory.createCharacter("grandfather");
         Character gm=characterFactory.createCharacter("grandmother");
         Character servant=characterFactory.createCharacter("servant");
         Character merchant=characterFactory.createCharacter("merchant");
         Character witch=characterFactory.createCharacter("witch");
        Speaker speaker=new Speaker(
                new GrandfatherCommand(gf),
                new GrandmotherCommand(gm),
                new AlenushkaCommand(alena),
                new IvanCommand(ivan),
                new MerchantCommand(merchant),
                new ServantCommand(servant),
                new WitchCommand(witch));
        speaker.choice("src/selectionOrder.txt");
    }
}