package com.jzel.hellospringai;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.Generation;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

  private final ChatClient chatClient;

  @GetMapping("/hello")
  public List<Generation> hello() {
    return chatClient.prompt(
        new PromptTemplate("Please generate a creative output for my \"Hello, Spring AI World\"!").create()
    ).call().chatResponse().getResults();
  }
}
