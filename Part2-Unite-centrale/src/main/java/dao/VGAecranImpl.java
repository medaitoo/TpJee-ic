package dao;

import org.springframework.stereotype.Component;

@Component
public class VGAecranImpl implements IVGA {
    @Override
    public void print(String data) {
        System.out.println("Implementation écran:"+data);
    }
}
