package Command;

import Characters.Alenushka;
import Characters.Character;

public class AlenushkaCommand implements Command{

    private  Alenushka  alena;

    public AlenushkaCommand(Character alena) {
        this.alena = (Alenushka) alena;
    }

    @Override
    public void execute(int value) {
        if(value==3){
            alena.wentToWork();
        }else if(value==5){
            alena.cantDrink();
        }else if(value==7){
            alena.cry();
        }else if(value==14){
            alena.answerToBrother();
        }
    }
}
