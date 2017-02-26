/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CallLogFull;
import io.swagger.client.model.ListCallLogsFull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalllogsApi {
    private ApiClient apiClient;

    public CalllogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CalllogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getAccountCallLog */
    private com.squareup.okhttp.Call getAccountCallLogCall(Integer accountId, Integer callLogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/call-logs/{callLog_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "callLog_id" + "\\}", apiClient.escapeString(callLogId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountCallLogValidateBeforeCall(Integer accountId, Integer callLogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountCallLog(Async)");
        }
        
        // verify the required parameter 'callLogId' is set
        if (callLogId == null) {
            throw new ApiException("Missing the required parameter 'callLogId' when calling getAccountCallLog(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountCallLogCall(accountId, callLogId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show details of an individual Call Log entry
     * This service shows the details of an individual Call Logs entry.
     * @param accountId Account ID (required)
     * @param callLogId Call Log ID (required)
     * @return CallLogFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CallLogFull getAccountCallLog(Integer accountId, Integer callLogId) throws ApiException {
        ApiResponse<CallLogFull> resp = getAccountCallLogWithHttpInfo(accountId, callLogId);
        return resp.getData();
    }

    /**
     * Show details of an individual Call Log entry
     * This service shows the details of an individual Call Logs entry.
     * @param accountId Account ID (required)
     * @param callLogId Call Log ID (required)
     * @return ApiResponse&lt;CallLogFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CallLogFull> getAccountCallLogWithHttpInfo(Integer accountId, Integer callLogId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountCallLogValidateBeforeCall(accountId, callLogId, null, null);
        Type localVarReturnType = new TypeToken<CallLogFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual Call Log entry (asynchronously)
     * This service shows the details of an individual Call Logs entry.
     * @param accountId Account ID (required)
     * @param callLogId Call Log ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountCallLogAsync(Integer accountId, Integer callLogId, final ApiCallback<CallLogFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAccountCallLogValidateBeforeCall(accountId, callLogId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CallLogFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountCallLogs */
    private com.squareup.okhttp.Call listAccountCallLogsCall(Integer accountId, List<String> filtersId, List<String> filtersStartTime, String filtersCreatedAt, String filtersDirection, String filtersCalledNumber, String filtersType, List<String> filtersExtension, String sortId, String sortStartTime, String sortCreatedAt, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/call-logs".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (filtersStartTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[start_time]", filtersStartTime));
        if (filtersCreatedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filters[created_at]", filtersCreatedAt));
        if (filtersDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filters[direction]", filtersDirection));
        if (filtersCalledNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filters[called_number]", filtersCalledNumber));
        if (filtersType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filters[type]", filtersType));
        if (filtersExtension != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[extension]", filtersExtension));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
        if (sortStartTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[start_time]", sortStartTime));
        if (sortCreatedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[created_at]", sortCreatedAt));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAccountCallLogsValidateBeforeCall(Integer accountId, List<String> filtersId, List<String> filtersStartTime, String filtersCreatedAt, String filtersDirection, String filtersCalledNumber, String filtersType, List<String> filtersExtension, String sortId, String sortStartTime, String sortCreatedAt, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountCallLogs(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountCallLogsCall(accountId, filtersId, filtersStartTime, filtersCreatedAt, filtersDirection, filtersCalledNumber, filtersType, filtersExtension, sortId, sortStartTime, sortCreatedAt, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of call details associated with your account
     * Fetch a list of call logs associated with your account.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersStartTime Call start time filter (optional)
     * @param filtersCreatedAt Call log creation time filter (optional)
     * @param filtersDirection Call direction filter: in or out (optional)
     * @param filtersCalledNumber Called number (optional)
     * @param filtersType Call type, such as &#39;call&#39;, &#39;fax&#39;, &#39;audiogram&#39; (optional)
     * @param filtersExtension Extension filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortStartTime Sorting by call start time: asc or desc (optional)
     * @param sortCreatedAt Sorting by call log creation time: asc or desc (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListCallLogsFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListCallLogsFull listAccountCallLogs(Integer accountId, List<String> filtersId, List<String> filtersStartTime, String filtersCreatedAt, String filtersDirection, String filtersCalledNumber, String filtersType, List<String> filtersExtension, String sortId, String sortStartTime, String sortCreatedAt, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListCallLogsFull> resp = listAccountCallLogsWithHttpInfo(accountId, filtersId, filtersStartTime, filtersCreatedAt, filtersDirection, filtersCalledNumber, filtersType, filtersExtension, sortId, sortStartTime, sortCreatedAt, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of call details associated with your account
     * Fetch a list of call logs associated with your account.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersStartTime Call start time filter (optional)
     * @param filtersCreatedAt Call log creation time filter (optional)
     * @param filtersDirection Call direction filter: in or out (optional)
     * @param filtersCalledNumber Called number (optional)
     * @param filtersType Call type, such as &#39;call&#39;, &#39;fax&#39;, &#39;audiogram&#39; (optional)
     * @param filtersExtension Extension filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortStartTime Sorting by call start time: asc or desc (optional)
     * @param sortCreatedAt Sorting by call log creation time: asc or desc (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListCallLogsFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListCallLogsFull> listAccountCallLogsWithHttpInfo(Integer accountId, List<String> filtersId, List<String> filtersStartTime, String filtersCreatedAt, String filtersDirection, String filtersCalledNumber, String filtersType, List<String> filtersExtension, String sortId, String sortStartTime, String sortCreatedAt, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountCallLogsValidateBeforeCall(accountId, filtersId, filtersStartTime, filtersCreatedAt, filtersDirection, filtersCalledNumber, filtersType, filtersExtension, sortId, sortStartTime, sortCreatedAt, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListCallLogsFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of call details associated with your account (asynchronously)
     * Fetch a list of call logs associated with your account.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersStartTime Call start time filter (optional)
     * @param filtersCreatedAt Call log creation time filter (optional)
     * @param filtersDirection Call direction filter: in or out (optional)
     * @param filtersCalledNumber Called number (optional)
     * @param filtersType Call type, such as &#39;call&#39;, &#39;fax&#39;, &#39;audiogram&#39; (optional)
     * @param filtersExtension Extension filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortStartTime Sorting by call start time: asc or desc (optional)
     * @param sortCreatedAt Sorting by call log creation time: asc or desc (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountCallLogsAsync(Integer accountId, List<String> filtersId, List<String> filtersStartTime, String filtersCreatedAt, String filtersDirection, String filtersCalledNumber, String filtersType, List<String> filtersExtension, String sortId, String sortStartTime, String sortCreatedAt, Integer limit, Integer offset, String fields, final ApiCallback<ListCallLogsFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listAccountCallLogsValidateBeforeCall(accountId, filtersId, filtersStartTime, filtersCreatedAt, filtersDirection, filtersCalledNumber, filtersType, filtersExtension, sortId, sortStartTime, sortCreatedAt, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListCallLogsFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}