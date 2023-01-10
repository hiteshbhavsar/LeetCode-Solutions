class MinimumRoundsToCompleteAllTasks {
    /*
    Runtime: 35 ms, faster than 89.60% of Java online submissions for Minimum Rounds to Complete All Tasks.
Memory Usage: 55.8 MB, less than 95.39% of Java online submissions for Minimum Rounds to Complete All Tasks.
    */
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap();
        // Store the frequencies in the map.
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }

        int minimumRounds = 0;
        // Iterate over the task's frequencies.
        for (int count : freq.values()) {
            // If the frequency is 1, it's not possible to complete tasks.
            if (count == 1) {
                return - 1;
            }

            if (count % 3 == 0) {
                // Group all the task in triplets.
                minimumRounds += count / 3;
            } else {
                // If count % 3 = 1; (count / 3 - 1) groups of triplets and 2 pairs.
                // If count % 3 = 2; (count / 3) groups of triplets and 1 pair.
                minimumRounds += count / 3 + 1;
            }
        }

        return minimumRounds;
    }
}
