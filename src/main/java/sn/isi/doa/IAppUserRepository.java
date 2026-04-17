package sn.isi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.AppUser;

public interface IAppUserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByEmail(String email);
}
