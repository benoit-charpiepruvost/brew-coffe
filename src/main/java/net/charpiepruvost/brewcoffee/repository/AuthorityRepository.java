package net.charpiepruvost.brewcoffee.repository;

import net.charpiepruvost.brewcoffee.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
