// Bassed on https://github.com/jesusgollonet/ofpennereasing

//float time =0; // current time
float begining  = 0; // start value
float change = 1; // change in value
float duration = 100;  // duration


void  vis(float x, float y){
          ellipse( y * 100, x * -100, 1, 1);
}

void setup() {
  translate(width/2, height/2);

  noStroke();
  fill(0);
  size(500, 500);
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

