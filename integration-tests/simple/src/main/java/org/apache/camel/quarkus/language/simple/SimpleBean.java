package org.apache.camel.quarkus.language.simple;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.apache.camel.language.simple.Simple;

@ApplicationScoped
@Named("simpleBean")
@RegisterForReflection
public class SimpleBean {
    public String body;
    public boolean foo;

    public void read(String body, @Simple("${header.foo} != null") boolean foo) {
        System.out.println("Executed");
        this.body = body;
        this.foo = foo;
    }
}
