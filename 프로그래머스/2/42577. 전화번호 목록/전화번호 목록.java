import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
            HashMap<String, Integer> map = new HashMap<>();
            for(int i=0; i<phone_book.length;i++){
                map.put(phone_book[i],i);
            }
            for(int i=0; i< phone_book.length ; i++){
                for(int j=phone_book[i].length()-1; j>0 ; j--){
                    String subS = phone_book[i].substring(0,j);
                    if(map.containsKey(subS))
                        return false;
                }
            }
            return true;
        }
        
    }
