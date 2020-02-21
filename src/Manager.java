import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Manager implements Serializable {

    static int noOfObjects = 0;
    {
        noOfObjects += 1;
        System.out.println(noOfObjects + " - Num Object Created");
    }

    private static Manager manager = null;
    int count = 0;

    public static Manager getInstance()
    {
        if(manager==null)
        {
            manager = new Manager();
            System.out.println("Manager Created");
        }
        else
        {
            System.out.println("Old Object Used");
        }
        return manager;
    }

    public int updateCount(int newcount)
    {
        count += newcount;
        return count;
    }

}
