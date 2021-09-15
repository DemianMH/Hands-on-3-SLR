package slr;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Slr {
//Inicializar los atributos
    int x,y;
    int [] num;
   //Metodos
public void arrX(int num[]){
    for(int i=0;i<num.length;i++){
        num[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta X: "));
    }
}
public void arrY(int num[]){
    for(int i=0;i<num.length;i++){
        num[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta Y:  "));
    }
}
//Xi 
public int OpeX1(int num[]){
     int res=0;
    for(int i=0;i<num.length;i++){
        res+=num[i];  
      }  
  return res;
} 
//X^2i
public int OpeX2(int num[]){
    int res=0;
    for(int i=0;i<num.length;i++){
        res+=Math.pow(num[i],2);
    }
    return res;
}
//Yi
public int OpeY1(int num[]){
    int res=0;
    for(int i=0;i<num.length;i++){
        res+=num[i];    
    }
    return res;
}
//Xi*Yi
public int Opemult(int num[],int num2[]){
    int res=0;
    for(int i=0;i<num.length;i++){
        res+=(num[i]*num2[i]);
    }
    return res;
}
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
       Slr slr = new Slr();
       //Pedir cuantos datos tiene el usuario
       int n= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de datos: "));
       int numx[]=new int [n];
       int numy[]=new int [n];
       slr.arrX(numx);
       slr.arrY(numy);
       
       double xpory=slr.Opemult(numx, numy);
       double x1=slr.OpeX1(numx);
       double x2=slr.OpeX2(numx);
       double y1=slr.OpeY1(numy);
       
       double y =y1/n;
       double x =x1/n;
       
       double b1=((n*xpory)-(x1*y1))/((n*x2)-(x1*x1));
       double b0= y-(b1*x);
       System.out.println("Valor de Beta 1: "+b1);
       System.out.println("\nValor de Beta 0: "+b0);
    }
    
}
