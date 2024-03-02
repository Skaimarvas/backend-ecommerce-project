package com.example.becommerce.controller;


import com.example.becommerce.entity.Member;
import com.example.becommerce.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/signup")
public class MemberController {

    private final MemberService memberService;



    @PostMapping
    public Member save(@RequestBody Member member){
        return memberService.save(member);
    }


}
