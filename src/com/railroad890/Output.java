package com.railroad890;

import arduino.*;

public class Output {

    Arduino _arduino;

    public Output(String portDescription){
        _arduino = new Arduino(portDescription);
    }

    public void sendString(String s){
        boolean isOpen = false;
        while(!isOpen) {
            isOpen = _arduino.openConnection();
        }

        _arduino.serialWrite(s);
    }
}
