// Client
public class Main {
    public static void main(String[] args) {
        HouseFacade house = new HouseFacade();
        if (house.buildHouse()) {
            System.out.println("House ready");
        } else {
            System.out.println("Cannot build the house");
        }
    }
}
