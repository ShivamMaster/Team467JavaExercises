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
  
  strip.setBrightness(0x40);
  strip.show();   // Init all pixels to "off"
  
}

int i = 0; 
bool down = false;

void loop() 
{
  
  
  for (int j = 0; j < 13; j ++)
  {
      strip.setPixelColor(j,strip.Color(255,i,0));
  }

  if (!down)
  {
   i++;
  } else {
    i--;
  }
  
 
 if (i == 255)
  {
    down = true;
  }

if (i == 0)
{
  down = false;
}
  
  strip.show();
  delay(10);

}
