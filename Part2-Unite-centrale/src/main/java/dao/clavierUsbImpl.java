package dao;

import jdk.jfr.Category;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class clavierUsbImpl implements IUSB {
    @Override
    public int read() {
        System.out.println("Implementation clavier");
        int deviceID = 2;
        return deviceID;
    }
}
