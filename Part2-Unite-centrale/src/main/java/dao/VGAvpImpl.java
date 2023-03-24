package dao;

import org.springframework.stereotype.Component;

@Component
public class VGAvpImpl implements IVGA {
    @Override
    public void print(String data) {
        System.out.println("Implementation video projecteur");
    }
}
