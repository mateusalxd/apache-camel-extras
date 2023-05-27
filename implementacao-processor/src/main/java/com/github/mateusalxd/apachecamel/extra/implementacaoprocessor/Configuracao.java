package com.github.mateusalxd.apachecamel.extra.implementacaoprocessor;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;

@Configuration
public class Configuracao {

    @BindToRegistry
    public TransformaTextoProcessor transformaTextoProcessor() {
        return new TransformaTextoProcessor();
    }

}
