package sec02;

import reactor.core.publisher.Flux;
import util.Util;

public class Lec09FluxFromMono {

    public static void main(String[] args) {

 /*       Mono<String> mono = Mono.just("a");

        Flux<String> flux = Flux.from(mono);

        flux.subscribe(Util.onNext());*/

        Flux.range(1, 10)
                .next() // 1
                .filter(i -> i > 3)
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());


    }

    private static void doSomething(Flux<String> flux){

    }

}
