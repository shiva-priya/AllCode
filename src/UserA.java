public class UserA extends Thread {

    @Override
    public void run() {
        try {
            Manager m1 = Manager.getInstance();
            int i = 0;
            while (i < 10) {
                int count = m1.updateCount(10);
                System.out.println("from A " + count);
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
