# coding: utf-8

"""
    Phone.com API

    This is a Phone.com api Swagger definition

    OpenAPI spec version: 1.0.0
    Contact: apisupport@phone.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.models.create_device_params import CreateDeviceParams


class TestCreateDeviceParams(unittest.TestCase):
    """ CreateDeviceParams unit test stubs """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCreateDeviceParams(self):
        """
        Test CreateDeviceParams
        """
        model = swagger_client.models.create_device_params.CreateDeviceParams()


if __name__ == '__main__':
    unittest.main()