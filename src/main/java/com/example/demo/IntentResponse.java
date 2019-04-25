package com.example.demo;

import java.util.List;
import com.example.demo.IntentRequest;

class DiagnosticInfo {

	private Integer webhookLatencyMs;

	public Integer getWebhookLatencyMs() {
		return webhookLatencyMs;
	}

	public void setWebhookLatencyMs(Integer webhookLatencyMs) {
		this.webhookLatencyMs = webhookLatencyMs;
	}

}

//class Intent {
//
//	private String name;
//	private String displayName;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDisplayName() {
//		return displayName;
//	}
//
//	public void setDisplayName(String displayName) {
//		this.displayName = displayName;
//	}
//
//}

public class IntentResponse {

	private String responseId;
	private QueryResult queryResult;
	private WebhookStatus webhookStatus;
	private Boolean additionalProperties;

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public WebhookStatus getWebhookStatus() {
		return webhookStatus;
	}

	public void setWebhookStatus(WebhookStatus webhookStatus) {
		this.webhookStatus = webhookStatus;
	}

	public Boolean getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Boolean additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}

//class OutputContext {
//
//	private String name;
//	private Integer lifespanCount;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Integer getLifespanCount() {
//		return lifespanCount;
//	}
//
//	public void setLifespanCount(Integer lifespanCount) {
//		this.lifespanCount = lifespanCount;
//	}
//
//}
//
//class Parameters {
//
//}
//
//class QueryResult {
//
//	private String queryText;
//	private String action;
//	private Parameters parameters;
//	private Boolean allRequiredParamsPresent;
//	private List<OutputContext> outputContexts = null;
//	private Intent intent;
//	private Integer intentDetectionConfidence;
//	private DiagnosticInfo diagnosticInfo;
//	private String languageCode;
//
//	public String getQueryText() {
//		return queryText;
//	}
//
//	public void setQueryText(String queryText) {
//		this.queryText = queryText;
//	}
//
//	public String getAction() {
//		return action;
//	}
//
//	public void setAction(String action) {
//		this.action = action;
//	}
//
//	public Parameters getParameters() {
//		return parameters;
//	}
//
//	public void setParameters(Parameters parameters) {
//		this.parameters = parameters;
//	}
//
//	public Boolean getAllRequiredParamsPresent() {
//		return allRequiredParamsPresent;
//	}
//
//	public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
//		this.allRequiredParamsPresent = allRequiredParamsPresent;
//	}
//
//	public List<OutputContext> getOutputContexts() {
//		return outputContexts;
//	}
//
//	public void setOutputContexts(List<OutputContext> outputContexts) {
//		this.outputContexts = outputContexts;
//	}
//
//	public Intent getIntent() {
//		return intent;
//	}
//
//	public void setIntent(Intent intent) {
//		this.intent = intent;
//	}
//
//	public Integer getIntentDetectionConfidence() {
//		return intentDetectionConfidence;
//	}
//
//	public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
//		this.intentDetectionConfidence = intentDetectionConfidence;
//	}
//
//	public DiagnosticInfo getDiagnosticInfo() {
//		return diagnosticInfo;
//	}
//
//	public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
//		this.diagnosticInfo = diagnosticInfo;
//	}
//
//	public String getLanguageCode() {
//		return languageCode;
//	}
//
//	public void setLanguageCode(String languageCode) {
//		this.languageCode = languageCode;
//	}
//
//}

class WebhookStatus {

	private Integer code;
	private String message;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}