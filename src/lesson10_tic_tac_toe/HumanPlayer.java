package lesson10_tic_tac_toe;

import scn.MyScanner;

public class HumanPlayer extends Player{


    public HumanPlayer(Symbol symbol, Symbol[][] gameField) {
        super(symbol, gameField);
    }

    //ход игрока
    public void makeStep(){
        MyScanner scn = new MyScanner();
        boolean empty = false;
        int row;
        int col;
        do {
            row = scn.nextInt("Enter row: ");
            col = scn.nextInt("Enter col: ");
            if(isEmpty(row,col)) {
                empty = true;
            }else {
                System.out.println("Cell is busy");
            }
        }while(!empty);
        gameField[row][col] = symbol;
    }
}
