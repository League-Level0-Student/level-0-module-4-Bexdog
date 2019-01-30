void setup() {
      PImage waldo = loadImage("wheresWaldo_1024x1024.jpg"); // 5. Change this to match your file name.
      size(1024, 1024);
      image(waldo, 0, 0);
     doh = minim.loadSample("371807__onerasmpz__ouch.wav"); //drag and drop from project onto sketch
     woohoo = minim.loadSample("47147__alphahog__beer.mp3"); //drag and drop from project onto sketch
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
      println("X: " + mouseX + " Y: " + mouseY); 

      // 7. If the mouse is on Waldo, print “Waldo found!”
if((mouseX>313 ) && (mouseX<325) && (mouseY>548) && (mouseY>560)){
  println("Waldo found");

      // 8. If Waldo is found, also use the method below to play “Woohoo”
      playWoohoo();
      // Change the name of the sound file if you need to 
}
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
     else if(mousePressed){
     playDoh();
     }
       // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;