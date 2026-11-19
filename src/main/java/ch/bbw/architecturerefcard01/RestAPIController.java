package ch.bbw.architecturerefcard01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    @GetMapping("api")
    public ResponseEntity<Message> hello() {

        Message message = new Message("Application Ref. Card 01 - API hello");
        try {
            String serverIp = ServerAddress.get();
            message.setText(message.getText() + " - Server IP Address: " + serverIp);
        } catch(Exception e) {
            message.setText("Exception: " + e.getMessage());
        }
        return ResponseEntity.ok(message);
    }
}
