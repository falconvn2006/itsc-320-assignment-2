//Desktop computer: adds GPU type

public class Desktop { 
    Computer computer; //Composition: Desktop has a Computer
    String GPUType=null;

    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        //Inherited from Computer superclass
        this.computer = new Computer(CPU, RAM, disk);

        //Only in Desktop subclass
        this.GPUType=GPUType;
    }

    //Setter
    public void setGPUType(String GPUType) {
        this.GPUType=GPUType;
    }

    //Getter for the Desktop along with repeats from the Computer class
    public String getGPUType() {
        return this.GPUType;
    }

    public String getCPU() {
        return this.computer.getCPU();
    }

    public String getRAM() {
        return this.computer.getRAM();
    }

    public String getDisk() {
        return this.computer.getDisk();
    }

    //Return formatted version of data
    public String toString() {
        return "Type:Desktop\tCPU:" + this.computer.getCPU() + "\tRAM:" + this.computer.getRAM() + "\tDisk:" + this.computer.getDisk() + "\tGPU:" + this.GPUType;
    }

}