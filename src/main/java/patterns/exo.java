package patterns;

public class exo {
    static int exocal(int n){
        int best=0;
        int x=n;
        int k=Integer.toBinaryString(n).length();
        int max=(int)Math.pow(2,k)-1;
        for(int i=n;i<max;i++){
            if(best<x)
                best=x;

            x=x^(i+1);


        }
        return best;

    }
}
