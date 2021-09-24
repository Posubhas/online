package com.cg.otms.entities;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="test-h1")
//@NamedQuery(name = "", query = "SELECT stud FROM Student stud WHERE stud.firstName = ?1 AND stud.lastName = ?2")
public class Test {
	@Id
	@GeneratedValue
private int testId;
private String testTitle;
private LocalTime testDuration;
@OneToMany(mappedBy="test",cascade=CascadeType.ALL)
private Set<Question> testQuestions;
private BigDecimal testTotalMarks;
private BigDecimal testMarksScored;
private Question currentQuestion;
private LocalDateTime startTime;
private LocalDateTime endTime;
public Test() {
	super();
	// TODO Auto-generated constructor stub
}
public Test(int testId, String testTitle, LocalTime testDuration, Set<Question> testQuestions,
		BigDecimal testTotalMarks, BigDecimal testMarksScored, Question currentQuestion, LocalDateTime startTime,
		LocalDateTime endTime) {
	super();
	this.testId = testId;
	this.testTitle = testTitle;
	this.testDuration = testDuration;
	this.testQuestions = testQuestions;
	this.testTotalMarks = testTotalMarks;
	this.testMarksScored = testMarksScored;
	this.currentQuestion = currentQuestion;
	this.startTime = startTime;
	this.endTime = endTime;
}
@Override
public String toString() {
	return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration + ", testQuestions="
			+ testQuestions + ", testTotalMarks=" + testTotalMarks + ", testMarksScored=" + testMarksScored
			+ ", currentQuestion=" + currentQuestion + ", startTime=" + startTime + ", endTime=" + endTime + "]";
}
public int getTestId() {
	return testId;
}
public void setTestId(int testId) {
	this.testId = testId;
}
public String getTestTitle() {
	return testTitle;
}
public void setTestTitle(String testTitle) {
	this.testTitle = testTitle;
}
public LocalTime getTestDuration() {
	return testDuration;
}
public void setTestDuration(LocalTime testDuration) {
	this.testDuration = testDuration;
}
public Set<Question> getTestQuestions() {
	return testQuestions;
}
public void setTestQuestions(Set<Question> testQuestions) {
	this.testQuestions = testQuestions;
}
public BigDecimal getTestTotalMarks() {
	return testTotalMarks;
}
public void setTestTotalMarks(BigDecimal testTotalMarks) {
	this.testTotalMarks = testTotalMarks;
}
public BigDecimal getTestMarksScored() {
	return testMarksScored;
}
public void setTestMarksScored(BigDecimal testMarksScored) {
	this.testMarksScored = testMarksScored;
}
public Question getCurrentQuestion() {
	return currentQuestion;
}
public void setCurrentQuestion(Question currentQuestion) {
	this.currentQuestion = currentQuestion;
}
public LocalDateTime getStartTime() {
	return startTime;
}
public void setStartTime(LocalDateTime startTime) {
	this.startTime = startTime;
}
public LocalDateTime getEndTime() {
	return endTime;
}
public void setEndTime(LocalDateTime endTime) {
	this.endTime = endTime;
}


}
