package org.exampleD1.EXP2;

import java.util.List;
//When generic type extend/implements  another generic type, the T dosen't have to to be specified
public class DataAccessObject<T> implements DAOInterface<T> {

    private List<T> values;

    private DataAccessObject(List<T> value) {
        this.values = value;
    }

    private DataAccessObject() {

    }

    @Override
    public T getValue(Integer index) {
        return values.get(index);
    }
    @Override
    public void setValue(Integer index, T value) {
        values.set(index, value);
    }
    @Override
    public void addValue(T value) {
        values.add(value);
    }

    @Override
    public void removeValue(T value) {

    }

    @Override
    public void removeAtIndex(Integer index) {

    }

    public static DataAccessObject<Integer> createDAO(List<Integer> initialValues) {
        return new DataAccessObject<>(initialValues);
    }

    // tworzenie metody generycznej
    public static <TDAO> DataAccessObject<TDAO> createDataAccessObject() {
        return new DataAccessObject<>();
    }

    public static <TDAO> DataAccessObject<TDAO> createDataAccessObject(List<TDAO> initialValues) {
        return new DataAccessObject<>(initialValues);
    }

}
