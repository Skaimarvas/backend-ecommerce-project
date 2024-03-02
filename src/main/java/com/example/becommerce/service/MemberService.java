package com.example.becommerce.service;

import com.example.becommerce.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> findAll();
    Member save(Member member);
    Member remove(long id);
}
