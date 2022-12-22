package lesson10_tic_tac_toe;

public class Main {
    public static void main(String[] args) {
        //Человек vs Человек
        //Человек vs Компьютер
        //Компьютер vs Компьютер
        //В игре должны быт реализованы проверки:
        //- проверка на занятую ячейку
        //- проверка на вводт правильных координат (которые не выходят за пределы игрового поля)
        //- проверка на победителя и ничью



        //- Доделать необходимые проверки. Добавить режим ComputerKiller, который может сходить, а может и отменить один из ходов соперника (очистить ячейку). Оба действия имеют вероятность 50%, но выполняется только одно.
        //
        //ComputerKiller должен сначала проверить, есть ли на доске клетка соперника.
        //1. Если есть, он бросает монетку (рандом от 0 до 1 включительно)
        //Если выпал 0, к примеру, computer ищет свободную ячейку и ставит туда свой символ
        //Если выпала 1, computer ищет клетку соперника и ставит вместо нее свой символ.
        //2. Если нет, computer ищет только пустую клетку и ставит туда свой символ
        //
        //Поиск подразумевает цикл, работающий до тех пор, пока не будет найдена подходящая яейка

        //|X||_||_|
        //|_||O||_|
        //|_||_||_|


        Game game = new Game();
        game.startGame();

    }
}
