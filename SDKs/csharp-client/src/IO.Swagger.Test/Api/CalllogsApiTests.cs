/* 
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing CalllogsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CalllogsApiTests
    {
        private CalllogsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CalllogsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CalllogsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CalllogsApi
            //Assert.IsInstanceOfType(typeof(CalllogsApi), instance, "instance is a CalllogsApi");
        }

        
        /// <summary>
        /// Test ListAccountCallLogs
        /// </summary>
        [Test]
        public void ListAccountCallLogsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //List<string> filtersId = null;
            //List<string> filtersStartTime = null;
            //string filtersCreatedAt = null;
            //string filtersDirection = null;
            //string filtersCalledNumber = null;
            //string filtersType = null;
            //List<string> filtersExtension = null;
            //string sortId = null;
            //string sortStartTime = null;
            //string sortCreatedAt = null;
            //int? limit = null;
            //int? offset = null;
            //string fields = null;
            //var response = instance.ListAccountCallLogs(accountId, filtersId, filtersStartTime, filtersCreatedAt, filtersDirection, filtersCalledNumber, filtersType, filtersExtension, sortId, sortStartTime, sortCreatedAt, limit, offset, fields);
            //Assert.IsInstanceOf<ListCallLogs> (response, "response is ListCallLogs");
        }
        
    }

}