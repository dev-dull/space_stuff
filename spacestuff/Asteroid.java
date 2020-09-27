package spacestuff;

import java.util.concurrent.ThreadLocalRandom;

public class Asteroid extends Particle
{
    public Asteroid()
    {
        size = ThreadLocalRandom.current().nextInt(10, 530000);
    }
}

/*
public class Particle
{
    private int gravity = 0;  // How much it will attract objects around itself that will grow its size
    private double size = 1;
    private int health = -1;  // Can't be destroyed

    public double get_size()
    {
        return size;
    }
}
*/
