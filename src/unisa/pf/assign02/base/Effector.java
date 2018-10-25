package unisa.pf.assign02.base;


import java.util.Random;

public abstract class Effector {
  private String name;
  private double minimumImpact;
  private double maximumImpact;



  /**
   * Constructor for effector.
   * @param name name of item.
   * @param minimumImpact the minimum effect of the item.
   * @param maximumImpact the maximum effect of the item.
   */
  public Effector(String name, double minimumImpact, double maximumImpact) {
    super();
    this.name = name;
    this.minimumImpact = minimumImpact;
    this.maximumImpact = maximumImpact;
  }

  public abstract String soundItMakes();

  public String getName() {
    return name;
  }
  
  public double getMinimumImpact() {
    return minimumImpact;
  }
  
  public double getMaximumImpact() {
    return maximumImpact;
  }

  /**
   * Random number generator.
   * @param start lowest number in random range.
   * @param finish highest number in random range.
   * @return the random value.
   */
  public static double randomNumberInRange(double start, double finish) {
    Random r1 = new Random();
    r1.nextGaussian();
    return (Math.abs(r1.nextInt()) % ((finish + 1) - start)) + start;
  }

}
