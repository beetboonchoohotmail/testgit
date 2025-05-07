class FootballClub {

    private String name;
    private int win;
    private int draw;
    private int loose;

    public FootballClub(String name,int win,int draw,int loose){
        this.name = name;
        this.win = win;
        this.draw = draw;
        this.loose = loose;
    }

    public String getName() { return name; }
    public int getLoose() { return loose; }
    public int getWin() { return win; }
    public int getDraw() { return draw; }
    
    public int calculatePoint() {
        return (win * 3 ) + (draw * 1);
    }
}

public class Run55 {
    public static void SortTeam(String[] args) {
        FootballClub temp;
        for(int i = 0; i < 4; i++) {
           for(int j = i + 1 ; j < 4; j++) {
               
           }
        }
    }
}
