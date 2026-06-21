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
