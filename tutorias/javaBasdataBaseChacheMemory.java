import java.util.*;

class dataBaseChacheMemory{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> baseDeDatos = new ArrayList<>();
        Map<String, Integer> memoriaCache = new HashMap<>();

        baseDeDatos.add("Alberto");
        baseDeDatos.add("Juan");
        baseDeDatos.add("Alex");

        memoriaCache.put("AnotherProccess", 0);


        System.out.print("Input the username (or enter -1 to end the procces) : ");
        String consulta = scan.nextLine();

        while(!consulta.equals("-1")){
            if(!memoriaCache.containsKey(consulta)){
                if(baseDeDatos.contains(consulta)){
                    memoriaCache.put(consulta, baseDeDatos.indexOf(consulta) + 1);
                    Set<String> keysUsers = memoriaCache.keySet();

                    for(String user : keysUsers) {
                        System.out.println(user);
                    }
                }
            }else{
                Set<String> keysUsers = memoriaCache.keySet();
                System.out.println("Ninguna consulta fue hecha");
                for(String user : keysUsers) {
                    System.out.println(user);
                }
            }

            System.out.print("Input the username (or enter -1 to end the procces) : ");
            consulta = scan.nextLine();
        }





    }
}
