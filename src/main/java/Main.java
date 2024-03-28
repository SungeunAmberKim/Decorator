import burgers.*;
import fries.*;
import hotdogs.*;

public class Main {
    public static void main(String[] args) {
        // Testing
        Burger a = new ExtraPatty(new CheeseBurger(new CheeseBurger(new BasicBurger())));
        System.out.println(a.getCost());
        System.out.println(a.getDescription());

        // fry
        Fry b = new CheeseFry(new Gravy(new BasicFry()));
        System.out.println(b.getCost());
        System.out.println(b.getDescription());

        // hot dog
        HotDog c = new CheeseDog(new ChiliDog(new BasicHotDog()));
        System.out.println(c.getCost());
        System.out.println(c.getDescription());
    }

}
