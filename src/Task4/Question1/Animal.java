package Task4.Question1;

  class Animal{

        public void sound() {
            System.out.println("Animal Makes some Sound:");
        }
    }

    class Cat extends Animal {
        @Override
        public void sound() {

            System.out.println("Cat makes sound as \"meow meow\"");
        }
    }

    class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog makes sound as \"bow bow\"");
        }
    }

