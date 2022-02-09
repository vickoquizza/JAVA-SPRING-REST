package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        //Sin un supplier
        System.out.println(getConnectionUrl());

        //Con un supplier
        System.out.println(getUrl.get());
    }

    //Un supplier nos permite devolver un valor sin necesidad de dar ningun argumento
    //Nos permite entregar tambien de distintas formas los objetos en este caso
    static Supplier<List<String>> getUrl = () -> List.of("rtmp://localhost:8080/video", "rtmp://localhost:8080/audio");

    static String getConnectionUrl(){
        return "rtmp://localhost:8080/video";
    }
}
