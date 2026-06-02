class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landR=Integer.MAX_VALUE;
        int waterR=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<landStartTime.length;i++){
            landR=Math.min(landR,landStartTime[i]+landDuration[i]);
        }

          for(int i=0;i<waterStartTime.length;i++){
            int crr=Math.max(landR,waterStartTime[i])+waterDuration[i];

            ans=Math.min(ans,crr);
        }

          for(int i=0;i<waterStartTime.length;i++){
            waterR=Math.min(waterR,waterStartTime[i]+waterDuration[i]);
        }

          for(int i=0;i<landStartTime.length;i++){
            int crr=Math.max(waterR,landStartTime[i])+landDuration[i];

            ans=Math.min(ans,crr);
        }

        return ans;
    }
}