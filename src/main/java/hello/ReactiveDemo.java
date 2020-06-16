package hello;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.Arrays;
import java.util.List;

/**
 * description:
 *
 * @author 刘一博
 * @version V1.0
 * @date 2020/6/16 16:06
 */
public class ReactiveDemo {

    public static void main(String[] args) {
        Flux.fromIterable(Arrays.asList(1, 2, 3, 45, 1))
                .doAfterTerminate(ReactiveDemo::test)
                .subscribe(System.out::println);
    }

    public static void test() {
        System.out.println(1);
    }
}
