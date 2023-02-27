package lesson16_1_stream;

import java.util.List;

public class Main5_reduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        //Найти сумму чисел через reduce

        Integer sum = list.stream().reduce(0, (result, val) -> {
            result += val;
            return result;
        });
        System.out.println(sum);

        //Есть список персонажей. Получить их босса. Босс имеет здоровье и урон, равные сумме здоровя и уронов всех персонажей
        List<Player> players = List.of(new Player("player1", 10, 100), new Player("player2", 12, 100) );
        Player bossPlayer = players.stream().reduce(new Player("boss", 0, 0), (boss, player) -> {
            boss.health += player.health;
            boss.damage += player.damage;
            return boss;
        });
        System.out.println(bossPlayer);
    }
}

class Player{
    String name;
    int damage;
    int health;

    public Player(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                '}';
    }
}
