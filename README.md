Evaluación 2: PRUEBA INDIVIDUAL 27/02/2020

EDUARDO JARED GALO ERAZO

En el cuadro de la segunda evaluación individual Java Full Stack, se nos pidió realizar un programa que  fuese capaz de sumar la totalidad de todos los electrodomesticos, lavadoras y televisores. 
Sus precios estarían determinados según ciertas caracteristicas para cada objeto como la resolución de la pantalla, la carga de la lavadora y el consumo energetico. 

El ejercicio nos pide crear 3 clases diferentes, una clase padre llamada Electrodomesticos y dos clases hijas llamadas Lavadora y Television, esto sin considerar la clase ejecutable. 

Para cada clase las instrucciones nos piden crear un constructor por defecto, un constructor con el precio y el peso y finalmente un constructor con el atributo unico de cada clase y los atributos heredados. 

A su vez, se nos piden crear ciertas constantes para todas las clases, tales como el color de defecto, el consumo energetico, el precio base,  y el peso.

Se nos pide ademas, crear  una serie de metodos como el comprobar el consumo energetico y el color, y el precio final, este ultimo tendra ciertas determinantes según la clase en la cual se encuentre.

Para responder a las demandas de la evaluación se optó por crear  las 4 clases pedidas, primero asignando los atributos de cada una y fijando las constantes, para luego abordar cada clase individualmente:

Clase: Electrodomestico:

Luego de crear las variables y sus respectivos getters,  se optó por crear un menu switch dentro del metodo precio final,  el cual considera el  valor de la variable consumo energetico según la letra asignada. 

A su vez, en este metodo se incluyó tambien un condicional if para poder determinar el peso del producto y el precio a pagar según sus caracteristicas. 

Finalmente, se crearon los constructores pedidos. 

Clase: Lavadora y Television

Ipara estas clases bastó con crear metodos diferentes del metodo precioFinal, los cuales  varian según las indicaciones dadas por el ejercicio.

Clase main:

Se inicializaron los valores de la suma de los electrodomesticos, televisores y lavadoras en 0. 
Seguido de esto  se procede a crear un arreglo de 10 posiciones en el cual luego se crean nuevas instancias de  cada clase con valores dados de manera arbitraria según el tipo de producto.

Finalmente,  se  llama  a un for para recorrer el arreglo, en este  existen 3 condicionales que compararán el tipo de objeto que existe dentro del arreglo. Se utiliza el  operador instanceOf para determinar si es que el objeto pertenece o no a determinada clase. Una vez determinada la pertencia, se llama al metodo precioFinal de su respectiva clase y el valor del objeto se registra en un acumulador propio para cada clase. 
