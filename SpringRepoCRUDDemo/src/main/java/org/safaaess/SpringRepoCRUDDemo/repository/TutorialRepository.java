package org.safaaess.SpringRepoCRUDDemo.repository;

import java.util.List;

import org.safaaess.SpringRepoCRUDDemo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
     // Tutorial → Entity type and Long --> primary key
{
     //   findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}