PImage creeper;
PImage bush;
int x = 600;
int y = 300;

boolean isNear(int a, int b)
{
  if (abs(a - b) < 10)
     return true;
  else
     return false;
}

void setup(){
  size(900,900);
  creeper = loadImage("Creeper.png");
  bush = loadImage("bush.png");
  bush.resize(900,900);
  //background(bush);
     
}

void draw(){
 
  background(140);
  fill(255,0,0);
  creeper.resize(200,200);
  image(creeper, x, y);
 
  //background(bush); //this doesn't work with alpha
  image(bush,0,0); //this works with alpha
  
  if(mousePressed)
  {
    if((isNear(mouseX,600)&&isNear(mouseY,300)))   //try checking near both mouseX and mouseY
    {
      fill(54,255,0);
      println("you found the creeper");
    }
    else
    {
      fill(255,0,0);
    }
  }
  ellipse(mouseX,mouseY,10,10);
}
