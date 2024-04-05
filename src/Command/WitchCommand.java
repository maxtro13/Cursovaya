package Command;

import Characters.Character;
import Characters.Witch;

public class WitchCommand implements  Command{

    private Witch witch;

    public WitchCommand(Character witch) {
        this.witch = (Witch) witch;
    }

    @Override
    public void execute(int value) {
        if(value ==9){
            witch.drownedAlena();
        }else if(value ==11){
            witch.wantToKill();
        }else if(value ==18){
            witch.deathWitch();
        }
    }
}
