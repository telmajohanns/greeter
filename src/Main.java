import is.hi.tej2.hbv202g.backend.Greeter;
import is.hi.tej2.hbv202g.frontend.UserInterface;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        UserInterface ui = new UserInterface();
        String greeting;

        greeter.setEnglish();
        greeting = greeter.greet();
        ui.show(greeting);

        greeter.setGerman();
        greeting = greeter.greet();
        ui.show(greeting);
    }

}