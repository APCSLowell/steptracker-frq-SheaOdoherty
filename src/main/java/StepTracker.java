import java.util.ArrayList;
public class StepTracker
{
 public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        totalSteps = 0;
        totalDays = 0;
        activeDays = 0;
    }
    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= minSteps) {
            activeDays++;
        }
    }
    public int activeDays() {
        return activeDays;
    }
    public double averageSteps() {
        if (totalDays == 0) {
            return 0;
        }
        return (double) totalSteps / totalDays;
    }

} 
