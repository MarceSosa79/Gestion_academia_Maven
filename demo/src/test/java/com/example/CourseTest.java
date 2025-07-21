package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    void testShowInformation() {
        Course curso = new Course("Programacion", 140, "Giuli");
        assertEquals("Programacion", curso.getTitle());
        assertEquals(140, curso.getDuration());
        assertEquals("Giuli", curso.getProfessor());
    }
    @Test
    void testShowInformationIncludesData() {
        Course curso = new Course("Testing", 50, "Unassigned");
        String info = curso.showInformation();

        assertTrue(info.contains("Testing"));
        assertTrue(info.contains("50"));
        assertTrue(info.contains("Unassigned"));
}

}
