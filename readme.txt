El siguiente es un instructivo para empaquetar y correr el ejercicio de docker. El objetivo del ejercicio es consumir un servicio REST a trav�s de una aplicaci�n web desplegada en un servidor Wildfly. Al final del ejercicio se ver� en consola la palabra HELLO WORLD!

Pasos: 

1. Correr en powershell ejecutado con privilegios de administrador el script "run-it.bat".
2. El servicio debe correr en el puerto 8080 de la m�quina virtual. Se puede acceder con el comando curl http://{ip_maquina_virtual}:8080/01-0.0.1-SNAPSHOT/rest/message/ desde powershell.