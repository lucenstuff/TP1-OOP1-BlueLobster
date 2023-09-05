public class computer {
    private cpu CPU;
    private memory Memory;
    private peripherals Pripherals;

    public computer(cpu CPU, memory memory, peripherals pripherals) {
        this.CPU = CPU;
        Memory = memory;
        Pripherals = pripherals;
    }

    public cpu getCPU() {
        return CPU;
    }

    public void setCPU(cpu CPU) {
        this.CPU = CPU;
    }

    public memory getMemory() {
        return Memory;
    }

    public void setMemory(memory memory) {
        Memory = memory;
    }

    public peripherals getPripherals() {
        return Pripherals;
    }

    public void setPripherals(peripherals pripherals) {
        Pripherals = pripherals;
    }


}
