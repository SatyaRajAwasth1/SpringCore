package learn.standAloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

    private String stdName;
    public List<String> subjects;
    private Set<String> backSubs;
    private Map<String  , String > fees; // K=> sem (integer), V=> fee amount (String)
    private Properties habits;

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Set<String> getBackSubs() {
        return backSubs;
    }

    public void setBackSubs(Set<String> backSubs) {
        this.backSubs = backSubs;
    }

    public Map<String, String> getFees() {
        return fees;
    }

    public void setFees(Map<String, String> fees) {
        this.fees = fees;
    }

    public Properties getHabits() {
        return habits;
    }

    public void setHabits(Properties habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        System.out.println(" ");
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", subjects=" + subjects +
                ", backSubs=" + backSubs +
                ",fees=" + fees +
                ", habits=" + habits +
                '}';
    }
}
