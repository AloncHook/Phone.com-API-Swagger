//
// ApplicationsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



open class ApplicationsAPI: APIBase {
    /**
     Show details of an individual application
     
     - parameter accountId: (path) Account ID 
     - parameter applicationId: (path) Application ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAccountApplication(accountId: Int32, applicationId: Int32, completion: @escaping ((_ data: ApplicationFull?,_ error: Error?) -> Void)) {
        getAccountApplicationWithRequestBuilder(accountId: accountId, applicationId: applicationId).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Show details of an individual application
     - GET /accounts/{accountId}/applications/{applicationId}
     - 
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "name" : "aeiou",
  "id" : 123
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter applicationId: (path) Application ID 

     - returns: RequestBuilder<ApplicationFull> 
     */
    open class func getAccountApplicationWithRequestBuilder(accountId: Int32, applicationId: Int32) -> RequestBuilder<ApplicationFull> {
        var path = "/accounts/{accountId}/applications/{applicationId}"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{applicationId}", with: "\(applicationId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<ApplicationFull>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a list of applications you have defined
     
     - parameter accountId: (path) Account ID 
     - parameter filtersId: (query) ID filter (optional)
     - parameter filtersName: (query) Name filter (optional)
     - parameter sortId: (query) ID sorting (optional)
     - parameter sortName: (query) Name sorting (optional)
     - parameter limit: (query) Max results (optional)
     - parameter offset: (query) Results to skip (optional)
     - parameter fields: (query) Field set (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listAccountApplications(accountId: Int32, filtersId: [String]? = nil, filtersName: [String]? = nil, sortId: String? = nil, sortName: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil, completion: @escaping ((_ data: ListApplications?,_ error: Error?) -> Void)) {
        listAccountApplicationsWithRequestBuilder(accountId: accountId, filtersId: filtersId, filtersName: filtersName, sortId: sortId, sortName: sortName, limit: limit, offset: offset, fields: fields).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Get a list of applications you have defined
     - GET /accounts/{accountId}/applications
     - Get a list of an account available applications
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "total" : 123,
  "offset" : 123,
  "limit" : 123,
  "filters" : {
    "name" : "aeiou",
    "id" : "aeiou"
  },
  "sort" : {
    "name" : "aeiou",
    "id" : "aeiou"
  },
  "items" : [ {
    "name" : "aeiou",
    "id" : 123
  } ]
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter filtersId: (query) ID filter (optional)
     - parameter filtersName: (query) Name filter (optional)
     - parameter sortId: (query) ID sorting (optional)
     - parameter sortName: (query) Name sorting (optional)
     - parameter limit: (query) Max results (optional)
     - parameter offset: (query) Results to skip (optional)
     - parameter fields: (query) Field set (optional)

     - returns: RequestBuilder<ListApplications> 
     */
    open class func listAccountApplicationsWithRequestBuilder(accountId: Int32, filtersId: [String]? = nil, filtersName: [String]? = nil, sortId: String? = nil, sortName: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil) -> RequestBuilder<ListApplications> {
        var path = "/accounts/{accountId}/applications"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "filters[id]": filtersId, 
            "filters[name]": filtersName, 
            "sort[id]": sortId, 
            "sort[name]": sortName, 
            "limit": limit?.encodeToJSON(), 
            "offset": offset?.encodeToJSON(), 
            "fields": fields
        ])
        

        let requestBuilder: RequestBuilder<ListApplications>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}