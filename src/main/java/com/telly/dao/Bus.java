package com.telly.dao;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Bus{

    @Id
    @Column(name="dateleave")
    private Date dateLeave;


    @Column(name="datereturn")
    private Date dateReturn;

    @Column(name="leavingfrom")
    private String leaveFrom;

    @Column(name="goingto")
    private String goingTo;


    public Bus() {

    }

    public Bus(Date dateLeave, Date dateReturn, String leaveFrom, String goingTo) {
        this.dateLeave = dateLeave;
        this.dateReturn = dateReturn;
        this.leaveFrom = leaveFrom;
        this.goingTo = goingTo;
    }


    public Date getDateLeave() {
        return dateLeave;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public String getLeaveFrom() {
        return leaveFrom;
    }

    public String getGoingTo() {
        return goingTo;
    }

}
