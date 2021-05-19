package org.apache.camel.quarkus.language.simple;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.apache.camel.language.simple.Simple;

@ApplicationScoped
@Named("simpleBean")
@RegisterForReflection
public class SimpleBean {

    private String body;
    private boolean foo;

    public String getBody() {
        return body;
    }

    public boolean getFoo() {
        return foo;
    }

    @Override
    public String toString() {
        return body + " :: " + foo;

    }

    public void read(String body, @Simple("${header.foo} != null") boolean foo) {
        this.body = body;
        this.foo = foo;
    }
}
