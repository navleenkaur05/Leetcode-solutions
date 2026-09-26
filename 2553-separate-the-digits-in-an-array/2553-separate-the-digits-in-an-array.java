class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int n : nums) {
            String s = String.valueOf(n);
            for (char c : s.toCharArray())
                list.add(c - '0');
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}