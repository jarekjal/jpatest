package jarekjal;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "getMessages",
                query = "select m from Message m"
        )
})
public class Message {

    @Id
    @Column(name = "messageId")
    private int id;
    private String message; // must be named exactly as column in DB

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
