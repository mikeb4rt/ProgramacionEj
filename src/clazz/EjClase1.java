package clazz;

public class EjClase1 {
    public static void main(String[] args) {

        Test test1 = new Test();

        test1.GetAllTest();
    }

    public static class Test{
        private int intTest;
        private char charTest='p';

        //Constructor

            /*public test(int intTest, char charTest){
                this.intTest=intTest;
                this.charTest=charTest;
            }*/

        public String GetAllTest() {

                return intTest + ", " + charTest;
        }
    }
}
