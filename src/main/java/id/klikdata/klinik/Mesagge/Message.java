package id.klikdata.klinik.Mesagge;

import org.springframework.boot.autoconfigure.AutoConfiguration;

@AutoConfiguration
public class Message {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Message() {
    }

}
