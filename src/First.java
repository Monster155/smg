public class First {
    public static void main(String[] args) {
        Second s = new Second();
        Data d = new Data(s);
        AnotherThread anotherThread = new AnotherThread(d);
        anotherThread.start();
    }

    private static class Second{
        public void hello(){
            System.out.println("Hello");
        }
    }

    private static class AnotherThread extends Thread {
        Data data;
        public AnotherThread(Data d){
            data = d;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.finish();
        }
    }

    private static class Data{
        Second f;
        public Data(Second first){
            f = first;
        }
        public void finish(){
            f.hello();
        }
    }
}
