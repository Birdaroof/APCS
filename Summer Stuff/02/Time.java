public class Time {
  public static void main (String[] args){
    int hour = 23;
    int minute = 4;
    int second = 54;
    int totalSeconds = 24 * 60 * 60;
    int secondsPassed = hour * minute * 60 + second;
    int secondsLeft = totalSeconds - secondsPassed;
    float dayPercentage = (float) secondsPassed / totalSeconds;
    System.out.println("There are " + secondsLeft + " seconds left in the day.");
    System.out.println("The day is " + dayPercentage+ " done.");
  }
}
