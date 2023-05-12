package org.Stasy.digital_nomad_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="tbl_notes")
@Data
public class Note {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;
    private String category;

    @Column(name="created_at",nullable=false,updatable=false)
    @CreationTimestamp
    private Date createdAt;

    @Column(name="updated_at")
    @UpdateTimestamp
    private Date updatedAt;

}
