public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>();
        int maxCandies = 0;

        for(int j = 0; j < candies.length; j++){
            if (candies[j] > maxCandies){
                maxCandies = candies[j];
            }
        }

        for (int i = 0; i < candies.length; i++){
            if (candies[i] + extraCandies >= maxCandies){
                booleanList.add(true);
                continue;
            }
            booleanList.add(false);
        }
        return (booleanList);
    }
