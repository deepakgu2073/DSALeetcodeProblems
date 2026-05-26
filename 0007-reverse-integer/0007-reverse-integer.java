class Solution {
    public int reverse(int x) {
        long number = (x<0)?x*(-1):x;
        long temp = 0;
        while(number != 0){
            temp = (temp*10) + (number%10);
            
            number /= 10;
        }
        temp = (x<0)?temp*(-1):temp;
        if( temp < Integer.MIN_VALUE || temp > Integer.MAX_VALUE) return 0;
        else return (int) temp;
    }
}