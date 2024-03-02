class Solution 
{
    public int mySqrt(int x) 
    {
      return (int)bin(x,0,x/2); 
    }
    public long bin(long key, long first, long last)
    {
       long mid = first + (last - first)/2;
       if(first*first == key){
           return first;
       }
       else if(last*last == key){
           return last;
       }
       else if(mid*mid == key){
           return mid;
       }
       else if(mid*mid > key){
           last = mid-1;
       }
       else if(mid*mid < key){
           if((mid+1)*(mid+1) > key){
               return mid;
           }
           else{
               first = mid+1;
           }
       }
       return bin(key, first, last);
    }
}
