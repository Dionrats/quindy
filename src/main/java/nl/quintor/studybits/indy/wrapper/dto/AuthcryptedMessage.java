package nl.quintor.studybits.indy.wrapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthcryptedMessage {
    private byte[] message;
    private String did;
}
