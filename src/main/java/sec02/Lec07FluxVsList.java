package sec02;


import java.util.List;
import reactor.core.publisher.Flux;
import sec02.helper.NameGenerator;
import util.Util;

public class Lec07FluxVsList {

    public static void main(String[] args) {

        List<String> names = NameGenerator.getNamesList(5);
        System.out.println(names);

        NameGenerator.getNamesFlux(5)
                     .subscribe(Util.onNext());



    }

}
