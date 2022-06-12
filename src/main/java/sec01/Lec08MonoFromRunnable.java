package sec01;


import reactor.core.publisher.Mono;
import util.Util;

public class Lec08MonoFromRunnable {

  public static void main(String[] args) {

    Mono.fromRunnable(timeConsumingProcess()).subscribe(Util.onNext(), Util.onError(), () -> {
      System.out.println("process is done. Sending emails...");
    });


  }

  private static Runnable timeConsumingProcess() {
    return () -> {
      Util.sleepSeconds(3);
      System.out.println("Operation completed");
    };
  }


}
