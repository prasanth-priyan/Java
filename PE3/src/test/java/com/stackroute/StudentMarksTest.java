package com.stackroute;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StudentMarksTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkGrades_ShouldPrintErrorMsg() {
        thrown.expect(GradeOutOfBoundsException.class);
        thrown.expectMessage("Grade is not between 0 and 100");
    }
}