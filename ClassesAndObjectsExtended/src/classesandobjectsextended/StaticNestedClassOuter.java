package classesandobjectsextended;

class StaticNestedClassOuter {
    
    private StaticNestedClassOuter(){
    System.out.println("Message from private constructor");
    }

    static class StaticNestedClassInner {

        public void meth() {
            //System.out.println("Message from static nested class");
            StaticNestedClassOuter obj = new StaticNestedClassOuter();
        }

    }
}
