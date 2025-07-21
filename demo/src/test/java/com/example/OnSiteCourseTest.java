package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnSiteCourseTest {

    @Test
    void testConstructorAssignmentsWithEqualsAndNotNull() {
        OnSiteCourse course = new OnSiteCourse("Redes", 45, "Sala B", 20);

        assertEquals("Redes", course.getTitle());             
        assertEquals("Sala B", course.getRoom());   
        assertEquals(45, course.getDuration());
        assertEquals(20, course.getMaxQuota());              
        assertNotNull(course.getRoom());                      
    }

    @Test
    void testShowInformationWithTrueAndEquals() {
        OnSiteCourse course = new OnSiteCourse("Bases de Datos", 60, "Tito", "Sala A", 30);

        String info = course.showInformation();

        assertTrue(info.contains("Bases de Datos"));     
        assertTrue(info.contains("Sala A"));           
        assertEquals("Prof. Juan", course.getProfessor());
    }
}
