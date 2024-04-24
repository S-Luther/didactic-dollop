package com.example.project.Species;
import com.example.project.Cultures.Mordor;
import java.util.*;

public interface Orc 
{
    public String name = "";
    public int age = 0;
    public static List<Object> friends = null;
    
    int getAge();
    void setAge();
    
    String getName();
    void setName();

    List<Object> getFriends();
    void addFriend();

} 
