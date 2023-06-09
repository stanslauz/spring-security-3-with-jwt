package co.ke.stanslaus.learningsecurity.repository;

import co.ke.stanslaus.learningsecurity.entities.SystemParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemParametersRepository extends JpaRepository <SystemParameters, Long> {
}
