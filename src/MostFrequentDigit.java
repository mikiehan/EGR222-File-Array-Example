public class MostFrequentDigit {
    public static void main(String[] args) {
        int[] freqArray = buildFrequencyArray(669260267);
        //int[] freqArray = {1, 0 , 2, 0 , 0 , 0, 4, 1, 0, 0};
        System.out.println(findMaxIndex(freqArray));
    }

    //this method will return an index that has
    //the max value within freqArray
    private static int findMaxIndex(int[] freqArray) {
        int maxIndex = 0;
        for (int i = 1; i < freqArray.length; i++) {
            if (freqArray[maxIndex] < freqArray[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int[] buildFrequencyArray(int num) {
        int[] freqArray = new int[10];
        while (num > 0) {
            int d = num % 10; //get the last digit
            //process the last digit
            freqArray[d]++; //"yes, I have seen this digit one more time"
            num /= 10; //get rid of last digit
        }
        return freqArray;
    }
}
