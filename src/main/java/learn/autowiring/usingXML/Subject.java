package learn.autowiring.usingXML;

public class Subject {
    private String subjName;
    private String subCode;

    public String getSubjName() {
        return subjName;
    }

    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjName='" + subjName + '\'' +
                ", subCode='" + subCode + '\'' +
                '}';
    }
}
