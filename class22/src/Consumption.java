import java.util.ArrayList;

public class Consumption {

    private double maxPerformance = 12000;

    private ArrayList<Devices> deviceList = new ArrayList<Devices>();

    public void  addDeviceList(Devices watt){

        this.deviceList.add(watt);
    }


    public void setDeviceList(ArrayList<Devices> deviceList) {

        this.deviceList = deviceList;


        //for (int i = 0; i < deviceList.size(); i++){

        double currentWatt = 0;


        currentWatt = currentWatt + this.deviceList.add().deviceWatt();

        System.out.println(currentWatt);

        // if(currentWatt == maxPerformance){

    }
}

}
