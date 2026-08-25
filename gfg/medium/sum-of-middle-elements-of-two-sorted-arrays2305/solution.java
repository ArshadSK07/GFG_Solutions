class Solution {
    public int findMidSum(int[] arr1, int[] arr2) {
        // code here
        List<Integer> li = new ArrayList();
        for (int num : arr1) {
            li.add(num);
        }
        for (int num : arr2) {
            li.add(num);
        }
        Collections.sort(li);
        return li.get(li.size()/2)+li.get((li.size()/2)-1);
    }
}