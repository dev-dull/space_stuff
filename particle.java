class Particle
{
    private int gravity = 0;  // How much it will attract objects around itself that will grow its size
    private double size = 1;
    private int health = -1;  // Can't be destroyed

    public static double get_size()
    {
        return size;
    }
}
