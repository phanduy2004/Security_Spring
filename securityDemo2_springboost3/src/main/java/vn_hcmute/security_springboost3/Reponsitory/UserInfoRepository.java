package vn_hcmute.security_springboost3.Reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import vn_hcmute.security_springboost3.entity.UserInfor;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfor, Integer> {
    Optional<UserInfor> findByName(String username);
}
