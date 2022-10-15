package org.exampleD1.EXP2;

public interface DAOInterface<T> {
    T getValue(Integer index);

    //    void setValue()
    void setValue(Integer index, T value);

    void addValue(T value);

    void removeValue(T value);

    void removeAtIndex(Integer index);
}
