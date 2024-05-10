

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Primeiro Parametro: ");
        int parametroUm = scan.nextInt();
       
        System.out.println("Digite o Primeiro Parametro: ");
        int parametroDois = scan.nextInt(); 

        try {
            
          contar (parametroUm, parametroDois);
        
        }catch(ParametrosInvalidosExcepiton e){
            System.out.println(e.getMessage());
        }

    }


    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosExcepiton{
        if(parametroUm >=  parametroDois){
            throw new  ParametrosInvalidosExcepiton("O segundo parâmetro deve ser maior que o primeiro!");

        }
            int contagem = parametroDois - parametroUm;
        for ( int i = 1; i <= contagem; i++){
            System.out.println("Números impresso: " + i);
        }

        }
}
