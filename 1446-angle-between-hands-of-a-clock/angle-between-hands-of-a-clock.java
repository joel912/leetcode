class Solution {
    public double angleClock(int hour, int minutes) {
        if (hour == 12) {
            hour = 0;
        }
        double ans1 = minutes * 6;
        double hours = ((hour *  30) + (minutes * 0.5));
        double diff = Math.abs(ans1 - hours);
        if(diff >180){
            return Math.abs(360-diff);
        }
        return diff;
    }
}