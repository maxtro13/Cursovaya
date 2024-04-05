package Command;

import Characters.Character;
import Characters.Ivan;

public class IvanCommand implements Command{

    private Ivan ivan;

    public IvanCommand(Character ivan) {
        this.ivan = (Ivan) ivan;
    }

    @Override
    public void execute(int value) {
        if(value == 4){
            ivan.wantDrink();
        }else if(value ==6){
            ivan.transformation();
        }else if(value ==10){
            ivan.truth();
        }else if(value ==12){
            ivan.wentToSister();
        }else if(value ==13){
            ivan.callingSister();
        }else if(value ==17){
            ivan.reverseTransformation();
        }
    }
}
