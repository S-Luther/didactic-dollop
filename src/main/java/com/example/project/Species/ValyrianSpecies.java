package com.example.project.Species;

import java.util.List;

public class ValyrianSpecies {
    private String name;
    private int age;
    private List<String> Friends;

    public ValyrianSpecies(String name, int age, List<String> Friends){
        this.name = name;
        this.age = age;
        this.Friends = Friends;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public List<String> getFriends(){
        return Friends;
    }

    public void addFriend(String friend){
        Friends.add(friend);
    }

    public void removeFriend(String friend){
        Friends.remove(friend);
    }
}
