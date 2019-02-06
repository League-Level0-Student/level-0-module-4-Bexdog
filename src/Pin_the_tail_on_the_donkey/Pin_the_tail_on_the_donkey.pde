import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch



// put these lines where you want the sound to play

int X;
int Y;
Boolean bob = false;
PImage Donkey;
PImage tail;
void setup(){
Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("47147__alphahog__beer.mp3");     //In setup. Change the file name if you need to
  size(720,540);
Donkey = loadImage("donkey.jpg");
Donkey.resize(720,540);
tail = loadImage("Tail.png");

}
void draw(){
if(!bob){X=mouseX; Y=mouseY;}
  tail.resize(148,148);
  if((dist(0, 0, mouseX, mouseY) < 30) || (bob)){
  background(Donkey);
image(tail,X-120,Y-50);  
if(dist(600, 75, X, Y) < 30){
  if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
}
  else {
  
    background(0,0,0);
  }
  if(mousePressed&&!bob){
 bob = true;
    image(tail,mouseX-120,mouseY-50);
  }

rect(0, 0, 30, 30);
//rect(600, 75, 40, 40);

}