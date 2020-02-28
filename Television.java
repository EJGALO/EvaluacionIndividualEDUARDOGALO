package PruebaIndividual;



	public class Television extends Electrodomestico{
		  
	   //se define la constante
	    private final static int resolucion_defecto =20;
	    
	    private int resolucion;
	    private boolean sintonizador;
	  
	  
	    
       //SI  tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado,
	   // aumentara 50 €.
	    //Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio.
	    public double precioFinal(){
	         double sumaPrecio=super.precioFinal();
	  
	  
	        if (resolucion>40)
	        {
	        	sumaPrecio=sumaPrecio+precioBase*1.3;
	        }
	        if (sintonizador)
	        {
	        	sumaPrecio=sumaPrecio+50;
	        }
	  
	        return sumaPrecio;
	    }
	  
	    
	  
	    //Un constructor por defecto
	    public Television(){
	        this(precio_base_defecto, peso_defecto, consumo_energetico, color_defecto, resolucion_defecto, false);
	    }
	  
	   //Un constructor con el precio y peso. El resto por defecto. 
	    public Television(double precioBase, double peso){
	        this(precioBase, peso, consumo_energetico, color_defecto, resolucion_defecto, false);
	    }
	  
	   //Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados
	    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizador){
	        super(precioBase, peso, consumoEnergetico, color);
	        this.resolucion=resolucion;
	        this.sintonizador=sintonizador;
	    }
	

}