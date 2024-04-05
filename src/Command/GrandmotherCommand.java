package Command;

import Characters.Character;
import Characters.Grandmother;

public class GrandmotherCommand implements Command{

    private Grandmother gm;

    public GrandmotherCommand(Character gm) {
        this.gm = (Grandmother) gm;
    }

    @Override
    public void execute(int value) {
        if(value ==2){
            gm.secondMessage();
        }
    }
}
