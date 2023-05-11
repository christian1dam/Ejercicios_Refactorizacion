package tarea_6_2;

public class Game {
    Player player;

    //Creo los constructores
    public Game(){}
    public Game(Player player){
        this.player = player;
    }

    //Si el programa está en inglés todos los nombres estarán en inglés.
    public void movement(String movement){
        if(movement.equalsIgnoreCase("Right")) {
            player.setX(player.getX()+1);
        }
        if(movement.equalsIgnoreCase("Left")) {
            player.setX(player.getX()-1);
        }
        if(movement.equalsIgnoreCase("Top")) {
            player.setY(player.getY()-1);
        }
        if(movement.equalsIgnoreCase("Bottom")) {
            player.setY(player.getY()+1);
        }
    }
}
