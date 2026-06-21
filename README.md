# DOSW_BITACORA_INT-2026
# DOSW BITACORA — Programacion Funcional con Java Streams

**Asignatura:** DOSW  
**Institucion:** Escuela Colombiana de Ingenieria Julio Garavito  
**Tecnologia:** Java 21/24 + Git  
**Entrega:** Individual

---

## Datos del Entrenador

| Campo              | Informacion        |
|--------------------|--------------------|
| Nombre y Apellido  | hever barrera batero                   |
| Codigo de Estudiante |  1000094509               |
| Curso              |      dosw              |

---

## Estructura del Repositorio

```
DOSW_BITACORA/
|
|-- README.md
|
`-- src/
    `-- main/
        `-- dosw/
            |-- semana_1/
            |   `-- streams/
            |       |-- Ejercicio1.java
            |       |-- Ejercicio2.java
            |       `-- ...
            |
            `-- semana_2/
                `-- pokemon/
                    |-- Ejercicio1.java
                    |-- Ejercicio2.java
                    `-- ...hasta Ejercicio20.java
```

---

## Retos Especiales

- [ ] Reto Legendario — Method References (+0.5 pts)
- [ ] Reto Mewtwo — Ejercicio propuesto (+1.0 pt)

> **Reto Legendario:** :
> - Ejercicio N: `21`

---

## Estrategia de Ramas (Git Flow)

| Rama                              | Proposito                                              |
|-----------------------------------|--------------------------------------------------------|
| `main`                            | Rama principal — solo funcionalidades consolidadas     |
| `develop`                         | Integracion de semanas completadas                     |
| `feature/semana-n-dosw`           | Rama de trabajo por semana                             |
| `feature/semana-n-dosw-ejercicio-n` | Rama individual por ejercicio                        |

**Flujo por ejercicio:**
1. Crear rama `feature/semana-n-dosw-ejercicio-n` desde la rama de la semana.
2. Resolver el ejercicio y documentar la evidencia.
3. Fusionar hacia `feature/semana-n-dosw` y eliminar la rama del ejercicio.
4. Al completar la semana, abrir Pull Request de `feature/semana-n-dosw` hacia `develop`.
5. Al cierre del ciclo definido por el profesor, sincronizar `develop` hacia `main`.

---

## Reglas del Torneo

**Prohibido:**
- Usar ciclos tradicionales (`for`, `while`, `do-while`) para resolver los ejercicios.
- Ordenar listas manualmente.
- Recorrer colecciones de forma imperativa.

**Obligatorio:**
- Usar unicamente Streams y expresiones Lambda.
- Documentar cada ejercicio en este README.
- Subir evidencias de ejecucion (capturas de pantalla) por cada reto.

---

---

# SEMANA No 1 — DOSW Manejo de Streams

**Paquete:** `src/main/dosw/semana_1/streams/`

Ejercicios trabajados en clase y dejados de tarea. Un archivo `.java` por ejercicio.

---

### Ejercicio 01 — Numeros Pares Mayores a Diez

**Enunciado:** Dada una lista de numeros enteros, obtener una nueva lista solo con los numeros pares mayores a 10.

**Operaciones:** `filter()`

**Datos de entrada:** `[3, 8, 10, 12, 15, 18, 20]`  
**Salida esperada:** `[12, 18, 20]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 02 — Cantidad de Palabras con Mas de 4 Caracteres

**Enunciado:** Dada una lista de palabras, filtrar las que tengan mas de 4 caracteres, convertirlas a mayusculas, ordenarlas alfabeticamente y obtener la cantidad total resultante.

**Operaciones:** `filter()` · `map()` · `sorted()`

**Datos de entrada:** `["java", "stream", "api", "functional", "code", "git"]`  
**Salida esperada:** `Cantidad de palabras resultantes: 2`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 03 — Obtener Nombres de los Usuarios

**Enunciado:** Dada una lista de usuarios con atributos `id`, `name`, `age`, `active`, filtrar los usuarios activos, obtener sus nombres en mayuscula y ordenarlos alfabeticamente.

**Operaciones:** `filter()` · `map()` · `sorted()`

**Datos de entrada:** `users = List<User>` (crear los usuarios necesarios)  
**Salida esperada:** `sortedUsers = List<String>` (nombres en mayuscula, ordenados)

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 04 — Personas Mayores de Edad

**Enunciado:** Dado el mismo listado de usuarios, filtrar las personas mayores de edad y obtener sus nombres.

**Operaciones:** `filter()` · `map()`

**Datos de entrada:** `users = List<User>`  
**Salida esperada:** Lista de nombres de usuarios con `age >= 18`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 05 — Transacciones Bancarias

**Enunciado:** Dada una lista de transacciones bancarias (`id`, `amount`, `approved`), usar `peek` para registrar cada transaccion procesada y verificar si existe al menos una transaccion no aprobada. Retornar `true` si el lote es valido, `false` en caso contrario.

**Operaciones:** `peek()` · `anyMatch()`

**Datos de entrada:** `List<Transaction>`  
**Salida esperada:** `true` o `false`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

---

# SEMANA No 2 — Bitacora Pokemon

**Paquete:** `src/main/dosw/semana_2/pokemon/`

---

## Nivel 1 — Entrenador Novato: Operaciones Basicas con Streams

---

### Ejercicio 01 — Pokemon Tipo Fuego

**Enunciado:** Dada una lista de Pokemon con nombre y tipo, obtener unicamente los de tipo Fuego.

**Operaciones:** `filter()`

**Datos de entrada:** `Pikachu(Electrico), Charmander(Fuego), Squirtle(Agua), Vulpix(Fuego), Bulbasaur(Planta), Flareon(Fuego)`  
**Salida esperada:** `[Charmander, Vulpix, Flareon]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 02 — Pokedex Gritona

**Enunciado:** Transformar todos los nombres de Pokemon a mayusculas.

**Operaciones:** `map()`

**Datos de entrada:** `Pikachu, Charmander, Squirtle, Bulbasaur`  
**Salida esperada:** `PIKACHU, CHARMANDER, SQUIRTLE, BULBASAUR`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 03 — Poder Total del Equipo

**Enunciado:** Dada una lista de niveles de Pokemon, calcular la suma total de niveles del equipo.

**Operaciones:** `reduce()`

**Datos de entrada:** `[45, 62, 38, 71, 55, 29]`  
**Salida esperada:** `Suma total de niveles: 300`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 04 — Pokemon Alfa

**Enunciado:** Encontrar el Pokemon con el nivel mas alto dentro del equipo.

**Operaciones:** `max(Comparator)`

**Datos de entrada:** `Pikachu(45), Charmander(62), Squirtle(38), Snorlax(90), Mewtwo(88)`  
**Salida esperada:** `Pokemon Alfa: Snorlax (nivel 90)`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 05 — Pokemon Legendarios

**Enunciado:** Contar cuantos Pokemon del equipo tienen nivel superior a 80.

**Operaciones:** `filter()` · `count()`

**Datos de entrada:** `Pikachu(45), Mewtwo(88), Dragonite(82), Squirtle(38), Mew(85), Charmander(62)`  
**Salida esperada:** `Pokemon con nivel > 80: 3 (Mewtwo, Dragonite, Mew)`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

## Nivel 2 — Entrenador Intermedio: Filtrado y Ordenamiento Avanzado

---

### Ejercicio 06 — Pokedex Sin Duplicados

**Enunciado:** Dada una lista con Pokemon repetidos, generar una coleccion donde cada Pokemon aparezca una sola vez.

**Operaciones:** `distinct()`

**Datos de entrada:** `Pikachu, Charmander, Pikachu, Squirtle, Charmander, Mewtwo`  
**Salida esperada:** `[Pikachu, Charmander, Squirtle, Mewtwo]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 07 — Orden del Profesor Oak

**Enunciado:** Ordenar alfabeticamente los nombres de los Pokemon.

**Operaciones:** `sorted()`

**Datos de entrada:** `Squirtle, Pikachu, Mewtwo, Bulbasaur, Charmander, Abra`  
**Salida esperada:** `[Abra, Bulbasaur, Charmander, Mewtwo, Pikachu, Squirtle]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 08 — Evoluciones Preparadas

**Enunciado:** Dada una lista de Pokemon con el atributo `boolean puedeEvolucionar`, obtener unicamente los que esten listos para evolucionar.

**Operaciones:** `filter()`

**Datos de entrada:** `Pikachu(true), Raichu(false), Charmander(true), Charizard(false), Squirtle(true), Blastoise(false)`  
**Salida esperada:** `Listos para evolucionar: [Pikachu, Charmander, Squirtle]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

## Nivel 3 — Lider de Gimnasio: Manipulacion de Objetos Complejos

> A partir de este nivel se utiliza la clase `Pokemon` con los atributos: `id`, `nombre`, `tipo`, `nivel`, `poderCombate`, `region`, `legendario`.

---

### Ejercicio 09 — Equipo Elite

**Enunciado:** Mostrar unicamente los Pokemon cuyo `poderCombate` sea superior a 500.

**Operaciones:** `filter()`

**Datos de entrada:** `Pikachu(PC:320), Mewtwo(PC:680), Dragonite(PC:530), Squirtle(PC:210), Gengar(PC:495), Charizard(PC:610)`  
**Salida esperada:** `Equipo Elite (PC > 500): [Mewtwo(680), Charizard(610), Dragonite(530)]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 10 — Pokedex Compacta

**Enunciado:** Generar una lista que contenga unicamente los nombres de todos los Pokemon del equipo.

**Operaciones:** `map()` · `collect()`

**Datos de entrada:** Lista de objetos `Pokemon` completos  
**Salida esperada:** `["Pikachu", "Mewtwo", "Dragonite", "Squirtle", "Gengar", "Charizard"]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 11 — Poder Promedio

**Enunciado:** Calcular el promedio de `poderCombate` de todos los Pokemon del equipo.

**Operaciones:** `mapToDouble()` · `average()`

**Datos de entrada:** `PC: [320, 680, 530, 210, 495, 610]`  
**Salida esperada:** `Poder de combate promedio: 474.17`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 12 — Campeon Regional

**Enunciado:** Obtener el Pokemon con mayor `poderCombate` de toda la lista.

**Operaciones:** `max(Comparator)`

**Datos de entrada:** `Pikachu(320), Mewtwo(680), Dragonite(530), Charizard(610)`  
**Salida esperada:** `Campeon: Mewtwo con PC: 680`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 13 — Organizar por Tipo

**Enunciado:** Agrupar todos los Pokemon por su tipo y mostrar el listado por grupo.

**Operaciones:** `groupingBy()`

**Datos de entrada:** `Squirtle(Agua), Psyduck(Agua), Charmander(Fuego), Vulpix(Fuego), Bulbasaur(Planta)`  
**Salida esperada:**
```
Agua:   [Squirtle, Psyduck]
Fuego:  [Charmander, Vulpix]
Planta: [Bulbasaur]
```

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 14 — Organizar por Region

**Enunciado:** Agrupar los Pokemon segun su region de origen.

**Operaciones:** `groupingBy()`

**Datos de entrada:** `Pikachu(Kanto), Chikorita(Johto), Torchic(Hoenn), Piplup(Sinnoh), Charmander(Kanto), Totodile(Johto)`  
**Salida esperada:**
```
Kanto:  [Pikachu, Charmander]
Johto:  [Chikorita, Totodile]
Hoenn:  [Torchic]
Sinnoh: [Piplup]
```

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

## Nivel 4 — Alto Mando: Objetos Anidados y Comparaciones

> A partir de este nivel se utiliza adicionalmente la clase `Entrenador` con los atributos: `id`, `nombre`, `medallas`, `equipo (List<Pokemon>)`.

---

### Ejercicio 15 — Maestro de Gimnasios

**Enunciado:** Dado un listado de entrenadores con sus medallas, encontrar el que tiene mas medallas.

**Operaciones:** `max(Comparator)`

**Datos de entrada:** `Ash(8), Misty(5), Brock(6), Gary(10)`  
**Salida esperada:**
```
Campeon de gimnasios: Gary
Medallas obtenidas: 10
```

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 16 — Entrenadores Experimentados

**Enunciado:** Mostrar unicamente los entrenadores que posean mas de 5 medallas.

**Operaciones:** `filter()`

**Datos de entrada:** `Ash(8), Misty(5), Brock(6), Gary(10), May(3), Dawn(7)`  
**Salida esperada:** `Entrenadores con > 5 medallas: [Ash(8), Brock(6), Gary(10), Dawn(7)]`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 17 — Equipo Mas Poderoso

**Enunciado:** Calcular cual entrenador tiene la suma total de `poderCombate` mas alta entre todos sus Pokemon.

**Operaciones:** `mapToDouble()` · `sum()`

**Datos de entrada:**
```
Ash:   PC total 1850
Gary:  PC total 2340
Brock: PC total 1670
```
**Salida esperada:**
```
Entrenador mas poderoso: Gary
Poder acumulado del equipo: 2340
```

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

## Nivel 5 — Campeon de la Liga Pokemon DOSW: Analisis Avanzado y Rankings

---

### Ejercicio 18 — Top 5 Pokemon Mas Fuertes

**Enunciado:** Generar un ranking de los cinco Pokemon con mayor `poderCombate` de toda la Pokedex.

**Operaciones:** `sorted()` · `limit(5)`

**Datos de entrada:** Lista completa de Pokemon con PC  
**Salida esperada:**
```
#1 Mewtwo    - PC: 680
#2 Charizard - PC: 610
#3 Dragonite - PC: 530
#4 Gengar    - PC: 495
#5 Pikachu   - PC: 320
```

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 19 — Top 3 Entrenadores

**Enunciado:** Generar un ranking de los 3 mejores entrenadores considerando: primero mas medallas, segundo mayor poder acumulado, tercero orden alfabetico como criterio de desempate.

**Operaciones:** `sorted()` · `limit(3)`

**Datos de entrada:** `Gary(10 medallas, PC:2340), Ash(8 medallas, PC:1850), Dawn(7 medallas, PC:2100), Brock(6 medallas, PC:1670)`  
**Salida esperada:**
```
#1 Gary - 10 medallas, PC: 2340
#2 Ash  -  8 medallas, PC: 1850
#3 Dawn -  7 medallas, PC: 2100
```

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

### Ejercicio 20 — Pokedex Analitica

**Enunciado:** Construir una estructura que muestre: cantidad de Pokemon por tipo, por region, cantidad de legendarios, promedio de nivel y el Pokemon mas fuerte. Todo utilizando unicamente Streams.

**Operaciones:** `groupingBy()` · `counting()`

**Datos de entrada:** Lista completa de Pokemon con todos sus atributos  
**Salida esperada:**
```
Por tipo:     {Fuego:4, Agua:3, ...}
Por region:   {Kanto:5, Johto:3, ...}
Legendarios:  2
Promedio niv: 58.4
Mas fuerte:   Mewtwo (PC: 680)
```

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion breve de la solucion implementada.

---

---

## Reto Legendario — Method References

**Ejercicios resueltos con Method Reference:**

| Ejercicio | Ejemplo de uso |
|-----------|----------------|
| Ej. XX    | `.map(Pokemon::getNombre)` |
| Ej. XX    | `...` |

---

## Reto Shiny — Buenas Practicas de Commits

**Historial de commits relevantes:**

| Commit | Mensaje |
|--------|---------|
| `abc1234` | `feat: reto pokemon tipo fuego` |
| `def5678` | `feat: agrupacion por region` |
| `...`    | `...` |

---

## Reto Mewtwo — Ejercicio Propuesto

**Enunciado (propuesto por el estudiante):**

> Describir aqui el ejercicio propuesto.

**Operaciones usadas:** `filter()` · `map()` · `sorted()` · `groupingBy()` · `reduce()`

**Codigo implementado:**

```java
// Pegar el codigo aqui
```

**Captura de ejecucion:**

<!-- Insertar imagen aqui -->

**Explicacion:**

> Descripcion detallada de la solucion, justificando el uso de cada operacion.

---

*DOSW Company — Escuela Colombiana de Ingenieria Julio Garavito*
