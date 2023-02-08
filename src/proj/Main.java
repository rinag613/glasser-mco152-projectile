package proj;

public class Main
{
    public static void main(String[] args)
    {
        Projectile ball = new Projectile(39, 77);

       for(int i=0;i<11;i++){
            System.out.println("t = " + ball.getTime() + ": (" + ball.getX() + ", " + ball.getY() + ")");
            ball.incTime(1);
        }
    }
}