class Solution {
    public String[] findOcurrences(String text, String first, String second) {
       String[] og=text.split(" ");
       ArrayList<String> arr= new ArrayList<String>();
       for(int i=0;i<=og.length-3;i++){
        if(og[i].equals(first)){
            if(i!=og.length-1){
            if(og[i+1].equals(second)){
                arr.add(og[i+2]);
            }
            }
        }
       }
    String[] newg=arr.toArray(new String [0]); 
       return newg;
    }
}