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
  // Colors are defined in 0xRRGGBB format.
  strip.setPixelColor(0,0xFF0000);
  strip.show();
}
