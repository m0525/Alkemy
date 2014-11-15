package mantle.world;

/**
 * CoordTuple
 *
 * @author mDiyo
 */
@SuppressWarnings("rawtypes")
public class CoordTuple implements Comparable
{
    public final int x;
    public final int y;
    public final int z;

    public CoordTuple(double posX, double posY, double posZ)
    {
        x = (int) Math.floor(posX);
        y = (int) Math.floor(posY);
        z = (int) Math.floor(posZ);
    }

    public boolean equalCoords (int posX, int posY, int posZ)
    {
        if (this.x == posX && this.y == posY && this.z == posZ)
            return true;
        else
            return false;
    }
    
    public boolean equals (Object obj) {
    	if (!(obj instanceof CoordTuple)) {
    		return false;
    	}
    	
    	CoordTuple that = (CoordTuple)obj;
    	return this.x == that.x && this.y == that.y && this.z == that.z;
    }

    @Override
    public int hashCode ()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;
    }

    public String toString ()
    {
        return "X: " + x + ", Y: " + y + ", Z: " + z;
    }

    @Override
    public int compareTo (Object o)
    {
        if (o == null)
            throw new NullPointerException("Object cannot be null");

        CoordTuple coord = (CoordTuple) o;

        if (x < coord.x)
        {
            return -1;
        }
        if (x > coord.x)
        {
            return 1;
        }
        if (y < coord.y)
        {
            return -1;
        }
        if (y > coord.y)
        {
            return 1;
        }
        if (z < coord.z)
        {
            return -1;
        }
        if (z > coord.z)
        {
            return 1;
        }

        return 0;
    }

    public static CoordTuple up (int x, int y, int z)
    {
        return new CoordTuple(x, y + 1, z);
    }

    public static CoordTuple down (int x, int y, int z)
    {
        return new CoordTuple(x, y - 1, z);
    }

    public static CoordTuple north (int x, int y, int z)
    {
        return new CoordTuple(x, y, z - 1);
    }

    public static CoordTuple south (int x, int y, int z)
    {
        return new CoordTuple(x, y, z + 1);
    }

    public static CoordTuple east (int x, int y, int z)
    {
        return new CoordTuple(x + 1, y, z);
    }

    public static CoordTuple west (int x, int y, int z)
    {
        return new CoordTuple(x - 1, y, z);
    }

    public static CoordTuple inFront (int x, int y, int z, int meta)
    {
        switch (meta)
        {
        case 0:
            return down(x, y, z);
        case 1:
            return up(x, y, z);
        case 2:
            return north(x, y, z);
        case 3:
            return south(x, y, z);
        case 4:
            return west(x, y, z);
        case 5:
            return east(x, y, z);
        default:
            return new CoordTuple(x, y, z);
        }
    }

    public static CoordTuple behind (int x, int y, int z, int meta)
    {
        switch (meta)
        {
        case 1:
            return down(x, y, z);
        case 0:
            return up(x, y, z);
        case 3:
            return north(x, y, z);
        case 2:
            return south(x, y, z);
        case 5:
            return west(x, y, z);
        case 4:
            return east(x, y, z);
        default:
            return new CoordTuple(x, y, z);
        }
    }

    public int getDistanceFrom (CoordTuple tuple)
    {
        return getDistanceFrom(tuple.x, tuple.y, tuple.z);
    }

    public int getDistanceFrom (int x1, int y1, int z1)
    {
        int xPos = x - x1;
        int yPos = y - y1;
        int zPos = z - z1;
        return xPos * xPos + yPos * yPos + zPos * zPos;
    }
}
