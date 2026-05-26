class Solution {
    public boolean isPalindrome(int x) {
        long number = (x<0)?x*(-1):x;
        long temp = 0;
        while(number != 0){
            temp = (temp*10) + (number%10);
            number /= 10;
        }
        
        if(x == temp) return true;
        else return false;
        
    }
}