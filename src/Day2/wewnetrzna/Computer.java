package Day2.wewnetrzna;

public class Computer {

    private final String name;
    private Processor processor;
    private Memory memory;

    public Computer(String name) {
        this.name = name;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(int memory) {
        this.memory = this.new Memory(memory);
    }

    public class Processor {
        private final int cores;
        private final int cpuInMhz;

        public Processor(int cores, int cpuInMhz) {
            this.cores = cores;
            this.cpuInMhz = cpuInMhz;
        }
    }

    private class Memory {
        private final int memoryInMb;

        public Memory(int memoryInMb) {
            this.memoryInMb = memoryInMb;
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Zestaw1");
        Processor processor = computer.new Processor(4, 2048);
        computer.setProcessor(processor);
        computer.setMemory(8192);
    }

}
