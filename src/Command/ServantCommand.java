package Command;

import Characters.Character;
import Characters.Servant;

public class ServantCommand implements Command{

    private Servant servant;

    public ServantCommand(Character servant) {
        this.servant = (Servant) servant;
    }

    @Override
    public void execute(int value) {
        if(value ==15){
            servant.go();
        }
    }
}
