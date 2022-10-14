package org.exampleD2.EXP4GenericClass;
//<T> określa sie tym klase generyczną ,najlapiej stosować typy prymitywne
public class LockedBox <TValue, TPassword> {
    private final TPassword password;
    private TValue value;

    public LockedBox(TPassword password, TValue value) {
        this.password = password;
        this.value = value;
    }

    public TValue getValue(TPassword password) {
        if (this.password.equals(password)) {
            return value;
        }
        else {
            return null;
        }
    }

    public void setValue(TPassword password, TValue newValue) {
        if (this.password.equals(password)) {
            this.value = newValue;
        }

    }

}
