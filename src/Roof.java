// Subsystem
public class Roof {
    private boolean built;

    public boolean build(Walls walls) {
        if (!walls.isReady()) return false;
        built = true;
        System.out.println("Roof built");
        return true;
    }

    public boolean isReady() {
        return built;
    }
}
