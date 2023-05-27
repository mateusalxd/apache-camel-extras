package com.github.mateusalxd.apachecamel.extra.implementacaoprocessor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class TransformaTextoProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        var corpo = exchange.getMessage().getBody(String.class);
        exchange.getMessage().setBody(corpo.toUpperCase().substring(2));
    }
}
