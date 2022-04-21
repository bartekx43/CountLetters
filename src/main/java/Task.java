import java.util.*;

public class Task {

    public static void main (String[] args){
        Task instance = new Task(); //creating an instance of a class to get the class name
        String arg = instance.getClass().getSimpleName() + args[0];

        Map<Character, Integer> map = new TreeMap<>();
        arg.toLowerCase().chars().forEach(c -> map.put((char)c, map.get((char)c) != null ? map.get((char)c)+1 : 1));
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

