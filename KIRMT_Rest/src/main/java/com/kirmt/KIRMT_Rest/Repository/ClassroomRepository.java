package com.kirmt.KIRMT_Rest.Repository;

import com.kirmt.KIRMT_Rest.Entity.Classroom;
import com.kirmt.KIRMT_Rest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {
    @Query("SELECT c FROM Classroom c WHERE c.classname = :name")
    Classroom findClassroomByClassname(
            @Param("name") String name);
}
