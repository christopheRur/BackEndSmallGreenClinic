package it.code.smallgreenclinic.model;

import javax.persistence.*;

@Entity
public class SmallGreenClinic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable=false, updatable = false)
    private Long id ;
    private String clinicName;
    private String state;
    private String address;
    private String phone;
    private String clinicCode;
    private String status;

    public SmallGreenClinic() {
    }

    public SmallGreenClinic(Long id, String clinicName, String state, String address, String phone, String clinicCode, String status) {
        this.id = id;
        this.clinicName = clinicName;
        this.state = state;
        this.address = address;
        this.phone = phone;
        this.clinicCode = clinicCode;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SmallGreenClinic{" +
                "id=" + id +
                ", clinicName='" + clinicName + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", clinicCode='" + clinicCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
