package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FulfillmentMessage {

	private SimpleResponses simpleResponses;

	public SimpleResponses getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(SimpleResponses simpleResponses) {
		this.simpleResponses = simpleResponses;
	}



}

public class ResponseJson2 {

	private String fulfillmentText;
	private List<FulfillmentMessage> fulfillmentMessages = null;

	public String getFulfillmentText() {
		return fulfillmentText;
	}

	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	public List<FulfillmentMessage> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}


}

class SimpleResponse {

	private String textToSpeech;
	private String displayText;

	public String getTextToSpeech() {
		return textToSpeech;
	}

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}


}

class SimpleResponses {

	private List<SimpleResponse> simpleResponses = null;

	public List<SimpleResponse> getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(List<SimpleResponse> simpleResponses) {
		this.simpleResponses = simpleResponses;
	}


}
