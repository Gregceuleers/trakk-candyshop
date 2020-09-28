package be.trakk.candyshop.services.impl;

import be.trakk.candyshop.entities.User;
import be.trakk.candyshop.repository.UserRepository;
import be.trakk.candyshop.services.BaseService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService, BaseService<User, User, Long> {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserDetailsServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return this.userRepository
                .findByUsername(s)
                .orElseThrow(() -> new UsernameNotFoundException("L'utilisateur avec le nom " + s + " non trouvé !"));
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getOne(Long id) {
        return null;
    }

    @Override
    public boolean insert(User form) {

        form.setAccountNonExpired(true);
        form.setAccountNonLocked(true);
        form.setCredentialsNonExpired(true);
        form.setEnabled(true);

        form.setPassword(passwordEncoder.encode(form.getPassword()));

        this.userRepository.save(form);

        return true;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public User update(User form, Long id) {
        return null;
    }
}
