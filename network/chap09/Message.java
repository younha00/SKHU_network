package network.chap09;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L; // 객체 구조가 바뀌면 버전이 바뀌어야함. Long 타입
    String value;
    Date date;

    public Message(String value, Date date) {
        super();
        this.value = value;
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

