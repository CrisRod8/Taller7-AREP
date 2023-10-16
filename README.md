# Taller7-AREP

# APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES  

Desarrolle una aplicación Web segura con los siguientes requerimientos:  
1. Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
2. Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
3. Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

## Instalación

Para descargar el proyecto ejecute:  

  ```
  git clone https://github.com/CrisRod8/Taller7-AREP.git
  ```

## Documentación
Para generar la documentación se debe ejecutar:  

  ```
  mvn javadoc:javadoc
  ```

Esta quedará en la carpeta target/site/apidocs:  
![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/979fcb56-263e-4123-9738-e2fcbfb95fd6)  

## Desarrollo  

1. Dentro de la carpeta instalada, abrimos el cmd y ejecutamos el siguiente comando:
    ```
    mvn clean package install
    ```
2. Corremos la maquina1 y maquina2:
   ![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/42108bf1-88fa-4845-8210-6a35c53f8d68)
   ![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/d11c089e-0251-487a-90ea-addd1f34f05e)


4. Probamos en algun browser, en este caso Google Chrome:

   https://localhost:5000/local y https://localhost:5001/local obtenemos:

   ![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/485e9957-b461-402d-bb3f-4e4dae7d614f)   
   

5. Conexion entre ellos:

   https://localhost:5000/remote y https://localhost:5001/remote obtenemos:

   ![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/27c95167-cd68-4d7d-a6f5-3f374f89b2f2)



   






   
