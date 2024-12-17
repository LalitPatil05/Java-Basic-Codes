#include<dht.h>

const int TRIG_PIN1 = 2; // Arduino pin connected to Ultrasonic Sensor's TRIG pin
const int ECHO_PIN1 = 3; // Arduino pin connected to Ultrasonic Sensor's ECHO pin

const int TRIG_PIN2 = 4; // Arduino pin connected to Ultrasonic Sensor's TRIG pin
const int ECHO_PIN2 = 5; // Arduino pin connected to Ultrasonic Sensor's ECHO pin

const int TRIG_PIN3 = 6; // Arduino pin connected to Ultrasonic Sensor's TRIG pin
const int ECHO_PIN3 = 7; // Arduino pin connected to Ultrasonic Sensor's ECHO pin

const int LED_PIN1  = 8;  // Arduino pin connected to LED's pin
const int LED_PIN2  = 9; // Arduino pin connected to LED's pin
const int LED_PIN3  = 10; // Arduino pin connected to LED's pin

int bpin = 11; // Buzzer pin connected to arduino pin 11
const int analogPin = A0; // Analog output pin


const int DISTANCE_THRESHOLD1 = 10; // centimeters
const int DISTANCE_THRESHOLD2 = 10; // centimeters 
const int DISTANCE_THRESHOLD3 = 10; // centimeters 

// variables will change:
float duration_us1, distance_cm1;  
float duration_us2, distance_cm2;
float duration_us3, distance_cm3;

void setup() {
  Serial.begin(9600);  // initialize serial port
  pinMode(TRIG_PIN1, OUTPUT); // set arduino pin to output mode
  pinMode(ECHO_PIN1, INPUT);  // set arduino pin to input mode
  pinMode(LED_PIN1, OUTPUT);  // set arduino pin to output mode

  pinMode(TRIG_PIN2, OUTPUT); // set arduino pin to output mode
  pinMode(ECHO_PIN2, INPUT);  // set arduino pin to input mode
  pinMode(LED_PIN2, OUTPUT);  // set arduino pin to output mode

  pinMode(TRIG_PIN3, OUTPUT); // set arduino pin to output mode
  pinMode(ECHO_PIN3, INPUT);  // set arduino pin to input mode
  pinMode(LED_PIN3, OUTPUT);  // set arduino pin to output mode

  pinMode(bpin, OUTPUT);
  pinMode(digitalPin, INPUT);

}

void loop() {

  const int outPin =  12; // Defines pin number to which the sensor is connected

  dht DHT; // Creates a DHT object
  int readData = DHT.read11(outPin);

	float t = DHT.temperature;        // Read temperature
	float h = DHT.humidity;           // Read humidity
  
  // Read analog output
  int analogValue = analogRead(analogPin

  // First sensor: generate 10-microsecond pulse to TRIG pin
  digitalWrite(TRIG_PIN1, HIGH);
  delayMicroseconds(1);
  digitalWrite(TRIG_PIN1, LOW);

  // Measure duration of pulse from ECHO pin
  duration_us1 = pulseIn(ECHO_PIN1, HIGH);
  // Calculate the distance
  distance_cm1 = 0.017 * duration_us1;

  if (distance_cm1 < DISTANCE_THRESHOLD1) {
    digitalWrite(LED_PIN1, HIGH); // turn on LED
    Serial.print("Distance Sensor 1: ");
    Serial.print(distance_cm1);
    Serial.println(" cm");

    tone(bpin,2000);
    delay(1000);
    noTone(bpin);

  } else {
    digitalWrite(LED_PIN1, LOW);  // turn off LED
  }

  // Print the value to Serial Monitor
  

  delay(100); // Wait for half a second before next measurement

  // Second sensor: generate 10-microsecond pulse to TRIG pin
  digitalWrite(TRIG_PIN2, HIGH);
  delayMicroseconds(1);
  digitalWrite(TRIG_PIN2, LOW);

  // Measure duration of pulse from ECHO pin
  duration_us2 = pulseIn(ECHO_PIN2, HIGH);
  // Calculate the distance
  distance_cm2 = 0.017 * duration_us2;

  if (distance_cm2 < DISTANCE_THRESHOLD2) {
    digitalWrite(LED_PIN2, HIGH); // turn on LED
    Serial.print("Distance Sensor 2: ");
    Serial.print(distance_cm2);
    Serial.println(" cm");

    tone(bpin,2000);
    delay(1000);
    noTone(bpin);
  
  } else {
    digitalWrite(LED_PIN2, LOW);  // turn off LED
  }

  // Print the value to Serial Monitor
  

  delay(100); // Wait for half a second before next measurement

  // Thard sensor: generate 10-microsecond pulse to TRIG pin
  digitalWrite(TRIG_PIN3, HIGH);
  delayMicroseconds(1);
  digitalWrite(TRIG_PIN3, LOW);

  // Measure duration of pulse from ECHO pin
  duration_us3 = pulseIn(ECHO_PIN3, HIGH);
  // Calculate the distance
  distance_cm3 = 0.017 * duration_us3;

  if (distance_cm3 < DISTANCE_THRESHOLD3) {
    digitalWrite(LED_PIN3, HIGH); // turn on LED
    Serial.print("Distance Sensor 3: ");
    Serial.print(distance_cm3);
    Serial.println(" cm");

    tone(bpin,2000);
    delay(1000);
    noTone(bpin);

  } 
  else {
    digitalWrite(LED_PIN3, LOW);  // turn off LED
  }

	Serial.print("Temperature = ");
	Serial.print(t);
	Serial.print("°C | ");
	Serial.print((t*9.0)/5.0+32.0);        // Convert celsius to fahrenheit
	Serial.println("°F ");
	Serial.print("Humidity = ");
	Serial.print(h);
	Serial.println("% ");
	Serial.println("");

	delay(1000); // wait two seconds

  // Print the value to Serial Monitor

  if(t>=25 || h>=50)
  {
    Serial.print("Alert Tempreture is High..!!");
  }

 // Print sensor readings
  Serial.print("Analog Output: ");
  Serial.println(analogValue);

  if(analogValue >= 100)
  {
    Serial.print("Alert Gas is Detected..!!");
  }

  delay(100); // Wait for half a second before next measurement
}
