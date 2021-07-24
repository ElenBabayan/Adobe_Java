package com.aca.week3.Class6;

public class ProgressAware {
    private VisibilityEnum visibility;

    public Object getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }


    public static void main(String[] args) {
        final ProgressAware progressAware = new ProgressAware();
        // progressAware.setVisibility(ColorEnum.RED); //smb can set wrong class =>>> problem solved
        // TYPE SAFETY
        progressAware.setVisibility(VisibilityEnum.INVISIBLE); //object

        // returns VisibilityEnum object vs Visibility
        if (progressAware.getVisibility() == Visibility.VISIBLE) {

        }
    }


}
// enums are thread safe - g

