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


import io.swagger.client.model.CreateQueueParams;
import io.swagger.client.model.DeleteQueue;
import io.swagger.client.model.ListQueuesFull;
import io.swagger.client.model.QueueFull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueuesApi {
    private ApiClient apiClient;

    public QueuesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QueuesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountQueue */
    private com.squareup.okhttp.Call createAccountQueueCall(Integer accountId, CreateQueueParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/queues".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAccountQueueValidateBeforeCall(Integer accountId, CreateQueueParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountQueue(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createAccountQueueCall(accountId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a queue
     * For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param data Queue data (optional)
     * @return QueueFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueueFull createAccountQueue(Integer accountId, CreateQueueParams data) throws ApiException {
        ApiResponse<QueueFull> resp = createAccountQueueWithHttpInfo(accountId, data);
        return resp.getData();
    }

    /**
     * Create a queue
     * For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param data Queue data (optional)
     * @return ApiResponse&lt;QueueFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueueFull> createAccountQueueWithHttpInfo(Integer accountId, CreateQueueParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountQueueValidateBeforeCall(accountId, data, null, null);
        Type localVarReturnType = new TypeToken<QueueFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a queue (asynchronously)
     * For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param data Queue data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountQueueAsync(Integer accountId, CreateQueueParams data, final ApiCallback<QueueFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountQueueValidateBeforeCall(accountId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueueFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteAccountQueue */
    private com.squareup.okhttp.Call deleteAccountQueueCall(Integer accountId, Integer queueId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/queues/{queue_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAccountQueueValidateBeforeCall(Integer accountId, Integer queueId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteAccountQueue(Async)");
        }
        
        // verify the required parameter 'queueId' is set
        if (queueId == null) {
            throw new ApiException("Missing the required parameter 'queueId' when calling deleteAccountQueue(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteAccountQueueCall(accountId, queueId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a queue
     * This service a queue from the account. For more information on queue properties, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @return DeleteQueue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteQueue deleteAccountQueue(Integer accountId, Integer queueId) throws ApiException {
        ApiResponse<DeleteQueue> resp = deleteAccountQueueWithHttpInfo(accountId, queueId);
        return resp.getData();
    }

    /**
     * Delete a queue
     * This service a queue from the account. For more information on queue properties, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @return ApiResponse&lt;DeleteQueue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteQueue> deleteAccountQueueWithHttpInfo(Integer accountId, Integer queueId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountQueueValidateBeforeCall(accountId, queueId, null, null);
        Type localVarReturnType = new TypeToken<DeleteQueue>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a queue (asynchronously)
     * This service a queue from the account. For more information on queue properties, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountQueueAsync(Integer accountId, Integer queueId, final ApiCallback<DeleteQueue> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAccountQueueValidateBeforeCall(accountId, queueId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteQueue>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountQueue */
    private com.squareup.okhttp.Call getAccountQueueCall(Integer accountId, Integer queueId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/queues/{queue_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

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
    private com.squareup.okhttp.Call getAccountQueueValidateBeforeCall(Integer accountId, Integer queueId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountQueue(Async)");
        }
        
        // verify the required parameter 'queueId' is set
        if (queueId == null) {
            throw new ApiException("Missing the required parameter 'queueId' when calling getAccountQueue(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountQueueCall(accountId, queueId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show details of an individual queue
     * This service shows the details of an individual queue. For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @return QueueFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueueFull getAccountQueue(Integer accountId, Integer queueId) throws ApiException {
        ApiResponse<QueueFull> resp = getAccountQueueWithHttpInfo(accountId, queueId);
        return resp.getData();
    }

    /**
     * Show details of an individual queue
     * This service shows the details of an individual queue. For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @return ApiResponse&lt;QueueFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueueFull> getAccountQueueWithHttpInfo(Integer accountId, Integer queueId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountQueueValidateBeforeCall(accountId, queueId, null, null);
        Type localVarReturnType = new TypeToken<QueueFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual queue (asynchronously)
     * This service shows the details of an individual queue. For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountQueueAsync(Integer accountId, Integer queueId, final ApiCallback<QueueFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountQueueValidateBeforeCall(accountId, queueId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueueFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountQueues */
    private com.squareup.okhttp.Call listAccountQueuesCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/queues".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (filtersName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[name]", filtersName));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
        if (sortName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[name]", sortName));
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
    private com.squareup.okhttp.Call listAccountQueuesValidateBeforeCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountQueues(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountQueuesCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of queues for an account
     * The List Queues service lists all the queues belong to the account. See Account Queues for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListQueuesFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListQueuesFull listAccountQueues(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListQueuesFull> resp = listAccountQueuesWithHttpInfo(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of queues for an account
     * The List Queues service lists all the queues belong to the account. See Account Queues for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListQueuesFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListQueuesFull> listAccountQueuesWithHttpInfo(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountQueuesValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListQueuesFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of queues for an account (asynchronously)
     * The List Queues service lists all the queues belong to the account. See Account Queues for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountQueuesAsync(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ApiCallback<ListQueuesFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountQueuesValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListQueuesFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for replaceAccountQueue */
    private com.squareup.okhttp.Call replaceAccountQueueCall(Integer accountId, Integer queueId, CreateQueueParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/queues/{queue_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "queue_id" + "\\}", apiClient.escapeString(queueId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call replaceAccountQueueValidateBeforeCall(Integer accountId, Integer queueId, CreateQueueParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccountQueue(Async)");
        }
        
        // verify the required parameter 'queueId' is set
        if (queueId == null) {
            throw new ApiException("Missing the required parameter 'queueId' when calling replaceAccountQueue(Async)");
        }
        
        
        com.squareup.okhttp.Call call = replaceAccountQueueCall(accountId, queueId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Replace a queue
     * The Replace Queue service replaces the parameters of a queue. For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @param data Queue data (optional)
     * @return QueueFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueueFull replaceAccountQueue(Integer accountId, Integer queueId, CreateQueueParams data) throws ApiException {
        ApiResponse<QueueFull> resp = replaceAccountQueueWithHttpInfo(accountId, queueId, data);
        return resp.getData();
    }

    /**
     * Replace a queue
     * The Replace Queue service replaces the parameters of a queue. For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @param data Queue data (optional)
     * @return ApiResponse&lt;QueueFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueueFull> replaceAccountQueueWithHttpInfo(Integer accountId, Integer queueId, CreateQueueParams data) throws ApiException {
        com.squareup.okhttp.Call call = replaceAccountQueueValidateBeforeCall(accountId, queueId, data, null, null);
        Type localVarReturnType = new TypeToken<QueueFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace a queue (asynchronously)
     * The Replace Queue service replaces the parameters of a queue. For more on the input fields, see Account Queues.
     * @param accountId Account ID (required)
     * @param queueId Queue ID (required)
     * @param data Queue data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceAccountQueueAsync(Integer accountId, Integer queueId, CreateQueueParams data, final ApiCallback<QueueFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceAccountQueueValidateBeforeCall(accountId, queueId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueueFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}