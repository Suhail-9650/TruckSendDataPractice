package TruckInfo;

public class AddData {

    public void Adddata(TruckDetail truckDetail){
        System.out.println("data added");
        System.out.println(truckDetail.getName());
        System.out.println(truckDetail.getCapacity());
        System.out.println(truckDetail.getDriver_name());
        System.out.println("data end ");
        truckDetail.display();
    }

}
