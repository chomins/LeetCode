class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:nums){
             hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> hashMap.get(n1) - hashMap.get(n2));
        for(int num : hashMap.keySet()){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] answer = new int[k];
        for(int i=0; i<k; i++){
            answer[i]=pq.poll();
        }
        
        
        return answer;
    }
}