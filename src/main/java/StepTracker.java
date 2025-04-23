import java.util.ArrayList;
public class StepTracker
{
 private int numSteps, numActiveDays, numDays, minActiveSteps;
 public StepTracker(int ActiveSteps) {
     numSteps = 0;
     numActiveDays = 0;
     numDays = 0;
     minActiveSteps = ActiveSteps;
 } 
 public void addDailySteps(int steps) {
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
     if(numDays == 0) {
         return 0;
     } 
     return (double)numSteps/numDays;
 } 
} 
