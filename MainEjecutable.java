package PruebaIndividual;

public class MainEjecutable {

	public static void main(String[] args) {
	
	     int  sumaElectrodomesticos=0;
	        int  sumaTelevisiones=0;
	        int  sumaLavadoras=0;

			   
		//Crea un array de Electrodomésticos de 10 posiciones.
        Electrodomestico arregloElectrodomesticos[]=new Electrodomestico[10];
   
   
        //"Azul", "Rojo", "Negro", "Blanco", "Gris
        //precio peso letra color sintetizador
        //electrodomestico = new Electrodomestico(precio,peso,letra,color)
        //=new Lavadora (precio, peso, letra, color, carga
        //=new Television(precio, peso, letra, color, true)
        arregloElectrodomesticos[0]=new Electrodomestico(666, 1, 'C', "Verde");
        arregloElectrodomesticos[1]=new Electrodomestico(156, 2, 'A', "Gris");
        arregloElectrodomesticos[2]=new Electrodomestico(156, 20, 'D', "Gris");
        arregloElectrodomesticos[3]=new Electrodomestico(10, 3,'B', "Gris" );
        arregloElectrodomesticos[4]=new Television(111, 1, 'E', "Rojo", 42, false);
        arregloElectrodomesticos[5]=new Television(150, 5, 'C', "Rojo", 30, true);
        arregloElectrodomesticos[6]=new Television(250, 4,'C', "Rojo", 30, true);
        arregloElectrodomesticos[7]=new Lavadora(300, 60, 'A', "Blanco", 40);
        arregloElectrodomesticos[8]=new Lavadora(400, 35, 'A', "Negro", 15);
        arregloElectrodomesticos[9]=new Lavadora(400, 50, 'A', "Negro", 15);
        		
       
        	
        
     //se valida si el objeto en el arreglo pertenece o no a alguna de las clases creadas para
        //utilizar el metodo precioFinal pertinente
        for(int i=0;i<10;i++){
          
        	 if(arregloElectrodomesticos[i] instanceof Electrodomestico)
        	 {
                 sumaElectrodomesticos+=arregloElectrodomesticos[i].precioFinal();
             }
             if(arregloElectrodomesticos[i] instanceof Lavadora)
             {
                 sumaLavadoras+=arregloElectrodomesticos[i].precioFinal();
             }
             if(arregloElectrodomesticos[i] instanceof Television){
                 sumaTelevisiones+=arregloElectrodomesticos[i].precioFinal();
             }
         }
    
 	   int total=( sumaLavadoras+sumaTelevisiones+sumaElectrodomesticos);
        
		        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos +" euros.");
		        System.out.println("");
		        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras +" euros.");
		        System.out.println("");
		        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones +" euros.");
		        System.out.println("-------------------------------------");
		        System.out.println("La suma total de todos los productos es de: "+total+" euros.");
		   
		    
		   
		}

	}


