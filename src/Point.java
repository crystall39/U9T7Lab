public class Point
{
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Point))
        {
            return false;
        }
        return this.x == ((Point) obj).x && this.y == ((Point) obj).y;
    }

    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
}
