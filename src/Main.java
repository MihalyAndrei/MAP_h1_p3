import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number1={8,7,0,0,0,4}; //435002
        int[] number2={1,3,0,0,0,0};
        int multiplier=2;
        int divider=2;
        System.out.println("The numbers are: "+Operations.intConvert(number1)+" and "+Operations.intConvert(number2));

        //1
        System.out.print("Their addition: ");
        int[] newnumber1=Operations.Addition(number1,number2);
        for(int i=0;i<newnumber1.length;i++){
            System.out.print(newnumber1[i]);
        }
        System.out.println();

        //2
        System.out.print("Their subtraction: ");
        int[] newnumber2=Operations.Subtraction(number1,number2);
        for(int i=0;i<newnumber2.length;i++){
            System.out.print(newnumber2[i]);
        }

        //3
        System.out.println();
        System.out.print("The multiplication between "+Operations.intConvert(number1)+" and "+multiplier+": ");
        int[] newnumber3=Operations.Multiplication(number1,multiplier);
        for(int i=0;i<newnumber3.length;i++){
            System.out.print(newnumber3[i]);
        }

        //4
        System.out.println();
        System.out.print("The division between "+Operations.intConvert(number1)+" and "+divider+": ");
        int[] newnumber4=Operations.Division(number1,divider);
        for(int i=0;i<newnumber4.length;i++){
            System.out.print(newnumber4[i]);
        }
    }


}
