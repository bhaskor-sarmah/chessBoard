package com.bhaskor.pieces;

import com.bhaskor.pieces.Knight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("Knight")
public class KnightTest {
    @Mock private Knight knight;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this); //without this you will get NPE
    }

    @Test
    @DisplayName("Test successful Knight creation")
    void testChessBoard() {
        Assertions.assertNotNull(knight);
    }
}
