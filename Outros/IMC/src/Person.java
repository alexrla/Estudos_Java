public class Person {
  double weight, height;

  public double calculateIMC() {
    double imc = weight / (height * height);

    return imc;
  }
}
