package hello;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@Component
public class GreetingHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        System.out.println(request);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_STREAM_JSON)
                .body(BodyInserters.fromValue(Arrays.asList(1, 2, 3, 4, 5)));
    }
}
