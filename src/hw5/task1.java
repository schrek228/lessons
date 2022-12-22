package hw5;



public class task1 {
    public static void main(String[] args) {
        Pistol pistol = new Pistol();
        Bullet bullet = new Bullet(5,200);
        System.out.println("Damage equals " + pistol.shot(bullet));
    }
}
class Pistol{
    private Bullet bullet;

    public int shot(Bullet bullet){
        return(bullet.getMass()* bullet.getSpeed());
    }

}
class Bullet{
    private int mass;
    private int speed;

    public int getMass() {
        return mass;
    }
    public int getSpeed(){
        return speed;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Bullet(int mass, int speed) {
        this.mass = mass;
        this.speed = speed;
    }
}