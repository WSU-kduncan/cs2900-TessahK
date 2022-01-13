class Player {

    private String name;
    private char symbol;
    private int wins;
    private int losses;
    private int ties;
    private boolean isHuman

    Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
        wins = 0;
        losses = 0;
        ties = 0;
        isHuman = true;
    }

    public int move(Board theBoard){
        return 1;
    }

    public String toString() {
        // Name (wins-losses-ties): symbol
        
    }
     
}
