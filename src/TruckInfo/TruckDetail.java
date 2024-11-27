package TruckInfo;

public class TruckDetail {


    private String name;
    private String Driver_name;
    private int capacity;

    public TruckDetail(String name, String driver_name, int capacity) {
        this.name = name;
        Driver_name = driver_name;
        this.capacity = capacity;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.capacity);
        System.out.println(this.Driver_name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver_name() {
        return Driver_name;
    }

    public void setDriver_name(String driver_name) {
        Driver_name = driver_name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }




}
