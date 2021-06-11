package dip.clients;

import dip.processes.GeneralManufacturingProcess;
import dip.processes.SmartPhoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartPhoneManufacturingProcess("iphone");
        manufacturer.launchProcess();
    }
}
