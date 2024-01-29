class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                r.offer(i);
            } else {
                d.offer(i);
            }
        }

        while (!r.isEmpty() && !d.isEmpty()) {
            int rIndex = r.poll();
            int dIndex = d.poll();

            if (rIndex < dIndex) {
                r.offer(rIndex + n);
            } else {
                d.offer(dIndex + n);
            }
        }

        if (r.isEmpty()) {
            return "Dire";
        }
        return "Radiant";
    }
}
