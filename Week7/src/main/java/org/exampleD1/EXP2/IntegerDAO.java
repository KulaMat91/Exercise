package org.exampleD1.EXP2;
//When non -generic type extend/implements  another generic type, the T have to be specyfied
public class IntegerDAO implements DAOInterface<Integer>{
    @Override
    public Integer getValue(Integer index) {
        return null;
    }

    @Override
    public void setValue(Integer index, Integer value) {

    }

    @Override
    public void addValue(Integer value) {

    }

    @Override
    public void removeValue(Integer value) {

    }

    @Override
    public void removeAtIndex(Integer index) {

    }
}
