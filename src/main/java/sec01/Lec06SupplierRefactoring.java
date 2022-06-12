package sec01;


import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import util.Util;

public class Lec06SupplierRefactoring {

  public static void main(String[] args) {
    //monoNotAsync();
    //monoAsincrono();
    monoBlock();
    /*
    getName();
    getName();//.subscribe(Util.onNext());
    //Ejercicio hagamos asincrono
    getName()
        .subscribeOn(Schedulers.boundedElastic())
        .subscribe(Util.onNext());
    //String name = getName().subscribeOn(Schedulers.boundedElastic()).block();
    //System.out.println(name);

    Util.sleepSeconds(4);*/
  }

  private static Mono<String> getName() {
    System.out.println("entered getName method");
    return Mono.fromSupplier(() -> {
      System.out.println("Generating name..");
      Util.sleepSeconds(3);
      return Util.faker().name().fullName();
    }).map(String::toUpperCase);
  }

  private static void monoNotAsync() {
    getName();
    getName()
        .subscribe(Util.onNext());
    getName();
  }
  private static void monoAsincrono() {
    getName();
    getName()
        .subscribeOn(Schedulers.boundedElastic())
        .subscribe(Util.onNext());
    getName();
    Util.sleepSeconds(4);
  }

  private static void monoBlock() {
    getName();
    String name = getName()
        .subscribeOn(Schedulers.boundedElastic())
        .block(); //For testing purposes
    System.out.println(name);
    getName();
    Util.sleepSeconds(4);
  }


}
