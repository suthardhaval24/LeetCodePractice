package com.designPatterns.builder;

public class Driver {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Lokesh", "Rahul").age(30).phone("123456").address("Fake address 1").build();
        User user2 = new User.UserBuilder("Pujara", "Chestesvar").age(40).phone("567").build();
        System.out.println(user1);
        System.out.println(user2);
    }
}
