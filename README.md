### !! Tuve que refactorizar el ejercicio casi escribiendo el codigo desde cero otra vez porque el que entregue estaba bastante mal hecho al no entender bien el MVC. La funcionalidad es la misma y parto desde el primer commit. 

--- 

## Implementacion
Para implementar la distancia y la gasolina, he seguido el siguiente "recorrido"
1.  He implementado en la View las opciones en el menú, que me ayudarán a saber que funciones hacer
2.  Despues, escribí las funciones que necesité usar en View en el Controller, que son `echarGasolina()` y `avanzar()`. Estas se comunican con View para pedir los datos usando las funciones `pedirGasolina()`, `pedirMatricula()`, etc.
3.  Codifiqué la logica de esas funciones de Controller en el Model tal cual como se describieron en el pseudocódigo. La función `avanzar()` la hice propia de la clase coche ya que me hacía mas sentido que estuviese ahí, por lo que solamente buscan el coche por la matricula y cambian las variables de cada objeto coche buscandolo por matricula con el metodo `getCoche()`. 

## Examen Observer
### Alerta gasolina baja
He implementado un Observer que comprueba cada vez que un vehículo avanza
si el nivel de gasolina esta por debajo de 10l. Si esa condicion se cumple,
salta un mensaje por pantalla alertando de este mismo hecho tal cual como se 
puede ver en esta imagen.
![Imagen demostrativa observer](IMG%20observer.png)
### Diagrama de secuencia del metodo avanzar 
Este diagrama de secuencia hecho en sintaxis `mermaid` 
describe el proceso del programa cuando se ejecuta la funcion 
avanzar y el nivel de gasolina esta por debajo de 10.

```mermaid
sequenceDiagram
    participant View
    participant Controller
    participant Model
    participant ObserverGasolina
    
    activate Controller
    View ->> Controller:  Damos la orden a controller de avanzar
    Controller ->> View: Pide al usuario la matricula y los metros
    View ->> Controller: Envia los datos a Controller
    deactivate Controller
    
    activate Model
    Controller ->> Model: Enviamos la orden de avanzar(mat, m)
    Model ->> Model: Busca coche
    Model ->> Model: Suma distancia y resta gasolina
    activate ObserverGasolina
    Model ->> ObserverGasolina: update(coche)
    activate Controller
    Model ->> Controller: Señal satisfactorio
    Controller ->> View: Enviar mensaje satisfactorio
    deactivate Controller
    deactivate Model
    ObserverGasolina ->> ObserverGasolina: Hay menos de 10l?? -> SI
    ObserverGasolina ->> View: Enviar mensaje de alerta
    deactivate ObserverGasolina

```