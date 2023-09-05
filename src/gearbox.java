public class gearbox {
    public enum GearboxType {
        MANUAL,
        AUTOMATIC
    }

    private GearboxType type;
    private int shifts;

    public int getShifts() {
        return shifts;
    }

    public gearbox(GearboxType type, int shifts) {
        this.type = type;
        this.shifts = shifts;
    }

    public void setShifts(int shifts) {
        this.shifts = shifts;
    }

    public gearbox(GearboxType type) {
        this.type = type;
    }

    public GearboxType getType() {
        return type;
    }

    public void setType(GearboxType type) {
        if (type == GearboxType.MANUAL || type == GearboxType.AUTOMATIC) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid gearbox type");
        }
    }

    @Override
    public String toString() {
        return "Gearbox{" +
                "type=" + type +
                '}';
    }

}
