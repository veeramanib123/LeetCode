
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 1971; i < year; i++) {
            totalDays += isLeap(i) ? 366 : 365;
        }
        for (int i = 0; i < month - 1; i++) {
            if (i == 1 && isLeap(year))
            { 
                totalDays += 29;
            } else 
            {
                totalDays += monthDays[i];
            }
        }
        totalDays += (day - 1); 
        return days[totalDays % 7];
    }
    
    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}