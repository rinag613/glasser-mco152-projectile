package proj;

public class Main
{
    public static void main(String[] args)
    {
        Projectile ball = new Projectile(39, 77, 0);

        while (ball.getTime() < 11)
        {
            System.out.println("t = " + ball.getTime() + ": (" + ball.getX() + ", " + ball.getY() + ")");
            ball.incTime(1);
        }
    }
}