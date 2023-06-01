package com.capstoneproject.Empower.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "forums")
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="post")
    private String post;

    @Column(name = "forum_rating")
    private int forum_rating;

    @JsonBackReference
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "affirmations_forums",
            joinColumns = {@JoinColumn(name = "forum_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="affirmation_id", nullable = false, updatable = false)}
    )
    private List<Affirmation> affirmations;

    public Forum(String post, int forum_rating) {
        this.post = post;
        this.forum_rating = forum_rating;
        this.affirmations = new ArrayList<Affirmation>();
    }

    public Forum() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getForum_rating() {
        return forum_rating;
    }

    public void setForum_rating(int forum_rating) {
        this.forum_rating = forum_rating;
    }

    public List<Affirmation> getAffirmations() {
        return affirmations;
    }

    public void setAffirmations(List<Affirmation> affirmations) {
        this.affirmations = affirmations;
    }

    public void addAffirmation(Affirmation affirmation){
        this.affirmations.add(affirmation);
    }
}
