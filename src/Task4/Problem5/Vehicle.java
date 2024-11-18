package Task4.Problem5;

public interface Vehicle {
        void start();
        void stop();
    }
    class Bike implements Vehicle {
        public void start(){
            System.out.println("She rides bike");
        }
        public void stop(){
            System.out.println("she stops bike");
        }
    }

    class Car implements Vehicle{
        public void start(){
            System.out.println("She drives car");
        }
        public void stop(){
            System.out.println("she stops car");
        }
    }

