import java.util.Scanner;
invertedHalfNumPy{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of pyramid : ");
int ln = sc.nextInt();
for(int i=ln;i>=1;i--){
for(int j=1; j<=i;j++){
System.out.print(j);
}System.out.println();
}


}
}