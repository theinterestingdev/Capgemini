package SmartHome;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH001", true, 22.5);
        thermostat.displayStatus();
    }
}
