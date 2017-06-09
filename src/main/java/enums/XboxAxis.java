package enums;

public enum XboxAxis {
    kXLeft (0),
    kYLeft (1),
    kLeftTrigger (2),
    kRightTrigger (3),
    kXRight (4),
    kYRight (5);

    public final int value;
    private XboxAxis(int value){
        this.value = value;
    }
}