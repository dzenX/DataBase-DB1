/**
 * Created by spide on 06.09.2017.
 */

public class OlympicGame {
    private int id;
    private int year_of_game;
    public OlympicGame(){
        id = -1;
        year_of_game = -1;
    }
    public OlympicGame(int _id, int _year_of_game){
        id = _id;
        year_of_game = _year_of_game;
    }
    public int getId(){
        return id;
    }
    public int getYear(){
        return year_of_game;
    }
}
