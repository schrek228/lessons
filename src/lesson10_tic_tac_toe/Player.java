package lesson10_tic_tac_toe;

public class Player {
    Symbol symbol;
    Symbol[][] gameField;

    public Player(Symbol symbol, Symbol[][] gameField) {
        this.symbol = symbol;
        this.gameField = gameField;
    }

    //ход игрока
    public void makeStep(){
    }

    public boolean isEmpty(int row, int col) {
        return gameField[row][col] == Symbol.EMPTY;
    }
}
