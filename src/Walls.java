// Subsystem
public class Walls {
    private int builtWalls;
    private int requiredWalls = 4;

    public boolean build(Foundation foundation) {
        if (!foundation.isReady()) return false;
        while (builtWalls < requiredWalls) {
            builtWalls++;
            System.out.println("Wall " + builtWalls + " built");
        }
        return true;
    }

    public boolean isReady() {
        return builtWalls == requiredWalls;
    }
}
