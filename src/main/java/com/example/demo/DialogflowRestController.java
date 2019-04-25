package com.example.demo;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.cloud.dialogflow.v2.QueryInput;
import com.google.cloud.dialogflow.v2.SessionName;
import com.google.cloud.dialogflow.v2.SessionsClient;
import com.google.cloud.dialogflow.v2.TextInput;
import com.google.cloud.dialogflow.v2.TextInput.Builder;
import com.google.cloud.dialogflow.v2beta1.WebhookResponse;

import com.example.demo.service.DailogFlowDemoDAL;

@RestController
public class DialogflowRestController {

   private String userText = "hello";
   private final String LANG_CODE = "en-US";
   private final String PROJECT_ID = "mitelvicebottest14apr";
   private String sessionId = UUID.randomUUID().toString();
   
   @Autowired
   DailogFlowDemoDAL dailogFlowDemoDAL;
   

   
   @RequestMapping(method = RequestMethod.POST, value = "/webhook")
  public ResponseJson2 dialogFlowWebHookPOST(@RequestBody IntentRequest requestStr,HttpServletRequest servletRequest) throws IOException {
	   String queryText =null;
	   String action = null;
	   String response =null;
	   if(requestStr.getQueryResult() != null) {
		    queryText = requestStr.getQueryResult().getQueryText();
	   		action = requestStr.getQueryResult().getAction();		
	   		response = dailogFlowDemoDAL.getUserByQueryTextAndAction(queryText, action);
	   }

	   
	   ResponseJson2 res2 = new ResponseJson2();
	   res2.setFulfillmentText("it is working very good ak");
	   
	   FulfillmentMessage message = new FulfillmentMessage();
	   
	  
	   
	   SimpleResponse sis1 = new SimpleResponse();
	   sis1.setTextToSpeech("textToSpeech"+"-------->"+queryText+"---->"+action+"----respose---->"+response);
	   sis1.setDisplayText("working perfect Ak"+"-------->"+queryText+"---->"+action+"----respose---->"+response);
	   
	   List<SimpleResponse> simpleResponses = new ArrayList();
	   simpleResponses.add(sis1);
	   
	   SimpleResponses sisres = new SimpleResponses();
	   sisres.setSimpleResponses(simpleResponses);

	   
	   message.setSimpleResponses(sisres);
	   List<FulfillmentMessage> finalMess = new ArrayList();
	   finalMess.add(message);
	   res2.setFulfillmentMessages(finalMess);
	   return res2;

   }
}