package com.kirmt.KIRMT_Rest.Repository;

import com.kirmt.KIRMT_Rest.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
