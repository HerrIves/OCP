package oca.aufgabe01c;

public class Rectangle {
  private int length;
  private int width;

public Rectangle(int length, int width){
  this.length = length;
  this.width = width;
}

public long getRectangleArea(){
  return length * width;
}

public long getRectanglePerimetr(){
return 2 * (length + width);
}
}
