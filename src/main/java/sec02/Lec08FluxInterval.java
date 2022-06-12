package sec02;

import reactor.core.publisher.Flux;

import java.time.Duration;
import util.Util;

public class Lec08FluxInterval {

    public static void main(String[] args) {

        Flux.interval(Duration.ofSeconds(1))
                .subscribe(Util.onNext());

        Util.sleepSeconds(5);

    }

}
