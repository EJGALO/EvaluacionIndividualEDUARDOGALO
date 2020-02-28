package PruebaIndividual;


	public class Lavadora extends Electrodomestico{
	  
//se crean las constantes por defecto
	    private final static int carga_defecto=5;
	  
	  private int carga;
	  
	
	 			public int getCarga() {
	 				return carga;
	    }
	 			
	    // si tiene una carga mayor de 30 kg, aumentara el precio 50 �, si no es as�, no se incrementara el precio.
	    //Llama al m�todo padre y a�ade el c�digo necesario
	    // Recuerda que las condiciones que hemos visto en la clase Electrodom�stico tambi�n deben afectar al precio.
	    public double precioFinal(){
	        
	        double sumaPrecio=super.precioFinal();
	  
	      
	        if (carga>30){
	        	sumaPrecio=sumaPrecio+50;
	        }
	  
	        return sumaPrecio;}

	    
	    
	  //  Un constructor por defecto. 
	    public Lavadora(){
	        this(precio_base_defecto, peso_defecto, consumo_energetico, color_defecto, carga_defecto);
	    }
	  
//Un constructor con el precio y peso. El resto por defecto. 
	    public Lavadora(double precioBase, double peso){
	        this(precioBase, peso, consumo_energetico, color_defecto, carga_defecto);
	    }
	  
	    //Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre
	    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
	        super(precioBase,peso, consumoEnergetico,color);
	        this.carga=carga;
	    }

		public Lavadora(double precioBase2, double peso2, double precioBaseDefecto, String colorDefecto) {
			super(precioBase2, peso2, precioBaseDefecto, colorDefecto);
		}


}
