package org.OPPTask.Task7;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double r) {
        super(r);
    }

    @Override
    public void resize(int percent) {
        r *=  (int) (percent / 100);
    }
}
