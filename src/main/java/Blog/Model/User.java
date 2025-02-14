package Blog.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Getter @Setter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String email;
        private String passwordHash;
        @Enumerated(EnumType.STRING)
        private Role role;
        private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
}
