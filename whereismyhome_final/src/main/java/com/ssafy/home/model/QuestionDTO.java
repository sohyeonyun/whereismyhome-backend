package com.ssafy.home.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "QuestionDTO : 문의사항 정보", description = "문의사항의 정보를 나타낸다.")
public class QuestionDTO {

	@ApiModelProperty(value = "문의사항 번호")
	private int questionNo;
	@ApiModelProperty(value = "유저아이디")
	private String userId;
	@ApiModelProperty(value = "문의사항 제목")
	private String subject;
	@ApiModelProperty(value = "문의사항 내용")
	private String content;
	@ApiModelProperty(value = "문의사항 등록 시간")
	private String registerTime;
	@ApiModelProperty(value = "작성 ip주소")
	private String ipAddress;
	@ApiModelProperty(value = "문의사항 답변")
	private String answer;

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionDTO [questionNo=" + questionNo + ", userId=" + userId + ", subject=" + subject + ", content="
				+ content + ", registerTime=" + registerTime + ", ipAddress=" + ipAddress + ", answer=" + answer + "]";
	}
}
