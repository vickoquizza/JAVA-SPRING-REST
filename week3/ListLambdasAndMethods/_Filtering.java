package ListLambdasAndMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Filtering {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Mariano", "Jack", "Mark", "Laura");

        //Ahora queremos hacer un filtrado y encontrar a los amigos que inicien con M, de la manera imperativa se
        //haria de esta forma

        List<String> friendsWithM = new ArrayList<>();
        for(String friend: friends){
            if(friend.startsWith("M")){
                friendsWithM.add(friend);
            }
        }

        //Ahora con streams se puede hacer de una mejor manera y más limpia mediante el metodo filter
        List<String> nicerFriendsWithM = friends.stream()
                .filter(friend -> friend.startsWith("M"))
                .collect(Collectors.toList());
        System.out.println(nicerFriendsWithM);

    }
}
