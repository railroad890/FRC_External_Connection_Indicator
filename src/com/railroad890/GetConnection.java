package com.railroad890;

import edu.wpi.first.networktables.NetworkTable;

public class GetConnection {

    NetworkTable table;

    public GetConnection(){

    }

    public boolean getIsConnected(){
        boolean isConnected = false;

        if(table.getEntry("connection").equals("true"))
            isConnected = true;

        return isConnected;
    }
}
