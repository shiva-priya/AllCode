import java.io.*;

public class Demo1 implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;
    int count=0;

    public static Demo1 getInstance(int k)
    {
        Demo1 d = null;
        try
        {
            //open file store.txt
            FileInputStream fin = new FileInputStream("store.txt");

            //if store has some content
            if(fin.available() > 0) {

                ObjectInputStream in=new ObjectInputStream(fin);    //create object input
                d = (Demo1) in.readObject();     //read the object
                System.out.println(d);
                System.out.println("Prev Obj Used");
            }
            else {      //no content in file
                d = new Demo1();
                System.out.println("new obj created");
            }
            return d;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error");
        }
        return d;
    }

   public  void close(Demo1 d)
   {
       try {
           FileOutputStream fout=new FileOutputStream("store.txt");     //open store
           ObjectOutputStream out=new ObjectOutputStream(fout);
           out.writeObject(d);  //write into store
           System.out.println("Written");
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
   }

   public int updateCount(int k)
   {
       count += k;
       System.out.println("The count is "+count);
       return count;
   }
}
