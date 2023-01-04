package classesandobjects;

public class assTwoClass {
    static int[] staticArr= {12,64,67,34,87};
    static int meanArr = 0;
    static int sumArr = 0;
    int[] nonStaticArr = {65,23,76,34};
    int theMean = 0;
    int theSum = 0;
    static int getMean(int sumArr, int []staticArr) {
        for (int val : staticArr) sumArr += val;
        meanArr = sumArr / staticArr.length;
        return meanArr;
    }
    int getAverage(int theMean, int theSum){
        for (int val : nonStaticArr) theSum += val;
        theMean = theSum / nonStaticArr.length;
        return theMean;
    }
}
