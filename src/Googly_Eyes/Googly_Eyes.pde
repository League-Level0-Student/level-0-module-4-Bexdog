void setup(){
  size(1280,720);
}
void draw(){
  PImage face = loadImage("maxresdefault.jpg");
  int lefteyeX;
  if (mouseX<435){
    lefteyeX = 435;}
    else if (mouseX >455){
    lefteyeX = 455;}
    else{
    lefteyeX = mouseX;}
    
    int lefteyeY;
  if (mouseY<350){
    lefteyeY = 350;}
    else if (mouseY >370){
    lefteyeY = 370;}
    else{
    lefteyeY = mouseY;}
  
  int righteyeX;
  if (mouseX<580){
   righteyeX = 580;}
    else if (mouseX>600){
    righteyeX = 600;}
    else{
    righteyeX = mouseX;}
    
    int righteyeY;
  if (mouseY<315){
    righteyeY = 315;}
    else if (mouseY >335){
    righteyeY = 335;}
    else{
    righteyeY = mouseY;}
  
  
  background(face);
  fill(255,255,255);
  ellipse(445,360,40,40);
  fill(3,0,0);
  ellipse(lefteyeX,lefteyeY,15,15);
  
  fill(255,255,255);
  ellipse(590,325,40,40);
  fill(3,0,0);
  ellipse(righteyeX,righteyeY,15,15);
  
  
  
  
  
  
  
  
}
