public class CylinderComputation{
  public static void main(String args[]){
    float radius, height, surfaceArea, baseArea, volume;
    final float PI = 3.141516F;

    radius = 3.0F;
    height= 4.0F;

    baseArea = 2 * PI * radius * height;
    surfaceArea = 2 * PI * radius * (radius + height);
    volume = PI * radius * radius * height;

    System.out.println("radius:" + radius + "," + "height:" + height + "," + "baseArea:" + baseArea + "," + "Volume:" + volume + "," + "SurfaceArea:" + surfaceArea);
  }
}
