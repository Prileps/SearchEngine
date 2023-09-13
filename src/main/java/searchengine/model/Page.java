package searchengine.model;

import javax.persistence.*;

@Entity
@Table(name = "Page")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "site_id")
    private int siteId;

    @Column(columnDefinition = "TEXT")
    private String path;

    @Column
    private int code;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String content;
}
