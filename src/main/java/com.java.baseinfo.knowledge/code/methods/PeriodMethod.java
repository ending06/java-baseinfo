package com.java.baseinfo.knowledge.code.methods;

import java.util.Date;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/16<p>
// -------------------------------------------------------

public class PeriodMethod {

    private final Date start;

    private final Date end;

    // this constructor can modify private var
/*    public PeriodMethod(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + "after" + end);
        }
        this.start = start;
        this.end = end;
    }*/

    //can protect copy
    public PeriodMethod(Date start,Date end){
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + "after" + end);
        }
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PeriodMethod{");
        sb.append("start=").append(start);
        sb.append(", end=").append(end);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();

        PeriodMethod periodMethod = new PeriodMethod(start,end);
        System.out.println("init.periodMethod="+periodMethod);

        /**
         init.periodMethod=PeriodMethod{start=Wed Jan 16 09:10:11 CST 2019, end=Wed Jan 16 09:10:11 CST 2019}
         rest.start.year.periodMethod=PeriodMethod{start=Fri Jan 16 09:10:11 CST 1987, end=Wed Jan 16 09:10:11 CST 2019}
         Process finished with exit code 0***/
        start.setYear(87);
        System.out.printf("rest.start.year.periodMethod="+periodMethod);

    }
}