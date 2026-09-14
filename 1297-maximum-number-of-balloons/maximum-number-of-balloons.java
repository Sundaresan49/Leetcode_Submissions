class Solution {
    public int maxNumberOfBalloons(String text) {
     HashMap<Character,Integer> map=new HashMap<>();
      map.put('b',0);
      map.put('a',0);
      map.put('l',0);
      map.put('o',0);
      map.put('n',0);
      for(int i=0;i<text.length();i++){
        char curr=text.charAt(i);
        if(!map.containsKey(curr)){
            continue;
        }
        map.put(curr,map.getOrDefault(curr,0)+1);
      }
      List<Integer> ls=new ArrayList<>();
      for(char i:map.keySet()){
        if((i=='o')||(i=='l')){
            ls.add(map.get(i)/2);
        }
        else{
            ls.add(map.get(i));
        }
      }
        int ans=Integer.MAX_VALUE;
        for(int i:ls){
            ans=Math.min(ans,i);
        }

      return ans;           
    }
}