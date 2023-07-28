package ProblemSovling;

public class CakeCandle {
    public static void main(String[] args) {
        int K=1;
        Integer[] arr = {9,5,2,1,3,4,6,8,7};

        int matchcount=0;
        int countval=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=K){
                matchcount++;
            }
            System.out.println("i="+i+" arri="+arr[i]+" matchcount="+matchcount);
            if(matchcount==K){
                countval=i;
                System.out.println("i="+i+" countval="+countval);
                break;
            }
        }
        System.out.println(countval);
    }
}
