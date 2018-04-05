package nl.quintor.studybits.university.repositories;

import nl.quintor.studybits.university.entities.ClaimSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClaimSchemaRepository extends JpaRepository<ClaimSchema, Long> {
    Optional<ClaimSchema> findByUniversityNameIgnoreCaseAndSchemaNameAndSchemaVersion(String universityName, String schemaName, String schemaVersion);

    List<ClaimSchema> findAllByUniversityIdAndSchemaNameAndSchemaVersion(Long universityId, String schemaName, String schemaVersion);
}