/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author G10
 */
public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) (millisSecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }
    
    private long millisSecondsToYear(long milles) {
        return milles / MILLISECONDS_PER_YEAR;
    }
    
}
