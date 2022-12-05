package org.example.ex17;

public class MeasurementConverter {

    public float convert(float value, ConversionType conversionType) {
        //5cm ile to cali
        //0,39 -> input(value)*przelicznik = -> 5cm *0,39
        return value * conversionType.getValue();
    }

    public float converter(float value, ConversionTypeWithFunction conversionTyp) {
        return conversionTyp.getConversion().apply(value);
    }
}
