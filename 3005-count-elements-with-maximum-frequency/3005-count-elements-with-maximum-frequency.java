class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int count : map.values()) {
            maxFreq = Math.max(maxFreq, count);
        }

      
        int answer = 0;
        for (int count : map.values()) {
            if (count == maxFreq) {
                answer += count;
            }
        }

        return answer;
    }
}