package controlstatements;

public class Assignment {
    public static void main(String[] args){
        int[] myArr = {5,2,6,7,3};
        int sum = 0;
        for (int val : myArr) sum += val;
        System.out.println(sum);
    }
}
