//Laptop computer: adds screen size to other Computer info

public class Laptop { //Laptop no longer inherits from Computer
    private Computer computer;
    String screenSize=null;

    //Constructors
    public Laptop() {} //No-arg constructor

    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        //Inherited from Computer superclass
        this.computer = new Computer(CPU, RAM, disk);

        //Only in Laptop subclass
        this.screenSize=screenSize;
    }

    //Setter
    public void setScreenSize(String screenSize) {
        this.screenSize=screenSize;
    }

    //Getter
    public String getScreenSize() {
        return this.screenSize;
    }

    public String getCPU() { return computer.getCPU(); }
    public String getRAM() { return computer.getRAM(); }
    public String getDisk() { return computer.getDisk(); }
    public void setComputer(Computer computer) { this.computer = computer; }
    public Computer getComputer() { return computer; }

    //Return formatted version of data
    public String toString() {
        return "Type:Laptop\tCPU:" + computer.getCPU() + "\tRAM:" + computer.getRAM() + "\tDisk:" + computer.getDisk() + "\tScreen:" + this.screenSize;
    }
    
}