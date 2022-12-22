package lesson10_tic_tac_toe;

import scn.MyScanner;

import java.util.Random;

public class Game {

    Symbol[][] gameField = new Symbol[3][3];

    public Game() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void startGame() {
        Player player1 = null;
        Player player2 = null;
        System.out.println("1. Человек vs Человек\n" +
                "2. Человек vs Компьютер\n" +
                "3. Компьютер vs Компьютер");

        MyScanner scn = new MyScanner();
        int input = scn.nextInt();
        if (input == 1) {
            player1 = new HumanPlayer(Symbol.X, gameField);
            player2 = new HumanPlayer(Symbol.O, gameField);
        }
        else if (input == 2) {
            player1 = new HumanPlayer(Symbol.X, gameField);
            player2 = new ComputerPlayer(Symbol.O, gameField);
        }
        else if (input == 3) {
            player1 = new ComputerPlayer(Symbol.X, gameField);
            player2 = new ComputerPlayer(Symbol.O, gameField);
        }


        int turn = 0;
        while (true) {
            printField();
            if (turn % 2 == 0) {
                player1.makeStep(); //пример полиморфизма
            } else {
                player2.makeStep(); //пример полиморфизма
            }
            turn++;
        }


    }

    //Плохая реализация без полиморфизма с дублированным кодом
//    public void startGame(){
//        System.out.println("1. Человек vs Человек\n" +
//                "2. Человек vs Компьютер\n" +
//                "3. Компьютер vs Компьютер");
//        MyScanner scn = new MyScanner();
//        int input = scn.nextInt();
//        if(input == 1){
//            int turn = 0;
//            while(true){
//                printField();
//                int row = scn.nextInt("Enter row: ");
//                int col = scn.nextInt("Enter col: ");
//                if(isEmpty(row,col)) {
//                    if (turn % 2 == 0) {
//                        gameField[row][col] = Symbol.X;
//                    } else {
//                        gameField[row][col] = Symbol.O;
//                    }
//                    turn++;
//                }else{
//                    System.out.println("Cell is busy");
//                }
//            }
//        }
//        else if(input == 2){
//            Random rnd = new Random();
//            int turn = 0;
//            while(true){
//                printField();
//                int row;
//                int col;
//                if(turn % 2 == 0) {
//                    row = scn.nextInt("Enter row: ");
//                    col = scn.nextInt("Enter col: ");
//                }
//                else{
//                    row = rnd.nextInt(gameField.length);
//                    col = rnd.nextInt(gameField.length);
//                }
//                if(isEmpty(row,col)) {
//                    if (turn % 2 == 0) {
//                        gameField[row][col] = Symbol.X;
//                    } else {
//                        gameField[row][col] = Symbol.O;
//                    }
//                    turn++;
//                }else{
//                    System.out.println("Cell is busy");
//                }
//            }
//        }
//
//    }



    public void printField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][j]);

            }
            System.out.println();
        }
        System.out.println();
    }

}
