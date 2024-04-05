package Command;

import Characters.Character;
import Characters.Grandfather;

public class GrandfatherCommand implements Command {


    private Grandfather gf;

    public GrandfatherCommand(Character gd ) {
        this.gf = (Grandfather) gd;
    }

    @Override
    public void execute(int value) {
        if(value ==1){
            gf.firstMessage();
        }
    }
}
