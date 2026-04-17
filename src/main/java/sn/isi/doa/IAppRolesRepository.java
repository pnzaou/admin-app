package sn.isi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.AppRoles;

public interface IAppRolesRepository extends JpaRepository<AppRoles, Integer> {
}
