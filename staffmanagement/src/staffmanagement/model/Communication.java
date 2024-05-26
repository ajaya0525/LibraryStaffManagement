package staffmanagement.model;

import java.util.Date;

public class Communication {
    private int messageId;
    private int senderId;
    private int recipientId;
    private String message;
    private Date date;

    public Communication(int messageId, int senderId, int recipientId, String message, Date date) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.message = message;
        this.date = date;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getSenderId() {
        return senderId;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Communication [messageId=" + messageId + ", senderId=" + senderId + ", recipientId=" + recipientId + ", message=" + message + ", date=" + date + "]";
    }
}