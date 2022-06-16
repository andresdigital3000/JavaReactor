package sec02.helper;

import java.util.ArrayList;
import java.util.List;
import reactor.core.publisher.Flux;
import util.Util;

public class NameGenerator {

    public static List<String> getNamesList(int count){
        List<String> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            list.add(getName());
        }
        return list;
    }

    public static Flux<String> getNamesFlux(int count){
       return Flux.range(0, count)
                .map(i -> getName());
    }

    private static String getName(){
        Util.sleepSeconds(2);
        return Util.faker().name().fullName();
    }

}
