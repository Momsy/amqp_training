package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {

    public final ChatMessageRepository chatMessageRepository;

    public ChatMessageController(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    @GetMapping(value = "/api/message")
    public List<String> getTenLastMessages(){
        return this.chatMessageRepository.getLastTenMessages();
    }
}
