import java.util.Random;

public class Dados {

   public static void main(String[] agrs)
   {
      Random randomNumbers = new Random();

        int lado1; 
        int lado2; 
        int total[] = new int[ 13 ]; 

        for ( int rodadas = 1; rodadas <= 36000; rodadas++ ) {
            lado1 = 1 + randomNumbers.nextInt( 6 );
            lado2 = 1 + randomNumbers.nextInt( 6 );
            total[ lado1 + lado2 ]++;
        } 

        System.out.printf( "%3s%12s%12s\n", "Soma", "Frequencia", "Porcentagem" );
  
        for ( int k = 2; k < total.length; k++ )
        {
            int porcentagem = total[ k ] / ( 360 );
            System.out.printf( "%3d%12d%12d\n", k, total[ k ], porcentagem );
        }

   }
   
}