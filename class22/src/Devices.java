public class Devices {

    private String device;

    private double watt;

    public Devices(String device, double watt){

        this.device = device;

        this.watt = watt;
    }
    public double deviceWatt(){

        return watt;
    }

    public void deviceIson(){

        System.out.println(this.device + " is ON!");
    }
}
