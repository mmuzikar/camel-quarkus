package org.apache.camel.quarkus.language.simple;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.apache.camel.language.simple.Simple;

@ApplicationScoped
@Named("myBean")
@RegisterForReflection
public class MyBean {
    public String read(String body, @Simple("${header.foo} != null") boolean foo) {
        return body + " " + foo;
    }
}
