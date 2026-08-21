class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();

        // Iterate only up to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                li.add(i); // i is a divisor
                if (i != n / i) {
                    li.add(n / i); // n / i is the corresponding pair divisor
                }
            }
        }

        // Ensure divisors are returned in sorted order
        Collections.sort(li);
        return li;
    }
}