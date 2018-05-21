package com.jiang.common;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.validator.internal.metadata.facets.Validatable;
import org.springframework.validation.annotation.Validated;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

public class BeanValidator {

	private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
	
	
	public static <T> Map<String, String> Validated(T t,Class... groups)
	{
		Validator validator = validatorFactory.getValidator();
		Set valitorResult = validator.validate(t, groups);
		if (valitorResult.isEmpty()) {
			return Collections.emptyMap();
		}else {
			LinkedHashMap errors = new LinkedHashMap();
			Iterator iterator = valitorResult.iterator();
			while (iterator.hasNext()) {
				ConstraintViolation constraintValidator = (ConstraintViolation)iterator.next();
				errors.put(constraintValidator.getPropertyPath(), constraintValidator.getMessage());
				
			}
			
			return errors;
		}

	}
	
	public static Map<String, String> ValidatedList(Collection<?> collection)
	{
		Preconditions.checkNotNull(collection);
		Iterator iterator = collection.iterator();
		Map errors;
		do {
			if (!iterator.hasNext()) {
				return Collections.emptyMap();
			}
			
			Object object = iterator.next();
			errors = Validated(object, new Class[0]);
			
		} while (errors.isEmpty());
		
		
		return errors;
	}
	
	
	public  static Map<String, String> valiedObject(Object object , Object...objects) {
		
		if (objects != null && objects.length > 0) {
			return ValidatedList(Lists.asList(object, objects));
		}else
		{
			
			return Validated(object, new Class[0]);
		}
		

	}
	
	
}
