package Composition;

public class Computer {
    private String name;
    private Processor processor;

    public Computer(String name, String processorModel) {
        this.name = name;
        this.processor = new Processor(processorModel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processor=" + processor +
                '}';
    }
}