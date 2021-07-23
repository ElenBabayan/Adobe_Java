package com.aca.week3.Homework02;
import com.aca.week3.Homework02.ProgressAware;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LineProgressAware extends ProgressAware {

    private final int lineLength;

    public LineProgressAware(int lineLength) {
        if(!checkIfValid(lineLength)) {
            throw new RuntimeException("Invalid lineLength");
        }
        this.lineLength = lineLength;
    }

    private boolean checkIfValid(int lineLength){
        return lineLength >= 0;
    }

    @Override
    public void showProgress(int seconds) throws InterruptedException {
        showProgress();
        double currTime = 0;
        while(currTime <= seconds) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println( "Line width: " + (int) (lineLength * currTime / seconds) +
                    ", Progress length: " + (int) currTime  );
            currTime++;
        }
        hideProgress();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        LineProgressAware lineProgressAware = new LineProgressAware(500);
        lineProgressAware.showProgress(10);

    }
}
