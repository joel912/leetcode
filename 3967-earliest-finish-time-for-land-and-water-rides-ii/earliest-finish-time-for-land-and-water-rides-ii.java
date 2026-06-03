class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
       int bestLandEnd = Integer.MAX_VALUE;
        int bestLandIdx = 0;
        for (int i = 0; i < landStartTime.length; i++) {
            int end = landStartTime[i] + landDuration[i];
            if (end < bestLandEnd) {
                bestLandEnd = end;
                bestLandIdx = i;
            }
        }

    
        int bestWaterEnd = Integer.MAX_VALUE;
        int bestWaterIdx = 0;
        for (int j = 0; j < waterStartTime.length; j++) {
            int end = waterStartTime[j] + waterDuration[j];
            if (end < bestWaterEnd) {
                bestWaterEnd = end;
                bestWaterIdx = j;
            }
        }

        int minFinishTime = Integer.MAX_VALUE;

        
        for (int j = 0; j < waterStartTime.length; j++) {
            int val = Math.max(bestLandEnd, waterStartTime[j]) + waterDuration[j];
            minFinishTime = Math.min(minFinishTime, val);
        }

   
        for (int i = 0; i < landStartTime.length; i++) {
            int val1 = Math.max(bestWaterEnd, landStartTime[i]) + landDuration[i];
            minFinishTime = Math.min(minFinishTime, val1);
        }

        return minFinishTime;
    }
    }
