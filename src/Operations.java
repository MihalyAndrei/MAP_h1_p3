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

    public static int[] Subtraction(int[] number1, int[] number2) {
        int maxLength = Math.max(number1.length, number2.length);
        int remaining = 0;
        int[] newnumber = new int[maxLength];

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

            int dif=c1-c2-remaining;
            if(dif<0){
                dif=dif+10;
                remaining=1;
            }
            else{
                remaining=0;
            }

            newnumber[newnumber.length-1-i]=dif;
        }
        return newnumber;
    }
    public static int[] Multiplication(int[] number1, int multiplier) {
        int[] newnumber=new int[number1.length+1];
        int remaining=0;
        int l=number1.length;
        for (int i=0;i<l;i++) {
            newnumber[l-i-1]=number1[l-i-1]*multiplier+remaining;
            remaining=(number1[l-i-1]*multiplier)/10;
        }
        return newnumber;
    }

    public static int intConvert(int[] arr){
        int number=0;
        for (int i=0;i<arr.length;i++) {
            number=number*10+arr[i];
        }
        return number;
    }
}
