package io.github.jakutenshi.seccomp.organizations;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends CrudRepository<Organization, Long> {
    List<Organization> findByName(String name);

    @Override
    Optional<Organization> findById(Long aLong);
}
