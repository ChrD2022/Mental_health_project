package com.capstoneproject.Empower.repository;

import com.capstoneproject.Empower.models.Affirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AffirmationRepository extends JpaRepository<Affirmation, Long> {

}
