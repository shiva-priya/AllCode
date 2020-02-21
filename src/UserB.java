public class UserB extends Thread{

    @Override
    public void run() {
        try {
            Manager m2 = Manager.getInstance();
            int i = 0;
            while (i < 10) {
                int count = m2.updateCount(10);
                System.out.println("from B " + count);
                i++;
                Thread.sleep(10);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }

}
