package src.java;

public enum WeekEnum {
    MONDAY ("星期一"),
    TUESDAY ("星期二"),
    WEDNESDAY ("星期三"),
    THURSDAY ("星期四"),
    FRIDAY ("星期五"),
    SATURDAY ("星期六"),
    SUNDAY ("星期天");

    private String value ;

    private WeekEnum(String value){
        this.value = value;
    }
}
