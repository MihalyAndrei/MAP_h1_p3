public class Main {
    public static void main(String[] args) {
        int[] number2={8,7,0,0,0,0};
        int[] number1={1,3,0,0,0,0};

        //1
        int[] newnumber1=Operations.Addition(number1,number2);
        for(int i=0;i<newnumber1.length;i++){
            System.out.print(newnumber1[i]);
        }
        System.out.println();
        //2
        int[] newnumber2=Operations.Subtraction(number1,number2);
        for(int i=0;i<newnumber2.length;i++){
            System.out.print(newnumber2[i]);
        }


    }
}
