/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.helper.TestConfig;
import io.swagger.client.model.CreateTrunkParams;
import io.swagger.client.model.ListTrunksFull;

/**
 * API tests for TrunksApi
 */
public class TrunksApiTest {

    private final TrunksApi api = new TrunksApi();

    @Before
    public void initTest() {
    	TestConfig.setAuthorization();
    }
    
    /**
     * Add a trunk record with SIP information
     *
     * For more on the input fields, see Account Trunks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTrunkTest() throws ApiException {
        Integer accountId = null;
        CreateTrunkParams data = null;
        // TrunkFull response = api.createAccountTrunk(accountId, data);

        // TODO: test validations
    }
    
    /**
     * Delete a trunk from account
     *
     * This service deletes a trunk from the account. For more on the properties of trunks, see Account Trunks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountTrunkTest() throws ApiException {
        Integer accountId = null;
        Integer trunkId = null;
        // DeleteTrunk response = api.deleteAccountTrunk(accountId, trunkId);

        // TODO: test validations
    }
    
    /**
     * Show details of an individual trunk
     *
     * This service shows the details of an individual Trunk.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTrunkTest() throws ApiException {
        Integer accountId = null;
        Integer trunkId = null;
        // TrunkFull response = api.getAccountTrunk(accountId, trunkId);

        // TODO: test validations
    }
    
    /**
     * Get a list of trunks for an account
     *
     * See Account Trunks for more info on the properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountTrunksTest() throws ApiException {
        Integer accountId = 1315091;
        List<String> filtersId = null;
        List<String> filtersName = null;
        String sortId = null;
        String sortName = null;
        Integer limit = null;
        Integer offset = null;
        String fields = null;
        ListTrunksFull response = api.listAccountTrunks(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        assertNotNull(response.getFilters());
        assertNotNull(response.getItems());
        assertNotNull(response.getLimit());
        assertNotNull(response.getOffset());
        assertNotNull(response.getSort());
        assertNotNull(response.getTotal());
        // TODO: test validations
    }
    
    /**
     * Replace parameters in a trunk
     *
     * For more on the input fields, see Account Trunks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAccountTrunkTest() throws ApiException {
        Integer accountId = null;
        Integer trunkId = null;
        CreateTrunkParams data = null;
        // TrunkFull response = api.replaceAccountTrunk(accountId, trunkId, data);

        // TODO: test validations
    }
    
}