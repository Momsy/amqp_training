package fr.lernejo.chat;


import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    public final ChatMessageRepository repo;

    public ChatMessageListener(ChatMessageRepository chatMessageRepository) {
        repo = chatMessageRepository;
    }

    public void onMessage(String message) {
        repo.addChatMessage(message);
    }
}
