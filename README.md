1. Antes de compilar y ejecutar el programa se deberá descargar los archivos de la siguiente liga https://github.com/JorgePedraza2019/Bisiesto.git

2. Los archivos se pueden descargar directamente desde la página dando clic en el botón Clone or Download
   - Si desea instalar el archivo desde la terminal Git, se debe utilizar la siguiente sintaxis de comando: Git clone https://github.com/JorgePedraza2019/Bisiesto.git
   - Para compilar el archivo deberás entrar a la carpeta de Calculadora desde la terminal Git.

3. Para entrar a una carpeta se usa el comando "cd (Nombre de carpeta)".
   - Para salir de una carpeta se usa el comando "cd ..".
   - Para conocer la lista de archivos de la ubicación actual se usa el comando "dir" o "ls".
   - Para conocer la ubicación donde te encuentras se usa el comando "pwd".
   - Si no encuentras la ubicación de la carpeta Calculadora, te recomiendo buscar el archivo en el explorador de archivos para establecer primero la ruta de ubicación.
   - Una vez estado adentro de la carpeta Calculadora en la termina Git, se utiliza el siguiente comando para compilarlo: Javac Calculadora.java
   - Para ejecutar el archivo deberás utilizar el siguiente comando: Java Calculadora

4. Una vez que el archivo se ejecute, podrás utilizarlo escribiendo un año para que el programa devuelva el resultado "true" si el año es bisiesto o "false" si el año no es bisiesto.
   - Cabe recalcar que el valor ingresado deberá ser mayor a 999 y menor a 10,000 para su correcta ejecución. De lo contrario, pedirá nuevamente el ingreso de un año válido.
   - Además, el valor solamente deberá ser numérico entero, si se ingresa un caracter o valor flotante, el programa detectará el error y le mencionará que no es válido el dato ingresado, terminando con el proceso.