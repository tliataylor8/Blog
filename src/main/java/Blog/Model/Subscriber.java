package Blog.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Entity
@Table(name = "newsletter_subscribers")
@Getter @Setter
public class Subscriber {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
}