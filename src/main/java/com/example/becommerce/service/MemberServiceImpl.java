package com.example.becommerce.service;

import com.example.becommerce.entity.Member;
import com.example.becommerce.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements   MemberService{

    private final MemberRepository memberRepository;


    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member remove(long id) {
        return null;
    }
}
