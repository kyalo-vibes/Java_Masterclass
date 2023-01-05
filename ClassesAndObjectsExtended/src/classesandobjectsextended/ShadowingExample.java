package classesandobjectsextended;

class ShadowingExample {

    public int var = 0;

    class InnerClass {

        public int var = 1;

        void meth(int var) {
            System.out.println("x = " + var);
            System.out.println("this.x = " + this.var);
            System.out.println("ShadowingExample.this.x = " + ShadowingExample.this.var);
        }
    }

    public static void main(String[] args) {
        ShadowingExample st = new ShadowingExample();

        ShadowingExample.InnerClass innerObj = st.new InnerClass();

        innerObj.meth(5);
    }
}
