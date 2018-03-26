package com.railroad890;

import arduino.*;

public class Output {

    Arduino _arduino;

    public Output(String portDescription){
        _arduino = new Arduino(portDescription);
    }

    public void openConnection(){
        boolean isOpen = false;
        while(!isOpen) {
            isOpen = _arduino.openConnection();
        }
    }

    public void sendString(String s){
        _arduino.serialWrite(s);
    }
}
