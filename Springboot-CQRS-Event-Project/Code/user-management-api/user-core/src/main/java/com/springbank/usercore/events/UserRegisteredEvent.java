package com.springbank.usercore.events;


import com.springbank.usercore.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisteredEvent {
    private String id;
    private User user;
}
