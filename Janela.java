// Exemplo do uso de Singleton em Java.

public final class Janela { //1)Criação da classe//
	
       //Atributos (variaveis) privados que Não serão "visiveis" fora da classe// 
       private static final Janela INSTANCE = new Janela(); //2)Atributos do tipo Pivate não são globais//
       private static final String Teste = "Ola Singleton";
       

       // Atributos (variaveis) publicos que são visiveis em qualquer lugar do sistema//
       public static final String Singleton ="Esse eu vejo fora";

       //Construtor privado.
       private Janela(){
               //Operações de inicialização da classe 
       }
     
       //Método publico estático realizando o primeiro e unico acesso necessario nesse tipo de aplicação.//
       public static Janela getInstance(){ //Método responsável pelo controle de uma unica instancia.//
       	      return INSTANCE; 
       }

       
       //Aqui vou poder executar esse método de qualquer lugar do meu projeto//
       public static void Abrir(){
         System.out.println("Abriu a Janela!");
       }
      
       //Aqui vou poder executar esse método de qualquer lugar do meu projeto//
       public static void Fechar(){ //Métodos publicos que serão visiveis em todo o sistema.
       	 System.out.println("Abriu a janela!"); 
       }



}