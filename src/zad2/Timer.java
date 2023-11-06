package zad2;
    public class Timer{
        private long start=0;
        private long stop=0;

        public Timer(){

        }

        public void start(){
            start = 0;
            start = System.nanoTime();
        }

        public String stop(){
            stop = System.nanoTime();
            return String.valueOf(stop-start);
        }
    }
