package lesson10_tic_tac_toe;

public enum Symbol {
    X("|X|"),O("|O|"),EMPTY("|_|");

    String text;

    Symbol(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
