#include <Adafruit_NeoPixel.h>
#ifdef __AVR__
#include <avr/power.h>
#endif

int const NUM_PIXELS = 12;
int8_t const PIN = 13;
Adafruit_NeoPixel strip;

void setup() {
  strip = Adafruit_NeoPixel(NUM_PIXELS, PIN, NEO_GRB+NEO_KHZ800);
  strip.begin();
  
  strip.setBrightness(0x40);
  strip.show();   // Init all pixels to "off"
 
}
void loop() {
    for (int i = 0; i <= 45; i++) {
     strip.setPixelColor(0 + (i % 13),strip.Color(255,63,172));
     strip.setPixelColor(1 + (i % 13),strip.Color(42,06,94));
     strip.setPixelColor(2 + (i % 13),strip.Color(214,63,173));
     strip.setPixelColor(3 + (i % 13),strip.Color(255,63,213));
     strip.setPixelColor(4 + (i % 13),strip.Color(255,45,123));
     strip.setPixelColor(5 + (i % 13),strip.Color(255,63,0));
     strip.setPixelColor(6 + (i % 13),strip.Color(65,63,45));
     strip.setPixelColor(7 + (i % 13),strip.Color(23,63,0));
     strip.setPixelColor(8 + (i % 13),strip.Color(13,63,144));
     strip.setPixelColor(9 + (i % 13),strip.Color(255,63,22));
     strip.setPixelColor(10 + (i % 13),strip.Color(123,63,25));
     strip.setPixelColor(11 + (i % 13),strip.Color(255,63,116));
     strip.setPixelColor(12 + (i % 13),strip.Color(255,63,64));
     strip.setPixelColor(13 + (i % 13),strip.Color(255,63,96));
     strip.show();
     delay(10);
    }
}
