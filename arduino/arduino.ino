void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600)//start serial
  pinMode(13, OUTPUT);//set pin mode to utput
}

void loop() {
  // put your main code here, to run repeatedly:
  //check if anything to read from serial
  if(Serial.available() > 0){
    String inString = Serial.read();
  }

  if(inString == "connected"){
    //if connected, turn off
    digitalWrite(13, LOW);
  }else{
    //otherwise flash
    digitalWrite(13, HIGH);
    delay(1000);
    digitalWrite(13, LOW);
    delay(1000);
  }
}
