package com.myspace.prubsn;


public class QuestionaireDetailsDO
{
    private String questionNo;
    private String questionValue;
    private String questionText;
    private String answer;
    private String questionType;
    
    public String getQuestionNo() {
        return this.questionNo;
    }
    
    public void setQuestionNo(final String questionNo) {
        this.questionNo = questionNo;
    }
    
    public String getQuestionValue() {
        return this.questionValue;
    }
    
    public void setQuestionValue(final String questionValue) {
        this.questionValue = questionValue;
    }
    
    public String getQuestionText() {
        return this.questionText;
    }
    
    public void setQuestionText(final String questionText) {
        this.questionText = questionText;
    }
    
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(final String answer) {
        this.answer = answer;
    }
    
    public String getQuestionType() {
        return this.questionType;
    }
    
    public void setQuestionType(final String questionType) {
        this.questionType = questionType;
    }
}
