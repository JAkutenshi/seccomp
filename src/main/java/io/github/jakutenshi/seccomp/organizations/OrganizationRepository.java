package io.github.jakutenshi.seccomp.organizations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    List<Organization> findByName(String name);


    List<Organization> findByLegalAddress(String legalAddress);

    @Override
    Optional<Organization> findById(Long aLong);
}
