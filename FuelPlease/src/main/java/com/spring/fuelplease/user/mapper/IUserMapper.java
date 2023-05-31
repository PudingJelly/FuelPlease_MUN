package com.spring.fuelplease.user.mapper;

import org.apache.ibatis.annotations.Param;

import com.spring.fuelplease.voCenter.UserVO;

public interface IUserMapper {

	//회원정보 얻어오기

	//로그인
	String userLogin(String id);
	//회원가입
	void userJoin(UserVO vo);

	//아이디 중복확인
	int idCheck(String id);

	//회원정보 얻어오기
<<<<<<< HEAD
	UserVO getInfo(@Param("userId") String id);
=======

	UserVO getInfo(@Param("id") String id);

//	UserVO getInfo(@Param("userId")String id);
>>>>>>> dev


	//회원정보 수정
	void updateUser(UserVO vo);
	
	//회원 탈퇴
	void deleteUser(String id, String pw);
}
