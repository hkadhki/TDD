package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    protected Map<Character, HashMap<String, String>> phoneBook = new HashMap<>();
    protected Map<String,String> reversePhoneBook = new HashMap<>();

    public int add(String name, String number) {
        reversePhoneBook.put(number,name);
        if (phoneBook.containsKey(name.charAt(0))){
            phoneBook.get(name.charAt(0)).put(name,number);
        }else {
            phoneBook.put(name.charAt(0),new HashMap<>());
            phoneBook.get(name.charAt(0)).put(name,number);
        }
        int size = 0;
        for (Character key:phoneBook.keySet()){
            size = size + phoneBook.get(key).size();
        }
        return size;
    }

    public String findByNumber(String number){
        return reversePhoneBook.get(number);
    }


    public String findByName(String name){
        return phoneBook.get(name.charAt(0)).get(name);
    }

    public ArrayList<String> printAllNames(){
        List<Character> characters = phoneBook.keySet().stream().sorted().collect(Collectors.toList());
        ArrayList<String> result = new ArrayList<>();
        for (Character character : characters){
            List<String> list = phoneBook.get(character).keySet().stream().sorted().collect(Collectors.toList());
            for (String name: list){
                result.add( name+ " " + phoneBook.get(character).get(name));
            }
        }

        return result;
    }
}
