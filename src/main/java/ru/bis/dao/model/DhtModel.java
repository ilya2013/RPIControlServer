package ru.bis.dao.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
public class DhtModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cgen")
    @SequenceGenerator(name = "cgen", sequenceName = "CUSTOMER_SEQUENCE", allocationSize = 1)
    private Long id;
    private String deviceName;
    private String location;
    private String temperature;
    private String humidity;
    private String sensorModel;
    private String pin;
    private String time;
    @Column(name="comment_", length=500, nullable=true, unique=false)
    private String comment;
}
