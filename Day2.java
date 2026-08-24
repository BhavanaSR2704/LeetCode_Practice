//palindrome number

class Day2 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int given = x;
        int rev = 0;
        while(x > 0){
            int digi = x % 10;
            rev = rev * 10 + digi;
            x =  x/10;
        }
        return given == rev;
    }
}
