package com.example.sesion09.security;

import com.example.sesion09.models.Usuario;
import com.example.sesion09.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findOneByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("El correo no se encontró"));
        return new UserDetailsImpl(usuario);
    }
}
