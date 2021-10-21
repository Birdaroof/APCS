public class StatsDriver{
  public static void main(String[] args){
    //Testing for mean Methods
    System.out.println(Stats.mean(1,2));
    System.out.println("... expecting 1");
    // Division of 3/2 is 1.5 but since Java is doing int division it should get rounded down
    System.out.println(Stats.mean(0,0));
    System.out.println("... expecting 0");
    System.out.println(Stats.mean(-4,2));
    System.out.println("... expecting -1");
    System.out.println(Stats.mean(0,3));
    System.out.println("... expecting 1");
    // Once again Java is doing int division, should answer should get rounded down

    /* Methods that should not work, mean is not designed to work with these amounts of parameters
    System.out.println(Stats.mean());
    System.out.println(Stats.mean(1));
    System.out.println(Stats.mean(1,2,3));
    */

    System.out.println(Stats.mean(0,0.0));
    System.out.println("... expecting 0.0");
    System.out.println(Stats.mean(1,2.0));
    System.out.println("... expecting 1.5");
    System.out.println(Stats.mean(-4,2.0));
    System.out.println("... expecting -1.0");

    //Testing for max Methods
    System.out.println(Stats.max(0,0));
    System.out.println("... expecting 0");
    System.out.println(Stats.max(-4,0));
    System.out.println("... expecting 0");
    System.out.println(Stats.max(0,1));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(1,-1));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(-4,-3));
    System.out.println("... expecting -3");
    System.out.println(Stats.max(0,0.0));
    System.out.println("... expecting 0.0");
    System.out.println(Stats.max(1,0.0));
    System.out.println("... expecting 1.0");
    System.out.println(Stats.max(-4,-3.0));
    System.out.println("... expecting -3.0");
    System.out.println(Stats.max(1,10));
    System.out.println("... expecting 10");

    System.out.println(Stats.max(0,0,0));
    System.out.println("... expecting 0");
    System.out.println(Stats.max(0,0,1));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(0,1,0));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(1,0,0));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(1,1,0));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(1,1,1));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(0,1,1));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(1,0,1));
    System.out.println("... expecting 1");
    System.out.println(Stats.max(-1,-3,-5));
    System.out.println("... expecting -1");
    System.out.println(Stats.max(-3,-1,-5.0));
    System.out.println("... expecting -1.0");
    System.out.println(Stats.max(0.2,-2,5));
    System.out.println("... expecting 5.0");
    System.out.println(Stats.max(1.0,3.0,5.0));
    System.out.println("... expecting 5.0");

    /* Methods that should not work, max is not designed to work with these amounts of parameters
    System.out.println(Stats.max());
    System.out.println(Stats.max(0));
    System.out.println(Stats.max(1,2,3,4));
    */

    //Testing for geoMean Methods
    System.out.println(Stats.geoMean(0,0));
    System.out.println("... expecting 0");
    System.out.println(Stats.geoMean(1,5));
    System.out.println("... expecting 2");
    
    System.out.println(Stats.geoMean(-1,2));
    System.out.println("... expecting error");
    // Actually returned 0?
    System.out.println(Math.sqrt(1*-2));
    // Same math that is done inside Stats.geoMean, but returns NaN as expected. When Stats.geoMean is forced to return a int/double it converts the NaN to 0
     
    System.out.println(Stats.geoMean(-1,-4));
    System.out.println("... expecting 2");
    System.out.println(Stats.geoMean(-1,-4.0));
    System.out.println("... expecting 2.0");
    System.out.println(Stats.geoMean(1,5.0));
    System.out.println("... expecting 2.23...");
    System.out.println(Stats.geoMean(-1,-2,4));
    System.out.println("... expecting 2");
    System.out.println(Stats.geoMean(-1,-2,-3));
    System.out.println("... expecting -1");
    System.out.println(Stats.geoMean(0,0,0));
    System.out.println("... expecting 0");
    System.out.println(Stats.geoMean(1,2,4.0));
    System.out.println("... expecting 2.0");
    System.out.println(Stats.geoMean(1.0,2.0,4.0));
    System.out.println("... expecting 2.0");
    System.out.println(Stats.geoMean(3.5,4.2,6.7));
    System.out.println("... expecting 4.6...");

    /* Methods that should not work, geoMean is not designed to work with these amounts of parameters
    System.out.println(Stats.geoMean());
    System.out.println(Stats.geoMean(1));
    System.out.println(Stats.geoMean(1,2,3,4));
    */
  }
}
