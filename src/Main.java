public class Main {

    public static void main(String args[])
    {
       UserA a = new UserA();
       UserB b = new UserB();
       a.start();
       b.start();
    }
}
        /*
        System.out.println("\n\n");
      DemoManager d = DemoManager.getInstance();
      d.updateCount(10);
//      d.close(d);

      DemoManager d1 = DemoManager.getInstance();
      d1.updateCount(4);
      d1.close(d);

    }

    public static void test() {
        DemoManager d = DemoManager.getInstance();
        d.updateCount(10);
        d.close(d);

    }

         */

