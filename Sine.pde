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
