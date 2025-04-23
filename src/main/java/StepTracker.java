import java.util.ArrayList;
public class StepTracker
{
 private double numSteps;
 public int numActiveDays, numDays, minActiveSteps;
 public StepTracker(int ActiveSteps) {
     numSteps= 0;
     numActiveDays = 0;
     numDays = 0;
     minActiveSteps = ActiveSteps;
 } 
 public void addDailySteps(double steps) {
     numSteps += steps;
     numDays++;
     if(steps >= minActiveSteps) {
         numActiveDays++;
     }
 } 
 public int activeDays() {
     return numActiveDays;
 } 
 public double averageSteps() {
     return numSteps/numDays;
 } 
} 
