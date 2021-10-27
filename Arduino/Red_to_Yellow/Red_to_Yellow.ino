# include <Adafruit_NeoPixel.h>
# ifdef __AVR__
#include <avr/power.h>
#endif

int const NUM_PIXELS = 12;
int8_t const PIN = 13;
Adafruit_NeoPixel strip;

void setup()
{
  strip = Adafruit_NeoPixel(NUM_PIXELS, PIN, NEO_GRB+NEO_KHZ800);
  strip.begin();
  strip.show();   // Init all pixels to "off"
}


void loop() 
{
  for (int i = 1; i <= 255; i++)
  {
  strip.setPixelColor(0,strip.Color(255,i,0)); 
  strip.setPixelColor(1,strip.Color(i,0,0)); 
  strip.setPixelColor(2,strip.Color(i,0,0)); 
  strip.setPixelColor(3,strip.Color(i,0,0)); 
  strip.setPixelColor(4,strip.Color(i,0,0)); 
  strip.setPixelColor(5,strip.Color(i,0,0)); 
  strip.setPixelColor(6,strip.Color(i,0,0)); 
  strip.setPixelColor(7,strip.Color(i,0,0)); 
  strip.setPixelColor(8,strip.Color(i,0,0)); 
  strip.setPixelColor(9,strip.Color(i,0,0)); 
  strip.setPixelColor(10,strip.Color(i,0,0)); 
  strip.setPixelColor(11,strip.Color(i,0,0)); 
  strip.setPixelColor(12,strip.Color(i,0,0)); 
  strip.setPixelColor(13,strip.Color(i,0,0));
  strip.show();
  delay(10);
  }
}
