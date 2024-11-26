package ru.fodi.Tako.Restaurant.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@Table(name = "client", schema = "public", catalog = "Tako")
public class Client implements UserDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_client")
    private long idClient;
    @Column(name = "name_client")
    @NotEmpty(message = "Имя не может быть пустым")
    @Size(min = 2, max = 15, message = "Введите корректное имя")
    private String nameClient;
    @Column(name = "phone_client")
    @NotEmpty(message = "Номер не может быть пустым")
    private String phoneClient;
    @Column(name = "email_client")
    @Email(message = "Введите корректный email")
    private String emailClient;

//    поменять поля исходя из сусурити

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
