package com.jiang.common;


import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;
import org.codehaus.jackson.type.TypeReference;

import com.fasterxml.jackson.databind.SerializationFeature;



public class JsonMapper {

	
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	
	static {
		//objectMapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.setFilters(new SimpleFilterProvider().setFailOnUnknownId(false));
		objectMapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
		
		
	}
	
	
	public static <T> String objtoString(T obj) {
		if (obj == null) {
			return null;
		}
		
		try {
			return obj instanceof String ?(String)obj:objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	
	
	
	public static <T> T stringToObject(String str,TypeReference<T> reference) {
		if (str == null || reference == null) {
			return null;
		}
		
		try {
			return(T)(reference.getType().equals(String.class) ? str:objectMapper.readValue(str, reference));
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
