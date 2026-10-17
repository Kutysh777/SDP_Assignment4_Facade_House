// Subsystem
public class HouseInspection {
    public boolean check(Foundation foundation, Walls walls, Roof roof) {
        if (!foundation.isReady() || !walls.isReady() || !roof.isReady()) {
            return false;
        }
        System.out.println("House inspection passed");
        return true;
    }
}
