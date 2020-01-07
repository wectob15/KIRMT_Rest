package com.kirmt.KIRMT_Rest.Repository;

import com.kirmt.KIRMT_Rest.Entity.ClassResponsible;
import com.kirmt.KIRMT_Rest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClassResponsibleRepository extends JpaRepository<ClassResponsible, User> {

}
