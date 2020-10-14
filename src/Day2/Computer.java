package Day2;

public class Computer {
    private Memory memory;
    private Processor processor;
    private final String name;

    public Computer(String name){
        this.name = name;
    }

    private void setMemory(int memory){
        this.memory = this.new Memory (memory);
    }

    private void setProcessor(Processor processor){
        this.processor = processor;
    }


    private class Memory{
        private final int size;

        public Memory(int size){
            this.size = size;
        }
    }

    private class Processor{
        private final int numberOfCores;
        private final float frequency;

        public Processor(int numberOfCores, float frequency){
            this.numberOfCores = numberOfCores;
            this.frequency = frequency;
        }
    }


    public static void main(String[] args) {
        Computer firstComputer = new Computer("Dell");
        firstComputer.setMemory(1024);
        firstComputer.setProcessor(firstComputer.new Processor(16,2.5f));
        System.out.println(firstComputer.name);
        System.out.println(firstComputer.memory);
        System.out.println(firstComputer.processor);
    }
}
