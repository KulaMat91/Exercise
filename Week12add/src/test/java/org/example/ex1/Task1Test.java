package org.example.ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
 private static final List<String> UNSORTED = List.of("A", "B", "Z", "D", "C");
 private static final  List<String> EXPECTED_RESULT = List.of("Z", "D", "C", "B", "A");

    @Test
    void shouldReverseListOfStrings_UsingStream(){
        //given
//        List<String> unsorted = List.of("A", "B", "Z", "D", "C");
//        List<String> expectedResult = List.of("Z", "D", "C", "B", "A");
        //when
        List<String> result = Task1.sortUsingStream(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT,result);

    }

    @Test
    void shouldReverseListOfStrings_UsingAnonymousClass(){
        //given
        //when
        List<String> result = Task1.sortUsingAnonymousClass(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT,result);
    }

    @Test
    void shouldReverseListOfStrings_UsingOwnComparator(){
        //given
        //when
        List<String> result = Task1.sortUsingOwnComparator(UNSORTED);
        //then
        assertEquals(EXPECTED_RESULT,result);
    }
}