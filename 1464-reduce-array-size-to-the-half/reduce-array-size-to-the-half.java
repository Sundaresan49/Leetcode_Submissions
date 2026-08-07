class Solution {
    public int minSetSize(int[] arr) {
     int og=arr.length;
     int half=og/2;
    HashMap<Integer,Integer> map=new HashMap<>();
     int remove=0;
     int times=0;
     for(int i=0;i<og;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
     }
     List<Integer> freq=new ArrayList<>(); 
     for(int i:map.values()){
        freq.add(i);
     }
     Collections.sort(freq);
     for(int i=freq.size()-1;i>=0;i--){
        times+=freq.get(i);
        remove++;
        if(times>=half){
            break;
        }
     }
     return remove;

    }
}