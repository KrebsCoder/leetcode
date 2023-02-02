class Solution {
    public static int romanToInt(String s) {
        int lineLength = s.length();
        int num = 0;
        for (int i = 0; i < lineLength; i++){
            switch (s.charAt(i)) {
                case 'M':
                    num += 1000;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'C':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                        num += 400;
                        i++;
                        break;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M'){
                        num += 900;
                        i++;
                        break;
                    }
                    num += 100;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'X':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                        num += 40;
                        i++;
                        break;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C'){
                        num += 90;
                        i++;
                        break;
                    }
                    num += 10;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'I':
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'V'){
                        num += 4;
                        i++;
                        break;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X'){
                        num += 9;
                        i++;
                        break;
                    }
                    num += 1;
            }
        }
        return num;
    }
}
