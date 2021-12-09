package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class ChatMessageRepository {
    List<String> messageList = new LinkedList<>();

    public void addChatMessage(String message) {
        messageList.add(message);
    }


    public List<String> getLastTenMessages() {
        return messageList.subList(Math.max(messageList.size() - 10, 0), messageList.size());
    }
}
