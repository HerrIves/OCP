package oca.aufgabe0a;

public class BMI {
  private int weight;
  private int growth;
  private double bmi;

public BMI(int weight, int growth){
  this.weight = weight;
  this.growth = growth;
  
//  this.calcBMI();
}  
  
  private void calcBMI(){
    bmi = Math.round(
            weight * 10_000 / Math.pow(growth, 2)
    );
  }

  public double getCalcBMI(){
    bmi = Math.round(
            weight * 10_0000 / Math.pow(growth, 2)
    );
    return bmi;
  }
  
  public void recomendations(){
    final double bmi = getCalcBMI();
    
    if (bmi >30){
      System.out.println("BMI: " + bmi + ": Adipös. Schleunigst Arzt aufsuchen");
    }
  }
}
