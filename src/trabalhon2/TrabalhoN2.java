package trabalhon2;

import java.util.Scanner;

public class TrabalhoN2 {

   
    public static void main(String[] args) {
     
        FG listaF[] = new FG[4];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<4;i++){
            if(i<2) {
                Circulo c = new Circulo();
                System.out.println("Digite o raio do círculo " + (i+1));
                c.setRaio(sc.nextDouble());
                listaF[i] = c;
          
            }
            else{
                Retangulo r = new Retangulo();
                System.out.println("Digite a base do retângulo " + (i-1));
                r.setBase(sc.nextDouble());
                listaF[i] = r;
                System.out.println("Digite a altura do retângulo " + (i-1));
                r.setAltura(sc.nextDouble());
                listaF[i] = r;
            }
        }
        
        
    }
    
}
