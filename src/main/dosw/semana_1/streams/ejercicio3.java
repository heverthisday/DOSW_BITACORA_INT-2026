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