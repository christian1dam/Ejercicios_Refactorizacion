package tarea_6_2;

public class Player {
    int x, y;
    //Creo los constructores
    public Player(){}
    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Para acceder a los elementos de la clase uso this.
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
