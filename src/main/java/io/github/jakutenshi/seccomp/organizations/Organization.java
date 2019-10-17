package io.github.jakutenshi.seccomp.organizations;

import javax.persistence.*;

@Entity
@Table(name = "Organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long   id;
    private String name;
    private String legalAddress;
    private String phoneNum;

    protected Organization() { }

    public Organization(String name, String legalAddress, String phoneNum) {
        this.name = name;
        this.legalAddress = legalAddress;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return String.format("Organization{ id=%d, name='%s', legalAddress='%s', phoneNum='%s'}",
                id, name, legalAddress, phoneNum);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
