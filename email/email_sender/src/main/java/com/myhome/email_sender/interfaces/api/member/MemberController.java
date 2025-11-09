package com.myhome.email_sender.interfaces.api.member;

import com.myhome.email_sender.common.ApiResponse;
import com.myhome.email_sender.domain.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public ApiResponse<Void> create(@RequestBody MemberApiDto.CreateRequest request){
        memberService.create(request.email());
        return ApiResponse.created();
    }
}
