package Task4.Problem1;

public class Animal {
        void sound() {
            String cat="meow";
            String dog="bow";
            System.out.println(cat);
            System.out.println(dog);
        }
    }
    class Dog extends  Animal{
        @Override void sound(){
            String cat="meow meow";
            System.out.println(cat);
        }
    }
    class Cat extends Animal{
        @Override void sound(){
            String dog="bow bow";
            System.out.println(dog);
        }
    }


