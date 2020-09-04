class Result {

    /*
     * Complete the 'featuredProduct' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY products as parameter.
     */

    public static String featuredProduct(List<String> products) {
        Collections.sort(products);
        int currCount = 1;
        String prevItem = products.get(0);
        String maxItem = products.get(0);
        int maxCount = 1;
        for (int i = 1; i < products.size(); i++) {
            String currItem = products.get(i);
            if (currItem.equals(prevItem)) {
                currCount++;
                if (currCount >= maxCount) {
                    maxCount = currCount;
                    maxItem = currItem;
                }
            } else {
                prevItem = currItem;
                currCount = 1;
            }
        }
        return maxItem;
    }
}