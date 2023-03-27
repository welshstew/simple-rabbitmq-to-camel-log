package org.acme;

import org.apache.camel.builder.RouteBuilder;

public class AwesomeRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //from("timer://henlo?period=5000").log("hello there! ${body}");
        from("rabbitmq:localhost:5672/tasks?username=guest&password=guest&autoDelete=false&routingKey=camel&queue=task_queue")
                .log("hello there! ${body}");

    }
}
