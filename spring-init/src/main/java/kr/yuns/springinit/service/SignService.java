package kr.yuns.springinit.service;

import kr.yuns.springinit.data.dto.BaseResponseDto;
import kr.yuns.springinit.data.dto.SignInResponseDto;
import kr.yuns.springinit.data.dto.SignRequestDto;

public interface SignService {
    BaseResponseDto signUp(SignRequestDto signRequestDto);
    SignInResponseDto signIn(SignRequestDto signRequestDto);
}
