class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int[] pCount = new int[26];
        int[] windowCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        int windowSize = p.length();
        for (int i = 0; i < windowSize; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }
        for (int right = windowSize; right < s.length(); right++) {
            windowCount[s.charAt(right) - 'a']++;
            int left = right - windowSize;
            windowCount[s.charAt(left) - 'a']--;
            if (Arrays.equals(pCount, windowCount)) {
                result.add(left + 1);
            }
        }
        return result;
    }
}
