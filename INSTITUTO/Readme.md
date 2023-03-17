En la programación orientada a objetos en Java, el uso de getters y setters no es obligatorio, pero se considera una buena práctica de programación.

Los getters y setters son métodos que se utilizan para acceder y modificar los atributos de una clase de forma controlada. Estos métodos permiten establecer restricciones y validar los datos antes de modificarlos o devolverlos.

La ventaja de utilizar getters y setters es que permiten mantener el control sobre el acceso a los atributos de la clase, evitando que se puedan modificar de forma incorrecta o inconsistente. Además, permiten la flexibilidad para cambiar la implementación interna de la clase sin afectar el código que la utiliza.

Sin embargo, en algunas situaciones puede no ser necesario utilizar getters y setters, especialmente en clases simples con pocos atributos y métodos. En estos casos, se puede acceder a los atributos directamente desde el código que utiliza la clase. Pero en general, se recomienda el uso de getters y setters para mantener una buena encapsulación y modularidad en el diseño de la clase.

En este ejercicio en particular, es util emplear los getters para poder incluir el sexo por defecto al definir los constructores en las subclases. También para acceder a los datos de los objetos creados al llamar a los métodos sin tener que inicializarlos de nuevo.
