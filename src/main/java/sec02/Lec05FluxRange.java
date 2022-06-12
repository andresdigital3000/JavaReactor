package sec02;

import reactor.core.publisher.Flux;
import util.Util;

public class Lec05FluxRange {

    public static void main(String[] args) {

        Flux.range(3, 10)
                .log()
                .map(i -> Util.faker().name().fullName())
                .log()
                .subscribe(
                        Util.onNext()
                );


    }

}
