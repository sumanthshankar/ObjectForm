/*
 * Textarea class handles the text area aspect of forms.
 */
package com.object.form.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("TA")
public class Textarea extends FormElement{
	
	private static final long serialVersionUID = 1L;
	
	private String textValue;
	private String defaultValue;
	private Integer column;
	private Integer row;
	private Integer minLength;
	private Integer maxLength;
	
	@OneToOne
	private TextareaAnswer textareaAnswer;
	
	public String getTextValue() {
		return textValue;
	}
	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Integer getColumn() {
		return column;
	}
	public void setColumn(Integer column) {
		this.column = column;
	}
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public Integer getMinLength() {
		return minLength;
	}
	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}
	public Integer getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}
	public TextareaAnswer getTextareaAnswer() {
		return textareaAnswer;
	}
	public void setTextareaAnswer(TextareaAnswer textareaAnswer) {
		this.textareaAnswer = textareaAnswer;
	}
	
}
