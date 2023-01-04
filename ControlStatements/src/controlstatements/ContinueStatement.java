package controlstatements;

public class ContinueStatement {

    public static void main(String[] args) {

        int ary[] = {15, 10, 37, 60, 44, 67, 30};

        for (int i = 0; i < ary.length; i++) {

            if (ary[i] % 10 != 0) {
                continue;
            }

            System.out.println(ary[i]);
        }
    }

}
