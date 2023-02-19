package proj;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectileTest {
    public void getX() {
        //given
        Projectile projectile = new Projectile(39, 77);

        projectile.incTime(6);
        //when
        double x = projectile.getX();

        //then
        assertEquals(359.0414, x, 0.0001);
    }

    public void getY() {
        //given
        Projectile projectile2 = new Projectile(39, 77);

        projectile2.incTime(6);
        //when
        double x = projectile2.getX();

        //then
        assertEquals(114.3460, x, 0.0001);
    }
}
