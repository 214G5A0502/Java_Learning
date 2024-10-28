package Methods;
import java.util.Scanner;
public class Find_Prime_or_Not {
	//method creation "isPrime"
    public static String isPrime(int n){
    int count=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            count ++;
        }
    }if(count==2){
        return "prime";
    }else{
        return "not prime";
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num: ");
        int n=sc.nextInt();
        sc.close();
        String res=isPrime(n);
        System.out.println(res);
    }
}
/*
=======================For optimizing code=========================
int count=0;
for(int i=2;i<=n/2;i++){
    //same above code
    }
}if(count==0){
    //same above code
}else{
    //same above code 
}
*/