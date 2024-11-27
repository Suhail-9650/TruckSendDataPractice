package TruckInfo;

public class TruckServices {
    public static void main(String[] args) {
        AddData addData = new AddData();
        TruckDetail truckDetail = new TruckDetail("tata", "ali", 5000);
        TruckDetail truckDetail1 = new TruckDetail("eicher", "sk", 2000);
        TruckDetail truckDetail2 = new TruckDetail("volvo", "pk", 2500);

        addData.Adddata(truckDetail);
    }
}
