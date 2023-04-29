package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SongTest {

    @Test
    public void get_lines_of_day_one(){
        Song song = new Song();
        StringBuffer expected = new StringBuffer();
        expected.append("El primer día de Navidad\n");
        expected.append("Mi verdadero amor me regaló\n");
        expected.append("Una perdiz en un árbol de peras");
        assertEquals(expected.toString(), song.getLinesOfDay(1));
    }
}