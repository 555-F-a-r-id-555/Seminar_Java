package Lesson_15.Work3_Greetingv2;

public class Main {
    public static void main(String[] args) {
        GreetingManager greetingManager = new GreetingManager();

        greetingManager.setGreeting(new FormalGreeting());
        String greeting = greetingManager.greet();// "Good evening, sir."
        System.out.println(greeting);


        greetingManager.setGreeting(new CasualGreeting());
        greeting = greetingManager.greet(); // "Sup bro?"
        System.out.println(greeting);

        greetingManager.setGreeting(new IntimateGreeting());
        greeting = greetingManager.greet(); // "Hello Darling!"
        System.out.println(greeting);

        greetingManager.setGreeting(new DefaultGreeting());
        greeting = greetingManager.greet(); // "Hello."
        System.out.println(greeting);

        greetingManager.setGreeting(null);
        greeting = greetingManager.greet(); // "Hello WoRLD !)"
        System.out.println(greeting);
    }




}
