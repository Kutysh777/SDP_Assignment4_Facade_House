// Subsystem
public class Foundation {
    private boolean built;
    private boolean dry;

    public boolean build() {
        if (built) return false;
        built = true;
        System.out.println("Foundation built");
        return true;
    }

    public boolean dry() {
        if (!built) return false;
        dry = true;
        System.out.println("Foundation dried");
        return true;
    }

    public boolean isReady() {
        return built && dry;
    }
}
