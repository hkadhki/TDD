package org.example;

import java.util.HashMap;
import java.util.Map;

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
}
