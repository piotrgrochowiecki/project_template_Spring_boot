package com.piotrgrochowiecki.project_template.repository;

import com.piotrgrochowiecki.project_template.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
