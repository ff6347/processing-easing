import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class easing extends PApplet {

// Bassed on https://github.com/jesusgollonet/ofpennereasing

//float time =0; // current time
float begining  = 0; // start value
float change = 1; // change in value
float duration = 100;  // duration


public void  vis(float x, float y){
          ellipse( y * 100, x * -100, 1, 1);
}

public void setup() {
  translate(width/2, height/2);

  noStroke();
  fill(0);
  
  for(int f = 0; f < 11*3; f++){
  background(255);
  for (float t = 0; t < duration; t +=change) {
    switch(f){
      case 0:
        vis(Linear.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Linear.easeIn.png");
      break;
      case 1:
        vis(Linear.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Linear.easeOut.png");
      break;
      case 2:
        vis(Linear.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Linear.easeInOut.png");
      break;
      case 3:
        vis(Back.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Back.easeIn.png");
      break;
      case 4:
        vis(Back.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Back.easeOut.png");
      break;
      case 5:
        vis(Back.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Back.easeInOut.png");
      break;
      case 6:
        vis(Bounce.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Bounce.easeIn.png");
      break;
      case 7:
        vis(Bounce.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Bounce.easeOut.png");
      break;
      case 8:
        vis(Bounce.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Bounce.easeInOut.png");
      break;
      case 9:
        vis(Circ.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Circ.easeIn.png");
      break;
      case 10:
        vis(Circ.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Circ.easeOut.png");
      break;
      case 11:
        vis(Circ.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Circ.easeInOut.png");
      break;
            case 12:
        vis(Cubic.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Cubic.easeIn.png");
      break;
      case 13:
        vis(Cubic.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Cubic.easeOut.png");
      break;
      case 14:
        vis(Cubic.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Cubic.easeInOut.png");
      break;
      case 15:
        vis(Elastic.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Elastic.easeIn.png");
      break;
      case 16:
        vis(Elastic.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Elastic.easeOut.png");
      break;
      case 17:
        vis(Elastic.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Elastic.easeInOut.png");
      break;
      case 18:
        vis(Expo.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Expo.easeIn.png");
      break;
      case 19:
        vis(Expo.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Expo.easeOut.png");
      break;
      case 20:
        vis(Expo.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Expo.easeInOut.png");
      break;
      case 21:
        vis(Quad.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Quad.easeIn.png");
      break;
      case 22:
        vis(Quad.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Quad.easeOut.png");
      break;
      case 23:
        vis(Quad.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Quad.easeInOut.png");
      break;
      case 24:
        vis(Quart.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Quart.easeIn.png");
      break;
      case 25:
        vis(Quart.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Quart.easeOut.png");
      break;
      case 26:
        vis(Quart.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Quart.easeInOut.png");
      break;
      case 27:
        vis(Quint.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Quint.easeIn.png");
      break;
      case 28:
        vis(Quint.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Quint.easeOut.png");
      break;
      case 29:
        vis(Quint.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Quint.easeInOut.png");
      break;
      case 30:
        vis(Sine.easeIn(t, begining, change, duration),   Linear.easeIn(t, begining, change, duration));
        println("Calculating Sine.easeIn.png");
      break;
      case 31:
        vis(Sine.easeOut(t, begining, change, duration),   Linear.easeOut(t, begining, change, duration));
        println("Calculating Sine.easeOut.png");
      break;
      case 32:
        vis(Sine.easeInOut(t, begining, change, duration),   Linear.easeInOut(t, begining, change, duration));
        println("Calculating Sine.easeInOut.png");
    }


    switch(f){
      case 0:


        saveFrame("images/Linear.easeIn.png");
      break;
      case 1:


        saveFrame("images/Linear.easeOut.png");
      break;
      case 2:


        saveFrame("images/Linear.easeInOut.png");
      break;
      case 3:


        saveFrame("images/Back.easeIn.png");
      break;
      case 4:


        saveFrame("images/Back.easeOut.png");
      break;
      case 5:


        saveFrame("images/Back.easeInOut.png");
      break;
      case 6:


        saveFrame("images/Bounce.easeIn.png");
      break;
      case 7:


        saveFrame("images/Bounce.easeOut.png");
      break;
      case 8:


        saveFrame("images/Bounce.easeInOut.png");
      break;
      case 9:


        saveFrame("images/Circ.easeIn.png");
      break;
      case 10:


        saveFrame("images/Circ.easeOut.png");
      break;
      case 11:


        saveFrame("images/Circ.easeInOut.png");
      break;
            case 12:


        saveFrame("images/Cubic.easeIn.png");
      break;
      case 13:


        saveFrame("images/Cubic.easeOut.png");
      break;
      case 14:


        saveFrame("images/Cubic.easeInOut.png");
      break;
      case 15:


        saveFrame("images/Elastic.easeIn.png");
      break;
      case 16:


        saveFrame("images/Elastic.easeOut.png");
      break;
      case 17:


        saveFrame("images/Elastic.easeInOut.png");
      break;
      case 18:


        saveFrame("images/Expo.easeIn.png");
      break;
      case 19:


        saveFrame("images/Expo.easeOut.png");
      break;
      case 20:


        saveFrame("images/Expo.easeInOut.png");
      break;
      case 21:


        saveFrame("images/Quad.easeIn.png");
      break;
      case 22:


        saveFrame("images/Quad.easeOut.png");
      break;
      case 23:


        saveFrame("images/Quad.easeInOut.png");
      break;
      case 24:


        saveFrame("images/Quart.easeIn.png");
      break;
      case 25:


        saveFrame("images/Quart.easeOut.png");
      break;
      case 26:


        saveFrame("images/Quart.easeInOut.png");
      break;
      case 27:


        saveFrame("images/Quint.easeIn.png");
      break;
      case 28:


        saveFrame("images/Quint.easeOut.png");
      break;
      case 29:


        saveFrame("images/Quint.easeInOut.png");
      break;
      case 30:


        saveFrame("images/Sine.easeIn.png");
      break;
      case 31:


        saveFrame("images/Sine.easeOut.png");
      break;
      case 32:


        saveFrame("images/Sine.easeInOut.png");
    }
  }
  }
  exit();
}

public static class Back {


  public static float easeIn (float t, float b, float c, float d) {
    float s = 1.70158f;
    float postFix = t/=d;
    return c*(postFix)*t*((s+1)*t - s) + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    float s = 1.70158f;
    return c*((t=t/d-1)*t*((s+1)*t + s) + 1) + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    float s = 1.70158f;
    if ((t/=d/2) < 1) return c/2*(t*t*(((s*=(1.525f))+1)*t - s)) + b;
    float postFix = t-=2;
    return c/2*((postFix)*t*(((s*=(1.525f))+1)*t + s) + 2) + b;
  }
}
public static class Bounce {

  public static float easeIn (float t, float b, float c, float d) {
    return c - easeOut (d-t, 0, c, d) + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    if ((t/=d) < (1/2.75f)) {
      return c*(7.5625f*t*t) + b;
    } else if (t < (2/2.75f)) {
      float postFix = t-=(1.5f/2.75f);
      return c*(7.5625f*(postFix)*t + .75f) + b;
    } else if (t < (2.5f/2.75f)) {
      float postFix = t-=(2.25f/2.75f);
      return c*(7.5625f*(postFix)*t + .9375f) + b;
    } else {
      float postFix = t-=(2.625f/2.75f);
      return c*(7.5625f*(postFix)*t + .984375f) + b;
    }
  }

  public static float easeInOut(float t, float b, float c, float d) {
    if (t < d/2) return easeIn (t*2, 0, c, d) * .5f + b;
    else return easeOut (t*2-d, 0, c, d) * .5f + c*.5f + b;
  }
}
public static class Circ {

  public static float easeIn (float t, float b, float c, float d) {
    return -c * (sqrt(1 - (t/=d)*t) - 1) + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    return c * sqrt(1 - (t=t/d-1)*t) + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    if ((t/=d/2) < 1) return -c/2 * (sqrt(1 - t*t) - 1) + b;
    return c/2 * (sqrt(1 - t*(t-=2)) + 1) + b;
  }
}
public static class Cubic {

  public static float easeIn (float t, float b, float c, float d) {
    return c*(t/=d)*t*t + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    return c*((t=t/d-1)*t*t + 1) + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    if ((t/=d/2) < 1) return c/2*t*t*t + b;
    return c/2*((t-=2)*t*t + 2) + b;
  }
}
public static class Elastic {

  public static float easeIn (float t, float b, float c, float d) {
    if (t==0) return b;  
    if ((t/=d)==1) return b+c;
    float p=d*.3f;
    float a=c;
    float s=p/4;
    float postFix =a*pow(2, 10*(t-=1)); // this is a fix, again, with post-increment operators
    return -(postFix * sin((t*d-s)*(2*PI)/p )) + b;
  }

  public static float easeOut(float t, float b, float c, float d) {
    if (t==0) return b;  
    if ((t/=d)==1) return b+c;
    float p=d*.3f;
    float a=c;
    float s=p/4;
    return (a*pow(2, -10*t) * sin( (t*d-s)*(2*PI)/p ) + c + b);
  }

  public static float easeInOut(float t, float b, float c, float d) {
    if (t==0) return b;  
    if ((t/=d/2)==2) return b+c;
    float p=d*(.3f*1.5f);
    float a=c;
    float s=p/4;

    if (t < 1) {
      float postFix =a*pow(2, 10*(t-=1)); // postIncrement is evil
      return -.5f*(postFix* sin( (t*d-s)*(2*PI)/p )) + b;
    }
    float postFix =  a*pow(2, -10*(t-=1)); // postIncrement is evil
    return postFix * sin( (t*d-s)*(2*PI)/p )*.5f + c + b;
  }
}
public  static class Expo {



  public static float easeIn (float t, float b, float c, float d) {
    return (t==0) ? b : c * pow(2, 10 * (t/d - 1)) + b;
  }

  public static float easeOut(float t, float b, float c, float d) {
    return (t==d) ? b+c : c * (-pow(2, -10 * t/d) + 1) + b;
  }
  public static float easeInOut(float t, float b, float c, float d) {
    if (t==0) return b;
    if (t==d) return b+c;
    if ((t/=d/2) < 1) return c/2 * pow(2, 10 * (t - 1)) + b;
    return c/2 * (-pow(2, -10 * --t) + 2) + b;
  }
}
public static class Linear {

public static float easeIn (float t, float b, float c, float d) {
    return c*t/d + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    return c*t/d + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    return c*t/d + b;
  }
}
public static class Quad {


  public static float easeIn (float t, float b, float c, float d) {
    return c*(t/=d)*t*t*t + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    return -c * ((t=t/d-1)*t*t*t - 1) + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    if ((t/=d/2) < 1) return c/2*t*t*t*t + b;
    return -c/2 * ((t-=2)*t*t*t - 2) + b;
  }
}
public static class Quart {


  public static float easeIn (float t, float b, float c, float d) {
    return c*(t/=d)*t*t*t + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    return -c * ((t=t/d-1)*t*t*t - 1) + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    if ((t/=d/2) < 1) return c/2*t*t*t*t + b;
    return -c/2 * ((t-=2)*t*t*t - 2) + b;
  }
}
public static  class Quint {

  public static float easeIn (float t, float b, float c, float d) {
    return c*(t/=d)*t*t*t*t + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    return c*((t=t/d-1)*t*t*t*t + 1) + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    if ((t/=d/2) < 1) return c/2*t*t*t*t*t + b;
    return c/2*((t-=2)*t*t*t*t + 2) + b;
  }
}
public static class Sine {


  public static float easeIn (float t, float b, float c, float d) {
    return -c * cos(t/d * (PI/2)) + c + b;
  }
  public static float easeOut(float t, float b, float c, float d) {
    return c * sin(t/d * (PI/2)) + b;
  }

  public static float easeInOut(float t, float b, float c, float d) {
    return -c/2 * (cos(PI*t/d) - 1) + b;
  }
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "easing" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
