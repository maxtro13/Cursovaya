package Command;

import Characters.Character;

import java.io.*;

public class Speaker {
    private AlenushkaCommand alenushkaCommand;

    private IvanCommand ivanCommand;
    private GrandfatherCommand grandfatherCommand;
    private GrandmotherCommand grandmotherCommand;
    private MerchantCommand merchantCommand;
    private ServantCommand servantCommand;
    private WitchCommand witchCommand;

    public Speaker(
            GrandfatherCommand grandfatherCommand,
            GrandmotherCommand grandmotherCommand,
            AlenushkaCommand alenushkaCommand,
            IvanCommand ivanCommand,
            MerchantCommand merchantCommand,
            ServantCommand servantCommand,
            WitchCommand witchCommand) {
        this.alenushkaCommand = alenushkaCommand;
        this.ivanCommand = ivanCommand;
        this.grandfatherCommand = grandfatherCommand;
        this.grandmotherCommand = grandmotherCommand;
        this.merchantCommand = merchantCommand;
        this.servantCommand = servantCommand;
        this.witchCommand = witchCommand;
    }

    public void choice(String filename) {
        File file = new File(filename);
        if (file.isFile()) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
                if (bf.ready()) {
                    while (bf.ready()) {
                        int value = Integer.parseInt(bf.readLine());
                        if (value == 1) {
                            grandfatherCommand.execute(1);
                        } else if (value == 2) {
                            grandmotherCommand.execute(2);
                        } else if (value == 3) {
                            alenushkaCommand.execute(3);
                        } else if (value == 4) {
                            ivanCommand.execute(4);
                        } else if (value == 5) {
                            alenushkaCommand.execute(5);
                        } else if (value == 6) {
                            ivanCommand.execute(6);
                        } else if (value == 7) {
                            alenushkaCommand.execute(7);
                        } else if (value == 8) {
                            merchantCommand.execute(8);
                        } else if (value == 9) {
                            witchCommand.execute(9);
                        } else if (value == 10) {
                            ivanCommand.execute(10);
                        } else if (value == 11) {
                            witchCommand.execute(11);
                        } else if (value == 12) {
                            ivanCommand.execute(12);
                        } else if (value == 13) {
                            ivanCommand.execute(13);
                        } else if (value == 14) {
                            alenushkaCommand.execute(14);
                        } else if (value == 15) {
                            servantCommand.execute(15);
                        } else if (value == 16) {
                            merchantCommand.execute(16);
                        } else if (value == 17) {
                            ivanCommand.execute(17);
                        } else if (value == 18) {
                            witchCommand.execute(18);
                        }
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Путь к файлу указан не верно.!!");
        }
    }

}
