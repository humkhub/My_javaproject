
    public class NumberEnhancerNonStatic {
        public int enhance(int num1,int num2){ // non static method
            if (num1>num2){
                System.out.println("Enhanced Number "+ num1);
                return num1;
            }
            else {
                System.out.println("Enhanced Number "+ num2);
                return num2;
            }
        }

        public static void main(String[] args) {
            NumberEnhancerNonStatic objenhance = new NumberEnhancerNonStatic();
            objenhance.enhance(20, 10);
        }
    }

