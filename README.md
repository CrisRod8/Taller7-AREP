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


## AWS  

Para probarlo en AWS debemos usar el servicio EC2 que hemos trabajado en laboratorios anteriores, Lanzamos una instancia y en ella debemos tener instalado git, mvn y java. Una vez instalamos lo anterior clonamos este repositorio.  
Debemos editar los archivos de las maquinas 1 y 2:  
![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/fef1a562-176d-421e-a3e1-5c0c18f3ace6)  
![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/eabc943b-d151-4575-b85a-7133cfd452f3)  

Ejecutamos en la raiz:  

  ```
  mvn clean package install
  ```  
Luego en una consola:  

  ```
  java -cp "target/classes:target/dependency/*" org.example.Maquinas.Maquina1
  ```
Y en otra consola:  

  ```
  java -cp "target/classes:target/dependency/*" org.example.Maquinas.Maquina2
  ```
Como resultado tendremos:  
![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/1f920db5-f8dd-4b6e-81cc-d3943091f0ec)  
![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/868a23ef-949e-4681-b6fd-88e8873e89d0)  

Y al entrar en algun browser con https://ec2-54-91-41-98.compute-1.amazonaws.com:5000/local y https://ec2-54-91-41-98.compute-1.amazonaws.com:5001/local obtenemos:  

![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/db06910b-5c64-4f0a-a0a1-e6cbd30c692c)  

Video de ejecución:  


## Arquitectura  

![image](https://github.com/CrisRod8/Taller7-AREP/assets/111186898/e97292dc-560c-4fe3-a33a-d23ec0daa83e)  

En base a la imágen anterior se uso un browser que puede hacer la consulta de recursos usando una instancia del servicio EC2, la instancia cuenta con los recursos suficientes para poder hacer una conexión segura entre máquinas.

   
