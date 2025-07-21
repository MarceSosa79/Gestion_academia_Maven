package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnlineCourseTest {

    @Test
    void testPlatformAssignment() {
        OnlineCourse course = new OnlineCourse("Java", 150, "Giuli", "BIOS");

        assertNotNull(course.getPlatform());
        assertEquals("BIOS", course.getPlatform());
        assertEquals("Java", course.getTitle());
        assertEquals(150, course.getDuration());
        assertEquals("Giuli", course.getProfessor()); 
    }

    @Test
    void testShowInformationIncludesPlatform() {
        OnlineCourse course = new OnlineCourse("Testing", 60, "Unasigned", "Udemy");

        String info = course.showInformation();
        assertNotNull(info);
        assertTrue(info.contains("Testing"));
        assertTrue(info.contains("60"));
        assertTrue(info.contains("Unasigned"));
        assertTrue(info.contains("Udemy")); 
    }
}
