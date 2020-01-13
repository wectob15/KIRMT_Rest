package com.kirmt.KIRMT_Rest.Repository;

import com.kirmt.KIRMT_Rest.Entity.ClassResponsible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassResponsibleRepository extends JpaRepository<ClassResponsible, Integer> {

}
