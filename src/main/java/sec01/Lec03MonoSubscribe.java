package sec01;


import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {

  public static void main(String... args) {
    //Publisher
    Mono<String> mono = Mono.just("ball");

    //Exercise: Hagamos que lance una excepcion

    //1
    //mono.subscribe();

    //2
    //Exercise: Hagamos refactor llamando Util
    mono.subscribe(
        item -> System.out.println(item),
        err -> System.out.println(err.getMessage()),
        () -> System.out.println("Completed")
    );
  }


}
