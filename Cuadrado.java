package www.unlam.edu.ar;

public class Cuadrado {
	 private Integer lado ;
	 private Integer area;
	 public Cuadrado(Integer lado1) {
		 
		 lado = lado1;
		 
	 }
     public Integer calcularArea(){
    	   area = lado * lado;
    	   return area;
    	 // comentario agregado en github
     }
     
}
