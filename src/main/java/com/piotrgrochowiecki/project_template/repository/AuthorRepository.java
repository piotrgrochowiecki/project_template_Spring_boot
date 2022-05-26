package com.piotrgrochowiecki.project_template.repository;

import com.piotrgrochowiecki.project_template.model.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

}
