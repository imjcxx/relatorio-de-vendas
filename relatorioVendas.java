import java.util.Scanner;

/**
 *
 * @author cassia
 */
public class relatorioVendas {  
   public static double mediaSemana(double [] infVenda){
       double temp = 0;
       double media = 0;
       
       for(int i=0; i<infVenda.length; i++){
             
           temp+=infVenda[i];
       }
       
       media=temp/7;
       
       return media;
    }
   
   public static double [] maiorDiaFat(double[]vetorInf, double mediaInf){
       double [] maiorFat = new double[vetorInf.length];
       
       for(int i=0; i<vetorInf.length; i++){
           
       if(vetorInf[i]>mediaInf){
           
           maiorFat[i]=vetorInf[i];
       
   }
}
       return maiorFat;
}
   
    
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
            int semana = 7;
            double [] vetor = new double [semana];
            
            for(int i = 0; i < semana; i++){
            System.out.printf("Digite o faturamento do dia %d\n", (i+1));
            vetor[i] = input.nextDouble();
        }
            
          System.out.println("---EXIBINDO FATURAMENTO POR DIA---");
            
          for(int i=0; i<vetor.length; i++){
              
          System.out.printf("Dia[%d] R$ [%.2f]\n",(i+1),vetor[i]);
      
    }
          
          System.out.println("---EXIBINDO MÉDIA DE FATURAMENTO DA SEMANA---");
          
          double mediaM= mediaSemana(vetor);
          
          System.out.printf("A média da semana é R$ %.2f\n",mediaM);
        
          System.out.println("---Dias com Faturamento acima da média---");
          
          double [] fatMaior = maiorDiaFat(vetor,mediaM);
         
          int diaContado =0;
          
          for(int i=0; i<fatMaior.length; i++){
          if( fatMaior[i]>0){ 
          
          diaContado++;
          }
    
       } 
          System.out.printf("Foram %d dias com faturamento acima da média: R$ %.2f\n",diaContado,mediaM);
          
          
    }
    
          
}
