public class Volume {
  static double sphere(double d) {
    double r = d / 2.0;
    return (4.0 / 3.0) * Math.PI * (r*r*r);
    }
    public static void main(String[] args) {
      double v = sphere(20.24);
      System.out.println(v);
  }
}
