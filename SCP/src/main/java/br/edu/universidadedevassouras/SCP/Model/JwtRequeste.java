package br.edu.universidadedevassouras.SCP.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequeste {
    
    private String username;
    private String password;
}
