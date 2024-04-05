package Command;

import Characters.Character;
import Characters.Merchant;

public class MerchantCommand implements Command{


    private Merchant merchant;

    public MerchantCommand(Character merchant) {
        this.merchant = (Merchant) merchant;
    }

    @Override
    public void execute(int value) {
        if(value ==6){
            merchant.askMarriage();
        }else if(value ==16){
            merchant.truth();
        }
    }
}
