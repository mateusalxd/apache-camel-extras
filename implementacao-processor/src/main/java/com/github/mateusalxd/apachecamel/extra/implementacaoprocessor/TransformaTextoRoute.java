package com.github.mateusalxd.apachecamel.extra.implementacaoprocessor;

import org.apache.camel.builder.RouteBuilder;

public class TransformaTextoRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:transformacao?repeatCount=1")
                .routeId("transformacao-texto")
                .setBody(constant("Isso é uma mensagem de teste"))
                .process("transformaTextoProcessor")
                .log("${body}");
    }
}
