package spacestuff;
public class Particle
{
    protected int gravity = 0;  // How much it will attract objects around itself that will grow its size
    protected double size = 1;
    protected int health = -1;  // Can't be destroyed

    public double get_size()
    {
        return size;
    }
}
