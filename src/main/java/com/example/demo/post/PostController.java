package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

@Controller
public class PostController {
    private PostService postService;
    PostController() {
        this.postService = new PostService();
    }
//    사용자에게 data만 json형태로 return(CSR)
    @GetMapping("/csr/json") // url 맵핑 : localhost:8080/csr/json
    @ResponseBody // json형태로 데이터 반환
    public List<Post> findAll() {
        return postService.findAll();
    }

//    사용자에게 화면 + data return(SSR)
    @GetMapping("/ssr") // url 맵핑 : localhost:8080/ssr
    public String findAllSsr(Model model) { // 리턴타입 String으로 설정
        List<Post> posts = postService.findAll();
        model.addAttribute("postList", posts); // model객체에 key=postList, value=posts를 담아줌
        return "post_list"; // return에 templates 바로 아래 html파일이 존재할 경우 파일명으로 작성하면 연결됨
    }
}