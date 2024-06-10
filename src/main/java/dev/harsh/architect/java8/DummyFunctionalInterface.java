package dev.harsh.architect.java8;

import lombok.EqualsAndHashCode;

@FunctionalInterface
public interface DummyFunctionalInterface {
    void dummy();
    @Override
    boolean equals(Object object);

}
