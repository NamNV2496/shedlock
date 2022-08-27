package com.shedlock.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "shedlock")
public class ShedLock {
    @Id
    private String name;
    private Timestamp lockedAt;
    private Timestamp lockUntil;
    private String lockedBy;
}
