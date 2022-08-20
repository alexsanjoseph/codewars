
public class Xbonacci {


  public double[] tribonacci(double[] s, int n) {
    // hackonacci me
    double[] output = new double[n];
    for (int i = 0; i < 3 && i < n; i++) {
      output[i] = s[i];
    }

    for (int i = 3; i < n; i++){
      output[i] = output[i-1] + output [i-2] + output [i-3];
    }
    return output;
  }
}