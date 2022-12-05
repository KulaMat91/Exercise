package org.example.ex17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementConverterTest {

    @Test
    void shouldReturnCorrectValueAfterConversion(){
        //given
        float input = 5;
        ConversionType conversionType = ConversionType.CENTIMETERS_TO_INCHES;
        MeasurementConverter converter = new MeasurementConverter();
        float expectedResult = 1.9499999f;
        //when
        float result = converter.convert(5,conversionType);
        //then
        assertEquals(expectedResult,result);
    }

    @Test
    void shouldReturnCorrectValueAfterConversion_Function(){
        //given
        float input = 5;
        ConversionTypeWithFunction conversionType = ConversionTypeWithFunction.CENTIMETERS_TO_INCHES;
        MeasurementConverter converter = new MeasurementConverter();
        float expectedResult = 1.9499999f;
        //when
        float result = converter.converter(5,conversionType);
        //then
        assertEquals(expectedResult,result);
    }

}