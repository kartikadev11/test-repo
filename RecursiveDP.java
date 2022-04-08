import javax.sound.sampled.SourceDataLine;

public class RecursiveDP {
    private static int fib_recur(int n){
        int fibo = 0;
        if(n==1 || n==2){
            fibo =1;
        }else{
            fibo = fib_recur(n-1)+fib_recur(n-2);
        }
        return fibo;
    }
    private static int fibMemoize(int n ,int[] memoize){
        if(memoize[n] != 0){
            return memoize[n];
        }
        int fibo = fibMemoize(n-1, memoize) +fibMemoize(n-2, memoize);
        memoize[n]=fibo;
        return fibo;
    }
    private static int fib_dynamic(int n){
        int[] fibDP = new int[n+1];
        fibDP[1]=1;
        fibDP[2]=2;
        if(n==1 || n==2){
            return 1; //true
        }
        for(int i = 3;i<n+1;i++){ // dimulai dari 3 karena n1 dan n2 sudah diketahui nilainya
            fibDP[i] = fibDP[i-1] + fibDP[i-2];
        }
        return fibDP[n];
    }
        
        public static void main(String[] args) {
            //fibonacci n=5 1,1,2,3,5
            int first = 1; // n1 =1
            int second = 1; // n2=1
            //BigInteger second= BigInteger.ZERO;
            int n=5;
            int fibo =0;
            int last =0;
            int current=0;
            if (n==1 || n==2) { 
                fibo=1;
            
            }else{
                for(int i=1;i<=n;i++){
                    if (i==1 || i==2) {
                        fibo=1;
                        last=first;
                        current=second;
                    }else{
                        //last=current;
                        fibo = last + current;
                        last = current;
                        current=fibo;
                    }
                }
            }
            System.out.println(fibo);


            //calling recursive fibonacci
            int s = fib_recur(5);
            System.out.println(s);

            //callng dynamic with memoize
            int fill=5;
            int[]dpmemo= new int[fill+1];
            int resultMemo = fibMemoize( fill,dpmemo);
            System.out.println(resultMemo);

            //calling dynamic bottom ip
            int a = fib_dynamic(5);
            System.out.println(a);
        }
    }
