    
class Solution {
    public int reverse(int x) {
         int rev_num = 0;
        boolean negative= false;
        if(x<0){
            negative =true;
            x=-x;
        }
        int prev_rev_num = 0;
        while(x>0){
            rev_num =rev_num*10 + x%10;
            
            if((rev_num-x%10)/10!= prev_rev_num){
                return 0;
            }
            x = x/10;
            
            
           prev_rev_num =  rev_num;
        }
       return negative?- rev_num: rev_num;
        
        
        
    }
}