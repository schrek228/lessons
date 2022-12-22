package lesson10_tic_tac_toe;

import scn.MyScanner;

import java.util.Random;

public class ComputerPlayer extends Player {


    public ComputerPlayer(Symbol symbol, Symbol[][] gameField) {
        super(symbol, gameField);
    }

    //ход игрока
    public void makeStep() {
        Random rnd = new Random();
        boolean correct = false;
        int row=0;
        int col=0;
        while (!correct) {
            row = rnd.nextInt(gameField.length);
            col = rnd.nextInt(gameField.length);
            if (isEmpty(row, col)) {
                correct = true;
            }else{
                System.out.println("Invalid row or column");
            }
        }
        gameField[row][col] = symbol;
        try {
            Thread.sleep(700); //пауза на 700 миллисекунд
        } catch (InterruptedException e) {

        }

    }
}
