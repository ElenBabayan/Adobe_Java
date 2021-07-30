package com.aca.week4.Class7;

public class LineProgress extends ProgressAware {

    private final int lineLength;

    public LineProgress( int lineLength) throws Exception {
        if(lineLength < 0 ) {
            throw new Exception();
        }
        this.lineLength = lineLength;
    }

    //show is not overriden => super's show will be called
    // print is overriden => LineProgress print will be called
    @Override
    public void print(final int p) {
        System.out.println((p * lineLength)/100 + "current line length");
    }

}
