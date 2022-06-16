package sec03;

import sec03.helper.NameProducer;
import util.Util;
import reactor.core.publisher.Flux;

public class Lec08FluxPush {

    public static void main(String[] args) {


        NameProducer nameProducer = new NameProducer();

        Flux.create(nameProducer)
                .subscribe(Util.subscriber());

        Runnable runnable = nameProducer::produce;

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

        Util.sleepSeconds(2);


    }


}
