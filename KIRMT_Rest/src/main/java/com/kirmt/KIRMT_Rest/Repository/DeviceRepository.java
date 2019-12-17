package com.kirmt.KIRMT_Rest.Repository;


import com.kirmt.KIRMT_Rest.Entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
