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
| Nombre y Apellido  | Hever Barrera Batero |
| Codigo de Estudiante | 1000094509 |
| Curso              | DOSW |

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

## Estrategia de Ramas (Git Flow)

| Rama                              | Proposito                                              |
|-----------------------------------|--------------------------------------------------------|
| `main`                            | Rama principal — solo funcionalidades consolidadas     |
| `develop`                         | Integracion de semanas completadas                     |
| `feature/semana-n-dosw`           | Rama de trabajo por semana                             |
| `feature/semana-n-dosw-ejercicio-n` | Rama individual por ejercicio                        |

---

## Reglas del Torneo

**Prohibido:** ciclos tradicionales (`for`, `while`, `do-while`), ordenamiento manual, recorrido imperativo de colecciones.  
**Obligatorio:** usar unicamente Streams y expresiones Lambda, documentar cada ejercicio, subir evidencias de ejecucion.

---

## Indice de Navegacion

### [SEMANA 1 — Manejo de Streams](#semana-no-1--dosw-manejo-de-streams)
- [Ejercicio 01 — Numeros Pares Mayores a Diez](#ejercicio-01--numeros-pares-mayores-a-diez)
- [Ejercicio 02 — Cantidad de Palabras con Mas de 4 Caracteres](#ejercicio-02--cantidad-de-palabras-con-mas-de-4-caracteres)
- [Ejercicio 03 — Obtener Nombres de los Usuarios](#ejercicio-03--obtener-nombres-de-los-usuarios)
- [Ejercicio 04 — Personas Mayores de Edad](#ejercicio-04--personas-mayores-de-edad)
- [Ejercicio 05 — Transacciones Bancarias](#ejercicio-05--transacciones-bancarias)

### [SEMANA 2 — Bitacora Pokemon](#semana-no-2--bitacora-pokemon)

**Nivel 1 — Entrenador Novato**
- [Ejercicio 01 — Pokemon Tipo Fuego](#ejercicio-01--pokemon-tipo-fuego)
- [Ejercicio 02 — Pokedex Gritona](#ejercicio-02--pokedex-gritona)
- [Ejercicio 03 — Poder Total del Equipo](#ejercicio-03--poder-total-del-equipo)
- [Ejercicio 04 — Pokemon Alfa](#ejercicio-04--pokemon-alfa)
- [Ejercicio 05 — Pokemon Legendarios](#ejercicio-05--pokemon-legendarios)

**Nivel 2 — Entrenador Intermedio**
- [Ejercicio 06 — Pokedex Sin Duplicados](#ejercicio-06--pokedex-sin-duplicados)
- [Ejercicio 07 — Orden del Profesor Oak](#ejercicio-07--orden-del-profesor-oak)
- [Ejercicio 08 — Evoluciones Preparadas](#ejercicio-08--evoluciones-preparadas)

**Nivel 3 — Lider de Gimnasio**
- [Ejercicio 09 — Equipo Elite](#ejercicio-09--equipo-elite)
- [Ejercicio 10 — Pokedex Compacta](#ejercicio-10--pokedex-compacta)
- [Ejercicio 11 — Poder Promedio](#ejercicio-11--poder-promedio)
- [Ejercicio 12 — Campeon Regional](#ejercicio-12--campeon-regional)
- [Ejercicio 13 — Organizar por Tipo](#ejercicio-13--organizar-por-tipo)
- [Ejercicio 14 — Organizar por Region](#ejercicio-14--organizar-por-region)

**Nivel 4 — Alto Mando**
- [Ejercicio 15 — Maestro de Gimnasios](#ejercicio-15--maestro-de-gimnasios)
- [Ejercicio 16 — Entrenadores Experimentados](#ejercicio-16--entrenadores-experimentados)
- [Ejercicio 17 — Equipo Mas Poderoso](#ejercicio-17--equipo-mas-poderoso)

**Nivel 5 — Campeon de la Liga**
- [Ejercicio 18 — Top 5 Pokemon Mas Fuertes](#ejercicio-18--top-5-pokemon-mas-fuertes)
- [Ejercicio 19 — Top 3 Entrenadores](#ejercicio-19--top-3-entrenadores)
- [Ejercicio 20 — Pokedex Analitica](#ejercicio-20--pokedex-analitica)

**Retos Especiales**
- [Reto Legendario — Method References](#reto-legendario--method-references)
- [Reto Mewtwo — Ejercicio Propuesto](#reto-mewtwo--ejercicio-propuesto)

---

---

# SEMANA No 1 — DOSW Manejo de Streams

**Paquete:** `src/main/dosw/semana_1/streams/`

---

### Ejercicio 01 — Numeros Pares Mayores a Diez

**Enunciado:** Dada una lista de numeros enteros, obtener una nueva lista solo con los numeros pares mayores a 10.

**Operaciones:** `filter()`

**Datos de entrada:** `[3, 8, 10, 12, 15, 18, 20]`  
**Salida esperada:** `[12, 18, 20]`

```java
package main.dosw.semana_1.streams;

import java.util.*;
import java.util.stream.*;

public class ejercicio1 {
    static void numero1() {
        List<Integer> numeros = List.of(3, 8, 10, 12, 15, 18, 20);
        List<Integer> mayoresPar = numeros.stream().filter(n -> n > 10 && n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(mayoresPar);
    }

    static void main() {
        numero1();
    }
}
```

**Captura de ejecucion:**

<img width="220" height="46" alt="image" src="https://github.com/user-attachments/assets/2c0dd1df-0119-4c9b-81b5-396630428fe9" />

**Explicacion:** Se aplica un `filter()` con doble condicion: que el numero sea mayor a 10 y que sea par (`n % 2 == 0`). Los elementos que cumplan ambas condiciones se recolectan en una nueva lista.

---

### Ejercicio 02 — Cantidad de Palabras con Mas de 4 Caracteres

**Enunciado:** Dada una lista de palabras, filtrar las que tengan mas de 4 caracteres, convertirlas a mayusculas, ordenarlas alfabeticamente y obtener la cantidad total resultante.

**Operaciones:** `filter()` · `map()` · `sorted()`

**Datos de entrada:** `["java", "stream", "api", "functional", "code", "git"]`  
**Salida esperada:** `Cantidad de palabras resultantes: 2`

```java
package main.dosw.semana_1.streams;

import java.util.*;
import java.util.stream.*;

public class ejercicio2 {
    static void numero2(){
        List<String> palabras = List.of("java","stream","api","funional","code","git");
        List<String> resultado = palabras.stream().filter(s -> s.length() == 4).map(String::toUpperCase)
                .sorted().collect(Collectors.toList());
  System.out.println(resultado);

    }
static void main() {
    numero2();
    }
}
```

**Captura de ejecucion:**

<img width="229" height="58" alt="image" src="https://github.com/user-attachments/assets/a15d1c52-585e-4491-a198-0e00c2cd675d" />

**Explicacion:** El stream filtra palabras segun longitud, luego las transforma a mayusculas con `map()` aplicando una referencia de metodo, las ordena con `sorted()` y recolecta el resultado en una lista.

---

### Ejercicio 03 — Obtener Nombres de los Usuarios

**Enunciado:** Dada una lista de usuarios con atributos `id`, `name`, `age`, `active`, filtrar los usuarios activos, obtener sus nombres en mayuscula y ordenarlos alfabeticamente.

**Operaciones:** `filter()` · `map()` · `sorted()`

**Datos de entrada:** `users = List<User>`  
**Salida esperada:** `sortedUsers = List<String>` (nombres en mayuscula, ordenados)

```java
package main.dosw.semana_1.streams;

import java.util.*;
import java.util.stream.*;

public class ejercicio3 {

    static class User {
        int id;
        String name;
        int age;
        boolean active;

        public User(int id, String name, int age, boolean active) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
        }

        public String getName() {
            return name;
        }

        public boolean isActive() {
            return active;
        }
    }

    public static List<User> users = List.of(
            new User(1, "juan", 15, true),
            new User(2, "ana", 22, false),
            new User(3, "carlos", 19, true),
            new User(4, "maria", 25, true)
    );

    public static void main(String[] args) {

        List<String> activos = users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(activos);
    }
}
```

**Captura de ejecucion:**

<img width="211" height="39" alt="image" src="https://github.com/user-attachments/assets/f485b8f5-d321-4c06-bead-12aae3d55db6" />

**Explicacion:** Se encadenan tres transformaciones sobre objetos `User`: primero se filtra por el atributo `active`, luego se extrae el nombre y se convierte a mayusculas con dos `map()` independientes, y finalmente se ordena alfabeticamente. Se usan referencias de metodo (`::`) en todos los pasos posibles.

---

### Ejercicio 04 — Personas Mayores de Edad

**Enunciado:** Dado el mismo listado de usuarios, filtrar las personas mayores de edad y obtener sus nombres.

**Operaciones:** `filter()` · `map()`

**Datos de entrada:** `users = List<User>`  
**Salida esperada:** Lista de nombres de usuarios con `age >= 18`

```java
package main.dosw.semana_1.streams;
import java.util.*;
import java.util.stream.*;
import main.dosw.semana_1.streams.ejercicio3;

import static main.dosw.semana_1.streams.ejercicio3.users;

public class ejercicio4 {

    static class user {
        List<ejercicio3.User> users = ejercicio3.users;
    }
    public static void main(String[] args) {
        List<String> users2 = users.stream().filter(user -> user.age >= 18).
                map(user -> user.name).collect(Collectors.toList());
        System.out.println(users2);
    }
}
```

**Captura de ejecucion:**

<img width="208" height="57" alt="image" src="https://github.com/user-attachments/assets/d66def30-8a3c-4669-85cf-537c23db81ae" />

**Explicacion:** Se reutiliza la lista de usuarios del ejercicio anterior mediante `import static`. El `filter()` evalua la edad directamente sobre el atributo `age` y el `map()` extrae el nombre de cada usuario que pase el umbral de 18 anos.

---

### Ejercicio 05 — Transacciones Bancarias

**Enunciado:** Dada una lista de transacciones bancarias (`id`, `amount`, `approved`), usar `peek` para registrar cada transaccion procesada y verificar si existe al menos una transaccion no aprobada.

**Operaciones:** `peek()` · `anyMatch()`

**Datos de entrada:** `List<Transaction>`  
**Salida esperada:** `true` o `false`

```java
package main.dosw.semana_1.streams;

import java.util.*;
import java.util.stream.*;

public class ejercicio5 {

    static class Trasaction {
        String id;
        double amount;
        boolean approved;

        public Trasaction(String id, double amount, boolean approved) {
            this.id = id;
            this.amount = amount;
            this.approved = approved;
        }
    }
    public boolean isAproved (Trasaction trasaction) {
        return trasaction.approved;
    }
    public static List<Trasaction> trasactions = List.of(
            new Trasaction("s12",2365.5, true),
            new Trasaction("s45",25468.5, true),
            new Trasaction("s78",54684.5, true),
            new Trasaction("s89",54654204.2 , true)

    );
    public static  void main (String[] args) {
        boolean existeNoAprobada = trasactions.stream()
                .peek(System.out::println)
                .anyMatch(t -> !t.approved);

        System.out.println(existeNoAprobada);
    }
}
```

**Captura de ejecucion:**

<img width="506" height="116" alt="image" src="https://github.com/user-attachments/assets/ca854b33-28e4-4601-a3dd-4b38b15f260e" />

**Explicacion:** `peek()` actua como un interceptor de depuracion que imprime cada transaccion sin interrumpir el flujo del stream. Luego `anyMatch()` evalua si al menos un elemento cumple la condicion de no estar aprobado, retornando un booleano como resultado terminal.

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

```java
package main.dosw.semana_2.pokemon;
import java.util.*;
import java.util.stream.*;

public class ejercicio1 {
    static class Pokemon{
        String name;
        String type;
        int level;
        boolean evolucion;

        public Pokemon(String name, String type, int level, boolean evolucion) {
            this.name=name;
            this.type=type;
            this.level=level;
            this.evolucion = evolucion;
        }
        public String getName(){return name;}
        public String getType(){return type;}
        public int getLevel(){return level;}
        public boolean getEvolucion(){return evolucion;}
    }

    public static List<Pokemon> pokemons = List.of(
            new Pokemon("Pikachu","Electrico",45,true),
            new Pokemon("Charmarder","Fuego",62,true),
            new Pokemon("Squirtle","Agua",38,true),
            new Pokemon("Vulpix","Fuego",81,true),
            new Pokemon("Bulbasaur","Planta",55,true),
            new Pokemon("Flareon","Fuego",29,true)
    );

    public static void main(String[] args){

        List<String> tipoFuego = pokemons.stream().filter(p ->p.getType().equals("Fuego")).map(Pokemon::getName).collect(Collectors.toList());

        System.out.println(tipoFuego);
    }

}
```

**Captura de ejecucion:**

<img width="289" height="50" alt="image" src="https://github.com/user-attachments/assets/42f448c0-6378-4f19-bd4a-babdb440a49f" />

**Explicacion:** El `filter()` compara el atributo `type` de cada Pokemon con la cadena `"Fuego"` usando `equals()`. Los que pasan el filtro se proyectan a su nombre con `map()` y se recolectan en una lista.

---

### Ejercicio 02 — Pokedex Gritona

**Enunciado:** Transformar todos los nombres de Pokemon a mayusculas.

**Operaciones:** `map()`

**Datos de entrada:** `Pikachu, Charmander, Squirtle, Bulbasaur`  
**Salida esperada:** `PIKACHU, CHARMANDER, SQUIRTLE, BULBASAUR`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio2 {

    public static void main(String[] args) {

        List<String> mayusculas = pokemons.stream()
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(mayusculas);
    }
}
```

**Captura de ejecucion:**

<img width="513" height="56" alt="image" src="https://github.com/user-attachments/assets/914d1b19-59c5-450e-9e24-39db966c0668" />

**Explicacion:** Un unico `map()` obtiene el nombre de cada Pokemon y encadena directamente `toUpperCase()` sobre el String resultante, transformando toda la lista en una sola operacion intermedia.

---

### Ejercicio 03 — Poder Total del Equipo

**Enunciado:** Dada una lista de niveles de Pokemon, calcular la suma total de niveles del equipo.

**Operaciones:** `reduce()`

**Datos de entrada:** `[45, 62, 38, 71, 55, 29]`  
**Salida esperada:** `Suma total de niveles: 300`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio3 {

    public static void main(String[] args) {

        int total = pokemons.stream()
                .mapToInt(ejercicio1.Pokemon::getLevel)
                .sum();

        System.out.println(total);
    }
}
```

**Captura de ejecucion:**

<img width="230" height="42" alt="image" src="https://github.com/user-attachments/assets/3e2be3ce-666b-43fa-b83a-8b8a572e76a6" />

**Explicacion:** Se usa `mapToInt()` para convertir el stream de objetos `Pokemon` a un `IntStream` primitivo, lo que permite llamar directamente al metodo terminal `sum()` sin necesidad de un `reduce()` explicito.

---

### Ejercicio 04 — Pokemon Alfa

**Enunciado:** Encontrar el Pokemon con el nivel mas alto dentro del equipo.

**Operaciones:** `max(Comparator)`

**Datos de entrada:** `Pikachu(45), Charmander(62), Squirtle(38), Snorlax(90), Mewtwo(88)`  
**Salida esperada:** `Pokemon Alfa: Snorlax (nivel 90)`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio4 {
    public static void main(String[] args) {
        Optional<String> pokemonAlfa = pokemons.stream().max(Comparator.comparing(ejercicio1.Pokemon::getLevel)).map(ejercicio1.Pokemon::getName);
        System.out.println ("el pokemon alfa es" + pokemonAlfa);
    }
}
```

**Captura de ejecucion:**

<img width="333" height="47" alt="image" src="https://github.com/user-attachments/assets/1c45d3b8-98fc-4ce0-9387-35e4ff82730b" />

**Explicacion:** `max()` recibe un `Comparator` construido con `Comparator.comparing()` sobre el nivel del Pokemon. Devuelve un `Optional` con el elemento mayor, al que se le aplica un segundo `map()` para extraer solo el nombre.

---

### Ejercicio 05 — Pokemon Legendarios

**Enunciado:** Contar cuantos Pokemon del equipo tienen nivel superior a 80.

**Operaciones:** `filter()` · `count()`

**Datos de entrada:** `Pikachu(45), Mewtwo(88), Dragonite(82), Squirtle(38), Mew(85), Charmander(62)`  
**Salida esperada:** `Pokemon con nivel > 80: 3 (Mewtwo, Dragonite, Mew)`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio5 {
    public static void main(String[] args) {

        long cantidad = pokemons.stream()
                .filter(p -> p.getLevel() > 80)
                .count();
        String pokemones = pokemons.stream().filter(p -> p.getLevel() > 80).collect(Collectors.toList()).get(0).getName();

        System.out.println("pokemones de  elite: " + cantidad + " son: " +  pokemones);
    }
}
```

**Captura de ejecucion:**

<img width="331" height="59" alt="image" src="https://github.com/user-attachments/assets/976c4496-0ab7-4e6e-ab02-a45aecfbbcf6" />

**Explicacion:** Se ejecutan dos streams independientes sobre la misma lista: el primero usa `count()` como operacion terminal para obtener la cantidad, y el segundo recolecta los nombres de los Pokemon elite para mostrarlos en consola.

---

## Nivel 2 — Entrenador Intermedio: Filtrado y Ordenamiento Avanzado

---

### Ejercicio 06 — Pokedex Sin Duplicados

**Enunciado:** Dada una lista con Pokemon repetidos, generar una coleccion donde cada Pokemon aparezca una sola vez.

**Operaciones:** `distinct()`

**Datos de entrada:** `Pikachu, Charmander, Pikachu, Squirtle, Charmander, Mewtwo`  
**Salida esperada:** `[Pikachu, Charmander, Squirtle, Mewtwo]`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio6 {
    public static void main(String[] args) {
        List<String> nombres = pokemons.stream()
                .map(ejercicio1.Pokemon::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}
```

**Captura de ejecucion:**

<img width="525" height="47" alt="image" src="https://github.com/user-attachments/assets/978f97fd-757d-40c1-977c-ba7db957ec08" />

**Explicacion:** Primero se proyectan los objetos `Pokemon` a sus nombres con `map()`, y luego `distinct()` elimina los duplicados basandose en `equals()` de String, garantizando que cada nombre aparezca una sola vez.

---

### Ejercicio 07 — Orden del Profesor Oak

**Enunciado:** Ordenar alfabeticamente los nombres de los Pokemon.

**Operaciones:** `sorted()`

**Datos de entrada:** `Squirtle, Pikachu, Mewtwo, Bulbasaur, Charmander, Abra`  
**Salida esperada:** `[Abra, Bulbasaur, Charmander, Mewtwo, Pikachu, Squirtle]`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio7 {

    public static void main(String[] args) {
        List <String> orden = pokemons.stream().map(p -> p.getName()).sorted().collect(Collectors.toList());
        System.out.println(orden);
    }

}
```

**Captura de ejecucion:**

<img width="501" height="37" alt="image" src="https://github.com/user-attachments/assets/b9e002cb-81bc-43f1-9338-9613ee7cb6a7" />

**Explicacion:** Tras extraer los nombres con `map()`, `sorted()` sin argumentos aplica el orden natural de `String` (alfabetico), lo que genera la lista en orden lexicografico ascendente.

---

### Ejercicio 08 — Evoluciones Preparadas

**Enunciado:** Dada una lista de Pokemon con el atributo `boolean puedeEvolucionar`, obtener unicamente los que esten listos para evolucionar.

**Operaciones:** `filter()`

**Datos de entrada:** `Pikachu(true), Raichu(false), Charmander(true), Charizard(false), Squirtle(true), Blastoise(false)`  
**Salida esperada:** `Listos para evolucionar: [Pikachu, Charmander, Squirtle]`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.ejercicio1.pokemons;

public class ejercicio8 {

    public static void main(String[] args) {
        List<String> evoluciones = pokemons.stream().filter(p -> p.getEvolucion() == true).map(p -> p.getName())
                .collect(Collectors.toList());

        System.out.println(evoluciones);
    }
}
```

**Captura de ejecucion:**

<img width="499" height="48" alt="image" src="https://github.com/user-attachments/assets/5eff973d-7ee1-4cf0-b538-94f97c6eb04e" />

**Explicacion:** El `filter()` evalua el atributo booleano `evolucion` de cada Pokemon. Solo los que tengan ese flag en `true` pasan al `map()` donde se extrae su nombre para conformar la lista final.

---

## Nivel 3 — Lider de Gimnasio: Manipulacion de Objetos Complejos

> A partir de este nivel se utiliza la clase `Pokemon` con los atributos: `id`, `nombre`, `tipo`, `nivel`, `poderCombate`, `region`, `legendario`.

---

### Ejercicio 09 — Equipo Elite

**Enunciado:** Mostrar unicamente los Pokemon cuyo `poderCombate` sea superior a 500.

**Operaciones:** `filter()`

**Datos de entrada:** `Pikachu(PC:320), Mewtwo(PC:680), Dragonite(PC:530), Squirtle(PC:210), Gengar(PC:495), Charizard(PC:610)`  
**Salida esperada:** `Equipo Elite (PC > 500): [Mewtwo(680), Charizard(610), Dragonite(530)]`

```java
package main.dosw.semana_2.pokemon;
import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio9 {
    public static void main(String[] args) {
        List <String> poderes = pokemons.stream().filter(p ->p.getPower() > 500 ).
                map(p ->p.getName()).collect(Collectors.toList());
        System.out.println("Pokemones con poder mas de 500: " + poderes);
    }
}
```

**Captura de ejecucion:**

<img width="377" height="54" alt="image" src="https://github.com/user-attachments/assets/b4e2e358-0818-4ace-a0f4-9e2bb3fd140b" />

**Explicacion:** Se filtra por el atributo `power` usando `getPower() > 500` y se proyectan los nombres con `map()`. Este ejercicio introduce la clase `pokemon` del nivel 3 que incluye el atributo `poderCombate`.

---

### Ejercicio 10 — Pokedex Compacta

**Enunciado:** Generar una lista que contenga unicamente los nombres de todos los Pokemon del equipo.

**Operaciones:** `map()` · `collect()`

**Datos de entrada:** Lista de objetos `Pokemon` completos  
**Salida esperada:** `["Pikachu", "Mewtwo", "Dragonite", "Squirtle", "Gengar", "Charizard"]`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio10 {
    public static void main(String[] args) {
        List <String> pokemones = pokemons.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(pokemones);
    }

}
```

**Captura de ejecucion:**

<img width="802" height="56" alt="image" src="https://github.com/user-attachments/assets/4c929be1-2c23-4bb2-a65b-130e51fe245b" />

**Explicacion:** Operacion de proyeccion pura: `map()` transforma cada objeto `Pokemon` en su nombre (String), y `collect()` agrupa todos los nombres en una `List<String>`.

---

### Ejercicio 11 — Poder Promedio

**Enunciado:** Calcular el promedio de `poderCombate` de todos los Pokemon del equipo.

**Operaciones:** `mapToDouble()` · `average()`

**Datos de entrada:** `PC: [320, 680, 530, 210, 495, 610]`  
**Salida esperada:** `Poder de combate promedio: 474.17`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;

import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio11 {
    static void main() {
        OptionalDouble promedio_poder = pokemons.stream().mapToDouble(pokemon::getPower).average();
        System.out.println("promedio_poder : " + promedio_poder);
    }
}
```

**Captura de ejecucion:**

<img width="358" height="52" alt="image" src="https://github.com/user-attachments/assets/4022ce2d-3f39-43f9-ad77-857669693904" />

**Explicacion:** `mapToDouble()` convierte el stream a un `DoubleStream` primitivo sobre el cual se puede llamar directamente `average()`, que retorna un `OptionalDouble` con el valor promedio calculado.

---

### Ejercicio 12 — Campeon Regional

**Enunciado:** Obtener el Pokemon con mayor `poderCombate` de toda la lista.

**Operaciones:** `max(Comparator)`

**Datos de entrada:** `Pikachu(320), Mewtwo(680), Dragonite(530), Charizard(610)`  
**Salida esperada:** `Campeon: Mewtwo con PC: 680`

```java
package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio12 {

    public static void main(String[] args) {
    Optional<String> pokemon_poderoso = pokemons.stream().max(Comparator.comparing(pokemon::getName)).
            map(pokemon -> pokemon.getName() + ":" + pokemon.getPower());
    System.out.println(pokemon_poderoso);
    }
}
```

**Captura de ejecucion:**

<img width="207" height="56" alt="image" src="https://github.com/user-attachments/assets/83972ef5-bfe3-4dcc-83c4-d5ea636e3272" />

**Explicacion:** Se usa `max()` con un comparador basado en `getName()` y sobre el `Optional` resultante se aplica `map()` para construir una cadena con el nombre y el poder del campeon.

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

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

import java.util.*;
import java.util.stream.*;

public class ejercicio13 {
    public static void main(String[] args) {

        Map<String, List<pokemon>> agrupados = pokemon.pokemons.stream()
                .collect(Collectors.groupingBy(pokemon::getType));

        agrupados.forEach((tipo, lista) -> {
            List<String> nombres = lista.stream()
                    .map(pokemon::getName)
                    .collect(Collectors.toList());

            System.out.println(tipo + ": " + nombres);
        });
    }
}
```

**Captura de ejecucion:**

<img width="263" height="200" alt="image" src="https://github.com/user-attachments/assets/3691fcc3-a362-4caf-8f85-1d4ed2b13a66" />

**Explicacion:** `Collectors.groupingBy()` agrupa los objetos `Pokemon` en un `Map` donde la clave es el tipo. Luego se recorre el mapa con `forEach()` y para cada grupo se extrae la lista de nombres con un stream anidado.

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

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio14 {
    public static void main(String[] args) {

        Map<String, List<pokemon>> agrupados = pokemon.pokemons.stream()
                .collect(Collectors.groupingBy(pokemon::getRegion));

        agrupados.forEach((region, lista) -> {
            List<String> nombres = lista.stream()
                    .map(pokemon::getName)
                    .collect(Collectors.toList());

            System.out.println(region + ": " + nombres);
        });
    }
}
```

**Captura de ejecucion:**

<img width="641" height="122" alt="image" src="https://github.com/user-attachments/assets/635fc72a-8627-4b65-9014-1c943a142c0d" />

**Explicacion:** Misma logica que el ejercicio 13 pero usando `getRegion()` como criterio de agrupacion. Cada entrada del mapa representa una region con su lista de Pokemon asociados.

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

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio15 {

    public static void main(String[] args) {

        Optional<String> mejores;
        mejores = entrenadores.stream().max(Comparator.comparing(Entrenador::getNombre)).
                map(entrenadores -> entrenadores.getNombre() + ":" + entrenadores.getMedallas());
        System.out.println(mejores);
    }
}
```

**Captura de ejecucion:**

<img width="261" height="81" alt="image" src="https://github.com/user-attachments/assets/e7f19ce9-5b1f-4c19-90e3-1660d29bed83" />

**Explicacion:** Se aplica `max()` sobre la lista de entrenadores usando un comparador por nombre. El `Optional` resultante se transforma con `map()` para construir la cadena de salida que muestra el nombre y las medallas del campeon.

---

### Ejercicio 16 — Entrenadores Experimentados

**Enunciado:** Mostrar unicamente los entrenadores que posean mas de 5 medallas.

**Operaciones:** `filter()`

**Datos de entrada:** `Ash(8), Misty(5), Brock(6), Gary(10), May(3), Dawn(7)`  
**Salida esperada:** `Entrenadores con > 5 medallas: [Ash(8), Brock(6), Gary(10), Dawn(7)]`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio16 {
    public static void main(String[] args) {
        List <String> mejores = entrenadores.stream().filter(e-> e.getMedallas() > 5).

                map(e-> e.getNombre()).collect(Collectors.toList());

        System.out.println(mejores);

    }
}
```

**Captura de ejecucion:**

<img width="216" height="59" alt="image" src="https://github.com/user-attachments/assets/693e68b9-5169-4603-88a7-257cbaf73dc3" />

**Explicacion:** `filter()` evalua el numero de medallas de cada entrenador y descarta los que tengan 5 o menos. Los que pasan el umbral se proyectan a su nombre con `map()` y se recolectan en la lista final.

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

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio17 {
    public static void main(String[] args) {

        Optional<Entrenador> mejor = entrenadores.stream()
                .max(Comparator.comparingDouble(e ->
                        e.getEquipo()
                                .stream()
                                .mapToDouble(pokemon::getPower)
                                .sum()
                ));

        String resultado = mejor
                .map(e -> {
                    double total = e.getEquipo()
                            .stream()
                            .mapToDouble(pokemon::getPower)
                            .sum();
                    return "Entrenador más poderoso: " + e.getNombre()
                            + "\nPoder acumulado del equipo: " + total;
                })
                .orElse("No hay entrenadores");

        System.out.println(resultado);
    }
}
```

**Captura de ejecucion:**

<img width="320" height="82" alt="image" src="https://github.com/user-attachments/assets/67e984da-ef2d-4fac-81a6-15a3b25527d0" />

**Explicacion:** El comparador de `max()` calcula en tiempo real la suma del poder de cada equipo mediante un stream anidado sobre `getEquipo()`. Una vez encontrado el mejor entrenador, se recalcula el total en el `map()` del `Optional` para construir el mensaje de salida.

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

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.pokemon.*;

public class ejercicio18 {

    public static void main(String[] args) {

        int[] index = {1};

        List<String> pokemones_fuertes = pokemons.stream()
                .sorted(Comparator.comparingDouble(pokemon::getPower).reversed())
                .limit(5)
                .map(p -> "#" + index[0]++ + " " + p.getName()
                        + "    - PC: " + (int) p.getPower())
                .collect(Collectors.toList());

        pokemones_fuertes.forEach(System.out::println);
    }
}
```

**Captura de ejecucion:**

<img width="281" height="150" alt="image" src="https://github.com/user-attachments/assets/72124da4-6a23-4d23-8494-b321033eac5a" />

**Explicacion:** `sorted()` con comparador invertido (`reversed()`) ordena de mayor a menor poder. `limit(5)` corta el stream tras los cinco primeros. El `map()` construye cada linea del ranking usando un array de una posicion como contador mutable, ya que las lambdas no pueden capturar variables locales que cambien.

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

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;
import static main.dosw.semana_2.pokemon.Entrenador.*;

public class ejercicio19 {

    public static void main(String[] args) {

        int[] index = {1};

        List<String> ranking = entrenadores.stream()
                .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed()
                        .thenComparingDouble(e -> e.getEquipo()
                                .stream()
                                .mapToDouble(pokemon::getPower)
                                .sum()
                        ).reversed()
                        .thenComparing(Entrenador::getNombre)
                )
                .limit(3)
                .map(e -> {
                    double total = e.getEquipo()
                            .stream()
                            .mapToDouble(pokemon::getPower)
                            .sum();
                    return "#" + index[0]++ + " " + e.getNombre()
                            + "  - " + e.getMedallas() + " medallas, PC: " + (int) total;
                })
                .collect(Collectors.toList());

        ranking.forEach(System.out::println);
    }
}
```

**Captura de ejecucion:**

<img width="310" height="97" alt="image" src="https://github.com/user-attachments/assets/98af19ee-60b5-4cdc-bc40-d7f446fa8cbd" />

**Explicacion:** Se construye un comparador encadenado con tres criterios usando `thenComparingDouble()` y `thenComparing()`. El segundo `reversed()` invierte tanto el criterio de medallas como el de poder acumulado juntos. `limit(3)` recorta el podio y el `map()` formatea cada posicion con el contador mutable en array.

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

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;

public class ejercicio20 {

    public static void main(String[] args) {

        Map<String, Long> porTipo =
                pokemon.pokemons.stream()
                        .collect(Collectors.groupingBy(
                                pokemon::getType,
                                Collectors.counting()
                        ));

        Map<String, Long> porRegion =
                pokemon.pokemons.stream()
                        .collect(Collectors.groupingBy(
                                pokemon::getRegion,
                                Collectors.counting()
                        ));

        long legendarios =
                pokemon.pokemons.stream()
                        .filter(p -> p.isLegendario())
                        .count();

        double promedioNivel =
                pokemon.pokemons.stream()
                        .collect(Collectors.averagingInt(pokemon::getLevel));

        Optional<pokemon> masFuerte =
                pokemon.pokemons.stream()
                        .max(Comparator.comparingDouble(pokemon::getPower));

        System.out.println("Por tipo: " + porTipo);
        System.out.println("Por región: " + porRegion);
        System.out.println("Legendarios: " + legendarios);
        System.out.println("Promedio nivel: " + promedioNivel);

        masFuerte.ifPresent(p ->
                System.out.println("Más fuerte: " + p.getName() + " (PC: " + p.getPower() + ")")
        );
    }
}
```

**Captura de ejecucion:**

<img width="783" height="141" alt="image" src="https://github.com/user-attachments/assets/21417203-ca35-4280-99f0-4011e4d5d268" />

**Explicacion:** Se ejecutan cinco streams independientes sobre la misma lista, cada uno con una responsabilidad analitica distinta: agrupacion con conteo (`groupingBy` + `counting`), conteo simple con `filter` + `count`, promedio con `averagingInt`, y busqueda del maximo con `comparingDouble`. Cada resultado se guarda en su propia variable antes de imprimirse.

---

---

## Reto Legendario — Method References

**Ejercicios resueltos con Method Reference:**

| Ejercicio | Ejemplo de uso |
|-----------|----------------|
| Ej. XX    | `.map(Pokemon::getNombre)` |
| Ej. XX    | `...` |

---

## Reto Mewtwo — Ejercicio Propuesto

**Enunciado:** Calcular el poder total acumulado por region (excluyendo legendarios) e identificar cual region tiene el equipo no legendario mas poderoso.

**Operaciones usadas:** `filter()` · `groupingBy()` · `summingDouble()` · `max()`

```java
package main.dosw.semana_2.pokemon;

import java.util.*;
import java.util.stream.*;

public class retoMewtwo {

    public static void main(String[] args) {

        Map<String, Double> poderPorRegion =
                pokemon.pokemons.stream()
                        .filter(p -> !p.isLegendario())
                        .collect(Collectors.groupingBy(
                                pokemon::getRegion,
                                Collectors.summingDouble(pokemon::getPower)
                        ));

        System.out.println("Poder total por región (sin legendarios):");
        System.out.println(poderPorRegion);

        Optional<Map.Entry<String, Double>> regionMasFuerte =
                poderPorRegion.entrySet().stream()
                        .max(Map.Entry.comparingByValue());

        regionMasFuerte.ifPresent(e ->
                System.out.println("Región más poderosa: " + e.getKey()
                        + " con poder: " + e.getValue())
        );
    }
}
```

**Captura de ejecucion:**

<img width="375" height="106" alt="image" src="https://github.com/user-attachments/assets/cef3d4b2-2b25-436f-891d-42a48f4729a0" />

**Explicacion:** Primero se excluyen los legendarios con `filter()` y se agrupa el poder restante por region usando `groupingBy()` con el colector `summingDouble()`. Esto produce un `Map<String, Double>`. Luego se crea un segundo stream sobre las entradas del mapa para encontrar la region con mayor poder acumulado usando `Map.Entry.comparingByValue()`.

---

---

# SEMANA No 3 — [Proximamente]

**Paquete:** `src/main/dosw/semana_3/`

> Esta seccion se completara al inicio de la semana 3.

---

# SEMANA No 4 — [Proximamente]

**Paquete:** `src/main/dosw/semana_4/`

> Esta seccion se completara al inicio de la semana 4.

---

*DOSW Company — Escuela Colombiana de Ingenieria Julio Garavito*
