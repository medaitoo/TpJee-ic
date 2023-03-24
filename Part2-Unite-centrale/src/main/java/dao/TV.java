package dao;

import org.springframework.stereotype.Component;

@Component
public class TV implements IHDMI {
    @Override
    public void print(byte[] data) {
        System.out.println("This is a TV : "+data);
    }




}
