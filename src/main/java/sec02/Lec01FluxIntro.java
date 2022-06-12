package sec02;

import reactor.core.publisher.Flux;
import util.Util;

public class Lec01FluxIntro {

  public static void main(String[] args) {

    Flux<Object> flux = Flux.just(1, 2, 3, "a", Util.faker().name().fullName());

    flux.subscribe(Util.onNext(), Util.onError(), Util.onComplete());


  }

}
