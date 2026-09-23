import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1;
        if(n<0)
            f=-1;
        System.out.println(f*(n%10));
        // code here
        
    }
}