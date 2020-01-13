package com.kirmt.KIRMT_Rest.Repository;

import com.kirmt.KIRMT_Rest.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
