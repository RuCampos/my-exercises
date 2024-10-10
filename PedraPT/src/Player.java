public class Player {

    public String name;

    Player(String name){
        this.name = name;
    }

    public int move(){

        return NumberGenerator.chooseNumber();

    }}