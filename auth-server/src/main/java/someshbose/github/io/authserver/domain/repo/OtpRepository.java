package someshbose.github.io.authserver.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import someshbose.github.io.authserver.domain.model.Otp;

import java.util.Optional;

@Repository
public interface OtpRepository extends JpaRepository<Otp, String> {

    Optional<Otp> findOtpByUsername(String username);

}
