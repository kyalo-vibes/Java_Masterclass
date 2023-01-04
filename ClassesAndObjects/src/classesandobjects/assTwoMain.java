package classesandobjects;

public class assTwoMain {
    public static void main(String[] args){
        assTwoClass obj = new assTwoClass();

        System.out.println("The non static average is :" + obj.getAverage(obj.theMean, obj.theSum));
        System.out.println("Static mean is :" + assTwoClass.getMean(assTwoClass.sumArr, assTwoClass.staticArr));
    }
}
