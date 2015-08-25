void setup()
{
size(400,400);
}


void draw()
{
  face();
}
void mousePressed() {
   background(random(0,100),random(0,150),random(0,155));
}

void face ()
{
	if(mouseX>200){
        ellipse(mouseX,mouseY,random(5,50),random(5,30));
        fill(random(0,255), random(0,255), random(0,255));
    }
    if(mouseX<=200){
        rect(mouseX,mouseY,random(5,40),random(5,40),2);
        fill(random(0,100), random(0,100), random(0,100));
    }
	/*fill(random(0,255),random(0,255),random(0,255));
  ellipse(mouseX,mouseY,random(10,50),random(10,50));
*/}

