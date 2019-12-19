package com.example.WoowaCrewCI.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ForTest {

    @Test
    void name() {
        assertThat("hello").isEqualTo("hello");
    }
}
