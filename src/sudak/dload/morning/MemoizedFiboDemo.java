package morning;

class MemoizedFiboDemo{

    void calcFibo(int n){
        int[] store = new int[n+1];
        for(int i = 1; i<=n; i++ ){
            store[i] = fib(i, store);
            System.out.print(i + ": " + store[i] + " ");
        }
    }

    int fib(int n, int[] store){
        if(n<=0) return 0;
        else if(n==1) return 1;

        else if (store[n] > 0) return store[n];

        store[n] = fib(n-1, store) + fib(n-2, store);
        return store[n];
    }

    public static void main(String[] args) {
        int i = 0;
        MemoizedFiboDemo mfd = new MemoizedFiboDemo();
        while(i <= 50) {
            mfd.calcFibo(i++);
            System.out.println();
        }
    }
}

