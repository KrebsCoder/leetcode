public static boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        int k = x;
        int y = 0;
        while (x > 0){
            y *= 10;
            y += (x % 10);
            x /= 10;
        }
        if (k != y){return false;}
        return (true);
    }
