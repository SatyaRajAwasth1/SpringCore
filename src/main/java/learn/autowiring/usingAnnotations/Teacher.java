package learn.autowiring.usingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Teacher {
    @Autowired // by-default it takes byType
    @Qualifier("physics") // this will inject bean named physics
    private Subject subject;
    private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", teacherName = '" + teacherName+" subject     = " + subject
                 + '\'' +
                '}';
    }
}
