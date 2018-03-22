package com.railroad890;

public class Main {

    public static void main(String[] args){

        GetConnection _connection = new GetConnection();
        Output _output = new Output(/*arduino port*/);

        boolean isConnected = _connection.getIsConnected();
        _output.openConnection();

        while (true){
            isConnected = _connection.getIsConnected();
            if(isConnected){
                _output.sendString("connected");
            }else{
                _output.sendString("disconnected");
            }
        }

    }
}
