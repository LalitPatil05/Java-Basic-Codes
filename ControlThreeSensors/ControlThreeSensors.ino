// Define the Trigger and Echo Pins For Sensor 1
const int TRIG_PIN1 = 2;
const int ECHO_PIN1 = 3;

//Define the Trigger and Echo pins for Sensor 2
const int TRIG_PIN2 = 4;
const int ECHO_PIN2 = 5;

//Define the Trigger and Echo pins for Sensor 2
const int TRIG_PIN3 = 6;
const int ECHO_PIN3 = 7;

//Define the Led Pins For Sensor 1 and Sensor 2 and Sensor 3
const int LED_PIN1 = 6;
const int LED_PIN2 = 7;
const int LED_PIN3 = 8;

// Define the Distance Thresold Variable and Duration Variable
const int DISTANCE_THRESHOLD1 = 10;
const int DISTANCE_THRESHOLD2 = 10;
const int DISTANCE_THRESHOLD3 = 10;

float Duration_us1, Distance_cm1;
float Duration_us2, Distance_cm2;
float Duration_us3, Distance_cm3;

void setup() {

  Serial.begin(9600);

  pinMode(TRIG_PIN1, OUTPUT);
  pinMode(ECHO_PIN1, INPUT);

  pinMode(TRIG_PIN2, OUTPUT);
  pinMode(ECHO_PIN2, INPUT);

  pinMode(TRIG_PIN3, OUTPUT);
  pinMode(ECHO_PIN3, INPUT);

  pinMode(LED_PIN1, OUTPUT);
  pinMode(LED_PIN2, OUTPUT);
  pinMode(LED_PIN3, OUTPUT);

}

void loop() {

  //Measure the Distance and Blink The LED for the Sensor 1
  digitalWrite(TRIG_PIN1, HIGH);
  delayMicroseconds(2);
  digitalWrite(TRIG_PIN1, LOW);

  // measure duration of pulse from ECHO pin
  Duration_us1 = pulseIn(ECHO_PIN1, HIGH);
  Distance_cm1 = 0.017 * Duration_us1;

  if(Distance_cm1 >= 2 || Distance_cm1 <= DISTANCE_THRESHOLD1){
    digitalWrite(LED_PIN1, HIGH);
    Serial.print("Distance : ");
    Serial.print(Distance_cm1);
    if(Distance_cm1 < 5){
      Serial.println("Alert..!! Level is OverFlow..!!");
      Serial.println("Location A Sensor Detect Alert..!!");
    }
  }
  else{
    digitalWrite(LED_PIN1, LOW);
  }
  delay(100);


  //Measure the Distance and Blink the LED For the Sensor 2

  digitalWrite(TRIG_PIN2, HIGH);
  delayMicroseconds(2);
  digitalWrite(TRIG_PIN2, LOW);

  // measure duration of pulse from ECHO pin
  Duration_us2 = pulseIn(ECHO_PIN2, HIGH);
  Distance_cm2 = 0.017 * Duration_us2;

  if(Distance_cm2 >= 2 || Distance_cm2 <= DISTANCE_THRESHOLD2){
    digitalWrite(LED_PIN2, HIGH);
    Serial.print("Distance_2 : ");
    Serial.print(Distance_cm2);
    if(Distance_cm2 < 5){
      Serial.println("Alert..!! Level is OverFlow..!!");
      Serial.println("Location B Sensor Detect Alert..!!");
    }
  }
  else{
    digitalWrite(LED_PIN2, LOW);
  }
  delay(100);


  //Measure the Distance and Blink the LED For the Sensor 3

  digitalWrite(TRIG_PIN3, HIGH);
  delayMicroseconds(2);
  digitalWrite(TRIG_PIN3, LOW);

  // measure duration of pulse from ECHO pin
  Duration_us3 = pulseIn(ECHO_PIN3, HIGH);
  Distance_cm3 = 0.017 * Duration_us3;

  if(Distance_cm3 >= 2 || Distance_cm3 <= DISTANCE_THRESHOLD3){
    digitalWrite(LED_PIN3, HIGH);
    Serial.print("Distance_3 : ");
    Serial.print(Distance_cm3);
    if(Distance_cm3 < 5){
      Serial.println("Alert..!! Level is OverFlow..!!");
      Serial.println("Location C Sensor Detect Alert..!!");
    }
  }
  else{
    digitalWrite(LED_PIN3, LOW);
  }
  delay(100);

}
