public class Operations {
    public static int[] Addition(int[] number1, int[] number2) {
        int maxLength = Math.max(number1.length, number2.length);
        int remaining = 0;
        int[] newnumber = new int[maxLength+1];

        for (int i=0;i<maxLength;i++) {
            int c1=0;
            int c2=0;

            int pos1=number1.length-i-1;
            if(pos1>=0){
                c1=number1[pos1];
            }

            int pos2=number2.length-i-1;
            if(pos2>=0){
                c2=number2[pos2];
            }

            int sum=c1+c2+remaining;
            newnumber[newnumber.length-1-i]=sum%10;
            remaining=sum/10;
        }
        if (remaining>0){
            newnumber[0]=remaining;
        }
        return newnumber;
    }
}
