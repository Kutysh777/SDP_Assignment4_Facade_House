// Facade
public class HouseFacade {
    private Foundation foundation = new Foundation();
    private Walls walls = new Walls();
    private Roof roof = new Roof();
    private HouseInspection inspection = new HouseInspection();

    public boolean buildHouse() {
        if (!foundation.build()) return false;
        if (!foundation.dry()) return false;
        if (!walls.build(foundation)) return false;
        if (!roof.build(walls)) return false;
        return inspection.check(foundation, walls, roof);
    }
}
