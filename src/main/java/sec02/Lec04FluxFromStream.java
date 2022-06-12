package sec02;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;
import util.Util;

public class Lec04FluxFromStream {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

       // stream.forEach(System.out::println); // closed
       // stream.forEach(System.out::println);

        Flux<Integer> integerFlux = Flux.fromStream(() -> list.stream());

        integerFlux
                .subscribe(
                        Util.onNext(),
                        Util.onError(),
                        Util.onComplete()
                );

        integerFlux
                .subscribe(
                        Util.onNext(),
                        Util.onError(),
                        Util.onComplete()
                );


    }

}
