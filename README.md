Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Personal Universitario y Cálculo Salarial (Clases Abstractas, Polimorfismo y Casteo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🎓 Simulación de Personal Universitario y Cálculo Salarial (Clases Abstractas y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de gestión de recursos humanos para una institución académica, implementando una arquitectura basada en clases abstractas y herencia para administrar distintos roles profesionales (profesores titulares, investigadores y ayudantes de cátedra) con reglas especializadas de cálculo salarial bruto, bonificaciones por antigüedad y producción científica o docente. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la implementación obligatoria de contratos en clases abstractas (`abstract`), la sobrescritura polimórfica de comportamiento (`@Override`), el procesamiento de arreglos polimórficos y la verificación de tipos mediante el operador `instanceof` en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base abstracta, sus respectivas subclases especializadas y un punto de ejecución:

* **`PersonalUniversitario` (Clase Abstracta)**: Centraliza los atributos y comportamientos comunes de cualquier empleado vinculado a la universidad.
* **Atributos protegidos (`protected`)**: `nombre`, `legajo`, `antiguedadAnios` y `sueldoBase`, permitiendo que las clases hijas accedan directamente a la identidad y remuneración básica del personal.
* **Constructor**: Inicializa los datos comunes de identificación y antigüedad.
* **Métodos operativos**:
* `abstract double calcularSalarioMensualBruto()`: Método abstracto que obliga a cada rol a implementar su propia lógica remunerativa.
* `mostrarInformacion()`: Método concreto compartido que imprime por consola el nombre, legajo y antigüedad del empleado.




* **`ProfesorTitular`**: Extiende de `PersonalUniversitario` para modelar al plantel docente con dedicación frente a alumnos.
* **Atributos privados (`private`)**: `horasFrenteAlumnos` y `categoriaDocencia`.
* **Constructor**: Invoca a `super(...)` para configurar los datos base y asigna las horas y categoría docente.
* **Sobrescritura (`@Override`)**:
* `calcularSalarioMensualBruto()`: Calcula la remuneración sumando el sueldo base, un bono por antigüedad (2% anual), un complemento por horas de clase y un adicional por categoría si corresponde.




* **`Investigador`**: Extiende de `PersonalUniversitario` para modelar personal dedicado al desarrollo científico y publicación de artículos.
* **Atributos privados (`private`)**: `cantidadPapers` y `subsidioAsignado`.
* **Constructor**: Utiliza `super(...)` para la asignación de atributos heredados.
* **Sobrescritura (`@Override`)**:
* `calcularSalarioMensualBruto()`: Computa el salario sumando el sueldo base, el bono por antigüedad y un incentivo económico por cantidad de papers publicados.


* **Método específico**: `getSubsidioAsignado()` para consultar el fondo de investigación asignado.


* **`AyudanteCatedra`**: Extiende de `PersonalUniversitario` para modelar asistentes académicos que coordinan prácticas estudiantiles.
* **Atributo privado (`private`)**: `asignacionPracticas`.
* **Constructor**: Utiliza `super(...)` y configura las asignaciones prácticas.
* **Sobrescritura (`@Override`)**:
* `calcularSalarioMensualBruto()`: Determina el sueldo bruto integrando el básico, la bonificación por antigüedad y el estipendio por trabajos prácticos guiados.




* **`Main`**: Punto de entrada del programa. Instancia un profesor titular, una investigadora y un ayudante de cátedra, los agrupa en un arreglo polimórfico de tipo `PersonalUniversitario[]`, y recorre la colección generando un reporte institucional que invoca dinámicamente los salarios y utiliza un casteo seguro (`instanceof`) para extraer información exclusiva de los investigadores.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Contractual Obligatorio:** Mediante la clase abstracta, se garantiza que cualquier nuevo rol que se integre a la universidad implemente de manera obligatoria su propio algoritmo de cálculo salarial bruto.
2. **Bonificación Uniforme por Antigüedad:** Todos los tipos de personal comparten el beneficio del cálculo de antigüedad (`sueldoBase * 0.02 * antiguedadAnios`), reutilizando la lógica común desde los componentes derivados.
3. **Procesamiento Polimórfico y Inspección de Tipos:** El uso de arreglos de la superclase permite procesar reportes masivos de manera uniforme, aplicando un filtro condicional con `instanceof` para mostrar datos especializados (como subsidios) únicamente cuando el objeto evaluado lo requiere.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== REPORTE INSTITUCIONAL =====

------------------------------
Nombre: Carlos Gomez
Legajo: 1001
Antiguedad: 10 años
Salario mensual bruto: $1116000.0

------------------------------
Nombre: Laura Martinez
Legajo: 1002
Antiguedad: 5 años
Subsidio asignado: $1500000.0
Salario mensual bruto: $1150000.0

------------------------------
Nombre: Pedro Fernandez
Legajo: 1003
Antiguedad: 3 años
Salario mensual bruto: $560000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Abstracción y Jerarquía Académica:** Modelado de perfiles institucionales mediante una arquitectura limpia de herencia orientada a objetos.
* **Polimorfismo y Ligadura Dinámica:** Ejecución automática de los métodos de cálculo salarial específicos para cada subclase en tiempo de ejecución.
* **Casteo Seguro de Tipos (`instanceof`):** Mecanismo defensivo para identificar instancias particulares dentro de colecciones polimórficas y acceder a comportamientos exclusivos sin romper el diseño general.
