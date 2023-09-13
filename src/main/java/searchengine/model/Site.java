package searchengine.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Sites")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum")
    private SiteStatus status;

    @Column(name = "status_time")
    private LocalDateTime statusTime;

    @Column(name = "last_error", columnDefinition = "TEXT")
    private String lastError;

    @Column(columnDefinition = "VARCHAR(255)")
    private String url;

    @Column(columnDefinition = "VARCHAR(255)")
    private String  name;
}
