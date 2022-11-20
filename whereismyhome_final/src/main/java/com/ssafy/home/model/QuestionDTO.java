package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "QuestionDTO : 문의사항 정보", description = "문의사항의 정보를 나타낸다.")
public class QuestionDTO {
	
	@ApiModelProperty(value = "문의사항 번호")
	private int question_no;
	@ApiModelProperty(value = "유저아이디")
	private String user_id;
	@ApiModelProperty(value = "문의사항 제목")
	private String subject;
	@ApiModelProperty(value = "문의사항 내용")
	private String content;
	@ApiModelProperty(value = "문의사항 등록 시간")
	private String register_time;
	@ApiModelProperty(value = "작성 ip주소")
	private String ip_address;
	@ApiModelProperty(value = "문의사항 답변")
	private String answer;

	public int getQuestion_no() {
		return question_no;
	}

	public void setQuestion_no(int question_no) {
		this.question_no = question_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegister_time() {
		return register_time;
	}

	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionDTO [question_no=" + question_no + ", user_id=" + user_id + ", subject=" + subject
				+ ", content=" + content + ", register_time=" + register_time + ", ip_address=" + ip_address
				+ ", answer=" + answer + "]";
	}
}
