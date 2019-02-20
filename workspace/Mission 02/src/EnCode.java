import java.util.Scanner;

public class EnCode {
    public static void main(String[] args) {
        int plaintext = 0;
        int ciphertext = 0;
        int temp=1000;
        int  num=0;
        int bit[] = new int[4];
 
        Scanner input = new Scanner(System.in);
 
        System.out.print("请输入4位正整数:");
        plaintext = input.nextInt();
 
        for(int i=0; temp>=1;temp=temp/10,i++){
            bit[i]=(int)plaintext/temp;
            num= bit[i];
            System.out.println(bit[i]);
            System.out.printf("\tbit["+i+"]="+bit[i]);
            bit[i]=(bit[i]+5)%10;
            System.out.printf("\tbit["+i+"]="+bit[i]);
            plaintext=plaintext-num*temp;
            System.out.println();
 
 
        }
        for(int i=0;i<2;i++){
            temp=bit[i];
            bit[i]=bit[bit.length-1-i];
            bit[bit.length-1-i]=temp;
 
        }
        System.out.print("\n密文:");
        temp=1000;
        for(int i=0; temp>=1;temp=temp/10,i++) {
 
            ciphertext=bit[i]*temp+ciphertext;
 
        }
        System.out.println(ciphertext);
    }
}
