//Laptop computer: adds screen size to other Computer info

public final class Laptop { //Laptop no longer inherits from Computer
    private final Computer computer;
    private final String screenSize;

    //Constructors

    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        //Inherited from Computer superclass
        this.computer = new Computer(CPU, RAM, disk);

        //Only in Laptop subclass
        this.screenSize=screenSize;
    }

    //Getter
    public String getScreenSize() {
        return this.screenSize;
    }

    public String getCPU() { return computer.getCPU(); }
    public String getRAM() { return computer.getRAM(); }
    public String getDisk() { return computer.getDisk(); }
    public Computer getComputer() { return computer; }

    //Return formatted version of data
    public String toString() {
        return "Type:Laptop\tCPU:" + computer.getCPU() + "\tRAM:" + computer.getRAM() + "\tDisk:" + computer.getDisk() + "\tScreen:" + this.screenSize;
    }
    
}