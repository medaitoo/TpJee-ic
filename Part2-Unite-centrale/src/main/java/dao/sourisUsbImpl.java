package dao;

import org.springframework.stereotype.Component;

@Component
public class sourisUsbImpl implements IUSB {
    @Override
    public int read() {
        System.out.println("Implementation souris");
        int deviceID = 1;
        return deviceID;
    }
}
