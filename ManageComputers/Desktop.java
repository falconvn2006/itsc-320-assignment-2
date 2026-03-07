//Desktop computer: adds GPU type

// Change to immutable class 
public final class Desktop { 

    // Make GPUType and computer fields private and final
    private final Computer computer; //Composition: Desktop has a Computer
    private final String GPUType;
    
    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        //Inherited from Computer superclass
        this.computer = new Computer(CPU, RAM, disk);

        //Only in Desktop subclass
        this.GPUType=GPUType;
        
        
    }
    
    // Constructor for creating deep copies
    public Desktop(Desktop copy) {
    	this.computer = copy.computer;
    	this.GPUType = new String(copy.GPUType);
    }

    //Getter for the Desktop along with repeats from the Computer class
    public String getGPUType() {
        return GPUType;
    }

    public String getCPU() {
        return computer.getCPU();
    }

    public String getRAM() {
        return computer.getRAM();
    }

    public String getDisk() {
        return computer.getDisk();
    }

    //Return formatted version of data
    public final String toString() {
        return "Type:Desktop\tCPU:" + computer.getCPU() + "\tRAM:" + computer.getRAM() + "\tDisk:" + computer.getDisk() + "\tGPU:" + GPUType;
    }

}