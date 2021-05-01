package usp.poo.ex4;

import java.util.Date;

public class MyDate extends Date {
    MyDate () {
        super();
    }

    MyDate (long milliseconds) {
        super(milliseconds);
    }

    MyDate (MyDate date) {
        super(date.getTime());
    }

    public void addDays (int days) {
        this.setTime(this.getTime() + days * (24 * 3600 * 1000));
    }

    public void subDays (int days) {
        this.setTime(this.getTime() - days * (24 * 3600 * 1000));
    }
}
