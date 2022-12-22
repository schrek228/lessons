package lesson7_reqursion2;

public class Main {
    public static void main(String[] args) {
        //Задача 1 Создать двумерную матрицу размером 5x5.
        //Разместить на ней клетку выхода E, клетку игрока P и стены (в виде звездочек), через которые игрок P не может ходить.
        //Игрок может ходить в любом направлении.
        //
        //Пример:
        //|_||_||E||_||_|
        //|_||P||_||_||_|
        //|_||_||_||_||_|
        //|*||*||*||_||_|
        //|*||E||_||_||_|

        //Для сампера нужно отрыть все смежные ячейки и смежные смежных ячеек (цепная реакция)
        //Кликунли сюда (плюсик - открытая ячейка, куда кликнули)
        //|+||_||_||_||_|
        //|*||_||_||*||*|
        //|_||*||_||*||_|
        //|_||_||*||_||_|
        //|_||_||_||_||_|
        //И получили такой массив
        //|+||+||+||+||+|
        //|*||+||+||*||*|
        //|_||*||+||*||_|
        //|_||_||*||_||_|
        //|_||_||_||_||_|


        //
        //Разработайте алгорим, который будет с помощью рекурсии определять, есть ли путь от игрока P до выхода E или нет.
        //Метод должен возвращать true или false.
        //В данном примере путь от P до E лежит через правую сторону от E.
        PathFinder pathFinder = new PathFinder();
        pathFinder.print();
        System.out.println(pathFinder.findExit(1, 1));
        pathFinder.print();


    }


}

class PathFinder{
    String[][] arr = new String[5][5];
    public static final String EMPTY = "|_|";
    public static final String PLAYER = "|P|";
    public static final String EXIT = "|E|";
    public static final String WALL = "|*|";
    public static final String VISITED = "|+|";

    public PathFinder(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = EMPTY;
            }
        }
        arr[1][1] = PLAYER;
        arr[3][0] = arr[3][1] = arr[3][2] = WALL;
        arr[4][0] = WALL;
        arr[4][1] = EXIT;
//        arr[0][2] = EXIT;
    }

    public boolean findExit(int row, int col){
        if(isExit(row,col)){
            return true;
        }
        arr[row][col] = VISITED;
        return tryCell(row, col-1) ||
                tryCell(row-1, col) ||
                tryCell(row, col+1) ||
                tryCell(row+1, col);
    }
    private boolean tryCell(int r, int c){
        if(exist(r,c) && !isWall(r,c) && !visited(r,c)){
            return findExit(r,c);
        }
        return false;
    }


//    public boolean findExit(int row, int col){
//        arr[row][col] = VISITED;
//        int r;
//        int c;
//        boolean result = false;
//        //идем влево
//        r = row;
//        c = col-1;
//        if(exist(r,c) && !isWall(r,c) && !visited(r,c)){
//            if(isExit(r,c)){
//                return true;
//            }else{
//                result = result || findExit(r,c);
//            }
//        }
//        if(result) return true;
//        //идем вверх
//        r = row-1;
//        c = col;
//        if(exist(r,c) && !isWall(r,c) && !visited(r,c)){
//            if(isExit(r,c)){
//                return true;
//            }else{
//                result = result || findExit(r,c);
//            }
//        }
//        if(result) return true;
//        //идем вправо
//        r = row;
//        c = col+1;
//        if(exist(r,c) && !isWall(r,c) && !visited(r,c)){
//            if(isExit(r,c)){
//                return true;
//            }else{
//                result = result || findExit(r,c);
//            }
//        }
//        if(result) return true;
//        //идем вниз
//        r = row+1;
//        c = col;
//        if(exist(r,c) && !isWall(r,c) && !visited(r,c)){
//            if(isExit(r,c)){
//                return true;
//            }else{
//                result = result || findExit(r,c);
//            }
//        }
//        return result;
//
//
//    }

    public boolean isWall(int row, int col){
        return arr[row][col].equals(WALL);
    }
    public boolean isExit(int row, int col){
        return arr[row][col].equals(EXIT);
    }

    public boolean visited(int row, int col){
        return arr[row][col].equals(VISITED);
    }
    public boolean exist(int row, int col){
        return row >=0 && row <arr.length && col >=0 && col <arr.length;
    }

    public void print(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
