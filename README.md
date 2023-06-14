# PatternsAssignment
Assignmen for my university class


**Pauta de evaluacion**

****EXTRA: DEBE INCLUIR PATRON FABRICA Y SINGLETON****

El Banco Think  requiere una solución tecnológica para el área de créditos, para eso se necesita que el sistema permita realizar lo siguiente:
Para el registro de los créditos de distinto ámbito, se debe manejar lo siguiente:
Se debe registrar en un formulario con los siguientes datos:
 • Número de crédito
• Registrar datos del solicitante del crédito. Se requiere únicamente: RUT, Primer Nombre, Primer y Segundo Apellido, teléfono, dirección particular, dirección laboral. 
• Monto del crédito solicitado 
• Cantidad de cuotas pactadas para el crédito. 
• Fecha de autorización del crédito. 
• Fecha posible de entrega del crédito. 

Para poder realizar la solicitud del crédito, se deben seguir las siguientes reglas de negocio:
El solicitante del crédito debe ser cliente del Banco, con una antigüedad mínima de 6 meses como tal, el sistema debe validar si cumple con este requerimiento desde la base de datos del Banco.
El monto a solicitar no debe ser mayor al 150% del sueldo del cliente, esto debe ser validado por el sistema desde la base de datos del Banco.
El número de crédito o folio de este, debe ser aleatorio, y no debe coincidir con otras solicitudes de crédito.
La cantidad de cuotas no deben ser menor a 6  y mayor a 48, si estas exceden el máximo, el sistema debe calcular un interés del 3%, si cumple con los rangos el interés será del 1.85 anual.
Si la solicitud de crédito cumple con estas reglas, esta debe ser aprobada por el jefe de sucursal, y es quien dará la autorización del crédito. Una vez autorizado el crédito, el sistema dará fecha de pago 3 días hábiles siguientes a la fecha de autorización del crédito, el sistema debe considerar que los pagos no pueden ser ni sábado ni domingos.

Como anexo se debe cumplir con lo siguiente:
• El monto del crédito siempre debe ser mayor o igual a $300.000. 
• Los créditos solo se pueden autorizar antes de los 10 días sientes al haber sido ingresados, si se pasa de esto, la solicitud debe ser visada, y el ejecutivo la debe ingresar nuevamente.


Las reglas que debe respetar este proyecto bajo lo que pide la Gerencia de Tecnología son: 
• Debe utilizar funciones polimórficas, en caso de que se implemente herencia.
 • Debe utilizar operadores sobrecargados para la captura de datos de tipo fecha. 
• Debe utilizar operadores sobrecargados para el cálculo de las fechas de pago y de entrega del credito.
 El programa cliente de la clase debe reunir los siguientes requerimientos: 
• Existe una fecha máxima para la autorización de los préstamos. 
• Existe un gran valor máximo a prestar. La sumatoria de los créditos que se ingresen no debe exceder este valor.
 • Debe permitir la captura de tantos créditos como desee ingresar el ejecutivo, a menos que se haya llegado al valor máximo a prestar. 
• Antes de capturar el crédito debe preguntar si se desea capturar los datos completos del solicitante o únicamente los datos requeridos por el crédito.
 • Debe imprimir los datos completos del crédito, incluyendo la fecha de entrega y las fechas de pago de las cuotas.

