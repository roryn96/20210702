package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return false;
	}
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memId", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPw", "required");
		ValidationUtils.rejectIfEmpty(errors, "memName", "required");
		ValidationUtils.rejectIfEmpty(errors, "postNumber", "required");
		ValidationUtils.rejectIfEmpty(errors, "memAddress", "required");
		ValidationUtils.rejectIfEmpty(errors, "detailAdd", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPhone", "required");
		ValidationUtils.rejectIfEmpty(errors, "memEmail", "required");
	}
	
}
