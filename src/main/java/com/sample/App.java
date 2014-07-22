package com.sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Pavithra on 22/7/14.
 */
public class App {

    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("//home//krishna//IdeaProjects//ProtoBufSample//src//main//java//com//sample//User.txt");

        ProtoUser.User.Address addr = ProtoUser.User.Address.newBuilder()
                .setAddrType(ProtoUser.User.Address.Type.HOME)
                .setCity("CBE\n")
                .setCountry("IND\n")
                .setId(1)
                .setState("TN\n")
                .setStreet("123 street\n")
                .setZip("641045\n")
                .build();

        ProtoUser.User user = ProtoUser.User.newBuilder()
                .setId(1)
                .setFirstname("XXXX\n")
                .setLastname("YYYY\n")
                .setName("XXX\n")
                .addAddr(addr)
                .build();
        user.writeTo(output);
        output.close();
    }


}
