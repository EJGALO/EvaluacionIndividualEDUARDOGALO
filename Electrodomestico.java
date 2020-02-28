package PruebaIndividual;

//clase padre 
public class Electrodomestico {
	   
    //Se crean las constantes defecto
    public final static String color_defecto="Blanco";
    public final static char consumo_energetico='F';
    public final static double precio_base_defecto=100;
    public  final static double peso_defecto=5;
   

    public double precioBase;
    public String color; //
    public char consumoEnergetico; //A, B,C,D,E,F
     double peso;
   
    
   //comprueba que el color es correcto, sino lo es usa el color
     //por defecto. Se invocará al crear el objeto y no será visible. 
    private void comprobarColor(String color){
   
    
        String colores[]={"Azul", "Rojo", "Negro", "Blanco", "Gris"};
        boolean colorCorrecto=false;
  
        for(int i=0;i<5 && !colorCorrecto;i++)
        {
              
            if(colores[i].equals(color))
            {
            	colorCorrecto=true;
            }
              
        }
          
        if(colorCorrecto){
            this.color=color;
        }else{
            this.color=color_defecto;
        }
          
          
    }
      
   // comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
    //Se invocará al crear el objeto y no sera visible. 
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
    if(consumoEnergetico>=65 && consumoEnergetico<=70)
        {
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=consumo_energetico;
        }
          
    }
   
  
    
//según el consumo energético, aumentara su precio, y según su tamaño también.  
    
    public double precioFinal(){
        double sumaPrecio=0;
        switch(consumoEnergetico){
            case 'A':
                sumaPrecio+=100;
                break;
            case 'B':
            	sumaPrecio+=80;
                break;
            case 'C':
            	sumaPrecio+=60;
                break;
            case 'D':
            	sumaPrecio+=50;
                break;
            case 'E':
            	sumaPrecio+=30;
                break;
            case 'F':
            	sumaPrecio+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
        	sumaPrecio+=10;
        }else if(peso>=20 && peso<49){
        	sumaPrecio+=50;
        }else if(peso>=50 && peso<=79){
        	sumaPrecio+=80;
        }else if(peso>=80){
        	sumaPrecio+=100;
        }
   
        return precioBase+sumaPrecio;
    }
   
    
    
    
    
    
    
    public double getPrecioBase() {
        return precioBase;
    }
   
    public String getColor() {
        return color;
    }
   

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
   
    public double getPeso() {
        return peso;
    }
    
    
    
    
    
    
   //se crea el constructor por defecto
    public Electrodomestico(){
        this(precio_base_defecto, peso_defecto, consumo_energetico, color_defecto);
    }
   
   //constructor 2 parametros precioBase y peso
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, precio_base_defecto, color_defecto) ;
    }
   

    //constructor todos los parametros
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }


	public Electrodomestico(double precioBase2, double peso2, double precioBaseDefecto, String colorDefecto) {
		// TODO Auto-generated constructor stub
	}
   

}

