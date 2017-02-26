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


import io.swagger.client.model.CreateDeviceParams;
import io.swagger.client.model.DeviceFull;
import io.swagger.client.model.ListDevicesFull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevicesApi {
    private ApiClient apiClient;

    public DevicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DevicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountDevice */
    private com.squareup.okhttp.Call createAccountDeviceCall(Integer accountId, CreateDeviceParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/devices".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call createAccountDeviceValidateBeforeCall(Integer accountId, CreateDeviceParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountDevice(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createAccountDeviceCall(accountId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Register a generic VoIP device
     * 
     * @param accountId Account ID (required)
     * @param data Device data (optional)
     * @return DeviceFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceFull createAccountDevice(Integer accountId, CreateDeviceParams data) throws ApiException {
        ApiResponse<DeviceFull> resp = createAccountDeviceWithHttpInfo(accountId, data);
        return resp.getData();
    }

    /**
     * Register a generic VoIP device
     * 
     * @param accountId Account ID (required)
     * @param data Device data (optional)
     * @return ApiResponse&lt;DeviceFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceFull> createAccountDeviceWithHttpInfo(Integer accountId, CreateDeviceParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountDeviceValidateBeforeCall(accountId, data, null, null);
        Type localVarReturnType = new TypeToken<DeviceFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Register a generic VoIP device (asynchronously)
     * 
     * @param accountId Account ID (required)
     * @param data Device data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountDeviceAsync(Integer accountId, CreateDeviceParams data, final ApiCallback<DeviceFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountDeviceValidateBeforeCall(accountId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountDevice */
    private com.squareup.okhttp.Call getAccountDeviceCall(Integer accountId, Integer deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/devices/{device_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

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
    private com.squareup.okhttp.Call getAccountDeviceValidateBeforeCall(Integer accountId, Integer deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountDevice(Async)");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling getAccountDevice(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountDeviceCall(accountId, deviceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show details of an individual VoIP device
     * 
     * @param accountId Account ID (required)
     * @param deviceId Device ID (required)
     * @return DeviceFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceFull getAccountDevice(Integer accountId, Integer deviceId) throws ApiException {
        ApiResponse<DeviceFull> resp = getAccountDeviceWithHttpInfo(accountId, deviceId);
        return resp.getData();
    }

    /**
     * Show details of an individual VoIP device
     * 
     * @param accountId Account ID (required)
     * @param deviceId Device ID (required)
     * @return ApiResponse&lt;DeviceFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceFull> getAccountDeviceWithHttpInfo(Integer accountId, Integer deviceId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountDeviceValidateBeforeCall(accountId, deviceId, null, null);
        Type localVarReturnType = new TypeToken<DeviceFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual VoIP device (asynchronously)
     * 
     * @param accountId Account ID (required)
     * @param deviceId Device ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountDeviceAsync(Integer accountId, Integer deviceId, final ApiCallback<DeviceFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountDeviceValidateBeforeCall(accountId, deviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountDevices */
    private com.squareup.okhttp.Call listAccountDevicesCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/devices".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call listAccountDevicesValidateBeforeCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountDevices(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountDevicesCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of VoIP devices associated with your account
     * 
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListDevicesFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListDevicesFull listAccountDevices(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListDevicesFull> resp = listAccountDevicesWithHttpInfo(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of VoIP devices associated with your account
     * 
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListDevicesFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListDevicesFull> listAccountDevicesWithHttpInfo(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountDevicesValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListDevicesFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of VoIP devices associated with your account (asynchronously)
     * 
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
    public com.squareup.okhttp.Call listAccountDevicesAsync(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ApiCallback<ListDevicesFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccountDevicesValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListDevicesFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for replaceAccountDevice */
    private com.squareup.okhttp.Call replaceAccountDeviceCall(Integer accountId, Integer deviceId, CreateDeviceParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/devices/{device_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "device_id" + "\\}", apiClient.escapeString(deviceId.toString()));

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
    private com.squareup.okhttp.Call replaceAccountDeviceValidateBeforeCall(Integer accountId, Integer deviceId, CreateDeviceParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling replaceAccountDevice(Async)");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling replaceAccountDevice(Async)");
        }
        
        
        com.squareup.okhttp.Call call = replaceAccountDeviceCall(accountId, deviceId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update the settings for an individual VoIP device
     * 
     * @param accountId Account ID (required)
     * @param deviceId Device ID (required)
     * @param data Device data (optional)
     * @return DeviceFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceFull replaceAccountDevice(Integer accountId, Integer deviceId, CreateDeviceParams data) throws ApiException {
        ApiResponse<DeviceFull> resp = replaceAccountDeviceWithHttpInfo(accountId, deviceId, data);
        return resp.getData();
    }

    /**
     * Update the settings for an individual VoIP device
     * 
     * @param accountId Account ID (required)
     * @param deviceId Device ID (required)
     * @param data Device data (optional)
     * @return ApiResponse&lt;DeviceFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceFull> replaceAccountDeviceWithHttpInfo(Integer accountId, Integer deviceId, CreateDeviceParams data) throws ApiException {
        com.squareup.okhttp.Call call = replaceAccountDeviceValidateBeforeCall(accountId, deviceId, data, null, null);
        Type localVarReturnType = new TypeToken<DeviceFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the settings for an individual VoIP device (asynchronously)
     * 
     * @param accountId Account ID (required)
     * @param deviceId Device ID (required)
     * @param data Device data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceAccountDeviceAsync(Integer accountId, Integer deviceId, CreateDeviceParams data, final ApiCallback<DeviceFull> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceAccountDeviceValidateBeforeCall(accountId, deviceId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}