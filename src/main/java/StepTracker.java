import java.util.ArrayList;
public class StepTracker
{
 public int numSteps, numActiveDays, numDays, minActiveSteps;
 public StepTracker(int ActiveSteps) {
     numSteps= 0;
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
     return (double)numSteps/numDays;
 } 
} 
