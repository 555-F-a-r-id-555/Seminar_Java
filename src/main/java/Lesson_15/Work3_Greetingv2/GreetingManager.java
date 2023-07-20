package Lesson_15.Work3_Greetingv2;

public class GreetingManager  implements Greeting{
    private Greeting greeting;

//    public GreetingManager(Greeting greeting) {
//        this.greeting = greeting;
//    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        if (greeting != null) {
            return greeting.greet();
        } else {
            return "Hello World !)";
        }
    }
}
