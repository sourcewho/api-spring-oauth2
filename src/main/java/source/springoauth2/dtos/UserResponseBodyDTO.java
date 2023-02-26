package source.springoauth2.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResponseBodyDTO {

    private UUID userId;

    private String name;

    private String username;

    private String password;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
