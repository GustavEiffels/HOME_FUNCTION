package com.myhome.email_sender.domain.member;

import com.myhome.email_sender.common.exceptions.CustomException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberRepository memberRepository;

    // basic
    public void create(String email){
        if(findMember(email).isPresent()){
            throw new CustomException(MemberException.ALREADY_EXIST);
        }
        memberRepository.save(MemberEntity.create(email));
    }
    public Optional<MemberEntity> findMember(String email){
        return memberRepository.findMemberByEmail(email);
    }
    public Optional<MemberEntity> findMember(Long memberId){
        return memberRepository.findMember(memberId);
    }
    public MemberEntity getMember(String email){
        return findMember(email).orElseThrow(()-> new CustomException(MemberException.NOT_EXIST));
    }
    public MemberEntity getMember(Long memberId){
        return findMember(memberId).orElseThrow(()-> new CustomException(MemberException.NOT_EXIST));
    }

}
