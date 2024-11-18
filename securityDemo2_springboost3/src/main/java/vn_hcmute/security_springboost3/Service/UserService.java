package vn_hcmute.security_springboost3.Service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vn_hcmute.security_springboost3.Reponsitory.UserInfoRepository;
import vn_hcmute.security_springboost3.entity.UserInfor;

@Service
public record UserService(UserInfoRepository repository, PasswordEncoder passwordEncoder) {
    public String addUser(UserInfor userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "them thanh cong";
    }

}
