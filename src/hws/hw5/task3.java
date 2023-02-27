//package hws.hw5;
//
//import scn.MyScanner;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class task3 {
//    public static void main(String[] args) {
//        int select=0;
//        MyScanner scn = new MyScanner();
//        while (select!=3){
//            select = scn.nextInt("""
//                    1. Добавить карту (юзер вводит с консоли масть и значение)
//                    2. Blackjack
//                    3. Выход
//                    """);
//            if(select==1){
//                Deck deck = new Deck(cards);
//                deck.makeDeck();
//
//            }
//            if(select==2){
//                Random rnd = new Random();
//                String[] suits = {"D","C","H","S"};
//                String[] ranks = {"6","7","8","9","10","8","9","10","11"};
//                Card[] cards1 = new Card[10];
//                Card[] cards2 = new Card[10];
//                for (int i = 0; i < 10; i++) {
//                    cards1[i] = new Card("a","a");
//                    cards2[i] = new Card("a","a");
//                }
//                System.out.println("Let us play blackjack my friend");
//                Deck yourDeck = new Deck(cards1);
//                int yourIndex=0;
//                int yourSum=0;
//                Deck myDeck = new Deck(cards2);
//                int myIndex=0;
//                int mySum=0;
//                for (int i = 0; i < 2; i++) {
//
//                    cards1[i].setSuit(suits[rnd.nextInt(0,4)]);
//                    cards1[i].setRank(ranks[rnd.nextInt(0,9)]);
//
//                }
//                yourDeck.setCards(cards1);
//                yourIndex=2;
//                yourSum+=Integer.parseInt(cards1[0].getRank());
//                yourSum+=Integer.parseInt(cards1[1].getRank());
//                for (int i = 0; i < 2; i++) {
//                    cards1[i].setSuit(suits[rnd.nextInt(0,4)]);
//                    cards2[i].setRank(ranks[rnd.nextInt(0,9)]);
//
//                }
//                myDeck.setCards(cards1);
//                myIndex=2;
//                mySum+=Integer.parseInt(cards2[0].getRank());
//                mySum+=Integer.parseInt(cards2[1].getRank());
//                select = 0;
//                while (select!=3){
//                    select = scn.nextInt("берешь карту? 1-да 2-нет");
//                    if(select==1){
//                        yourIndex++;
//                        myIndex++;
//                        cards1[yourIndex].setSuit(suits[rnd.nextInt(0,4)]);
//                        cards1[yourIndex].setRank(ranks[rnd.nextInt(0,9)]);
//                        cards2[myIndex].setSuit(suits[rnd.nextInt(0,4)]);
//                        cards2[myIndex].setRank(ranks[rnd.nextInt(0,9)]);
//                        mySum+=Integer.parseInt(cards1[myIndex].getRank());
//                        yourSum+=Integer.parseInt(cards2[yourIndex].getRank());
//                        if(mySum==21){
//                            System.out.println("ты проиграл, у меня 21");
//                            break;
//                        }
//                        if(mySum>21){
//                            System.out.println("ты выиграл, у меня перебор");
//                            break;
//                        }
//                        if(yourSum==21){
//                            System.out.println("ты выиграл, у тебя 21");
//                            break;
//                        }
//                        if(yourSum>21){
//                            System.out.println("ты проиграл, у тебя перебор");
//                            break;
//                        }
//
//
//                    }
//                    if(select==2){
//                        myIndex++;
//                        cards2[myIndex].setSuit(suits[rnd.nextInt(0,4)]);
//                        cards2[myIndex].setRank(ranks[rnd.nextInt(0,9)]);
//                        mySum+=Integer.parseInt(cards1[myIndex].getRank());
//                        if(mySum==21){
//                            System.out.println("ты проиграл, у меня 21");
//                            break;
//                        }
//                        if(mySum>21){
//                            System.out.println("ты выиграл, у меня перебор");
//                            break;
//                        }
//                        if(yourSum==21){
//                            System.out.println("ты выиграл, у тебя 21");
//                            break;
//                        }
//                        if(yourSum>21){
//                            System.out.println("ты проиграл, у тебя перебор");
//                            break;
//                        }
//                    }
//                }
//            }
//
//        }
//    }
//}
//class Card{
//    private String suit;
//    private String rank;
//    private String[] suits = {"D","C","H","S"};
//    private String[] ranks = {"6","7","8","9","10","8","9","10","11"};
//
//    public Card(String rank,String suit) {
//        this.rank = rank;
//        this.suit = suit;
//    }
//
//
//    public String getSuit() {
//        return suit;
//    }
//    public String getRank(){
//        return rank;
//    }
//    public void setRank(String rank) {
//        this.rank = rank;
//    }
//    public void setSuit(String suit) {
//        this.suit = suit;
//    }
//}
//class Deck{
//    private Card[] cards;
//
//    public Deck() {
//        this.cards = new Card[10];
//        for (int i = 0; i < cards.length; i++) {
//            cards[i] = new Card("a","a");
//        }
//    }
//
//    public Card[] getCards() {
//        return cards;
//    }
//
//    public void setCards(Card[] cards) {
//        this.cards = cards;
//    }
//    public void makeDeck(){
//        MyScanner scn = new MyScanner();
//
//        for (int i = 0; i < 10; i++) {
//            Card carta = new Card(scn.next("Введите номинал"),scn.next("Введите масть"));
//            for (int j = 0; j < 10; j++) {
//                if (!carta.equals(cards[j])) {
//                    cards[i] = carta;  // почему-то не работает
//                }
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(cards[i].getSuit()+cards[i].getRank());
//        }
//
//    }
//}
