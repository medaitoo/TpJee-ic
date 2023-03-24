package metier;

import dao.IUSB;
import dao.IVGA;

public class UniteCentrale {
    IUSB usb;
    IVGA vga;
    public UniteCentrale(IUSB usb,IVGA vga){
        this.usb=usb;
        this.vga=vga;
    }

    public int readData(){
        return usb.read();
    }

    public void printData(String data){
        vga.print(data);
    }
}
