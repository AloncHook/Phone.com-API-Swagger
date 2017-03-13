# coding: utf-8

"""
    Phone.com API

    This is a Phone.com api Swagger definition

    OpenAPI spec version: 1.0.0
    Contact: apisupport@phone.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class RouteFull(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, name=None, extension=None, rules=None):
        """
        RouteFull - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'int',
            'name': 'str',
            'extension': 'ExtensionSummary',
            'rules': 'list[RuleSet]'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'extension': 'extension',
            'rules': 'rules'
        }

        self._id = id
        self._name = name
        self._extension = extension
        self._rules = rules

    @property
    def id(self):
        """
        Gets the id of this RouteFull.
        Integer ID. Read-only.

        :return: The id of this RouteFull.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this RouteFull.
        Integer ID. Read-only.

        :param id: The id of this RouteFull.
        :type: int
        """

        self._id = id

    @property
    def name(self):
        """
        Gets the name of this RouteFull.
        Name

        :return: The name of this RouteFull.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this RouteFull.
        Name

        :param name: The name of this RouteFull.
        :type: str
        """

        self._name = name

    @property
    def extension(self):
        """
        Gets the extension of this RouteFull.
        Extension to which this route belongs. Output is an Extension Summary Object. Input must be an Extension Lookup Object. Optional. Cannot be changed after a route is created.

        :return: The extension of this RouteFull.
        :rtype: ExtensionSummary
        """
        return self._extension

    @extension.setter
    def extension(self, extension):
        """
        Sets the extension of this RouteFull.
        Extension to which this route belongs. Output is an Extension Summary Object. Input must be an Extension Lookup Object. Optional. Cannot be changed after a route is created.

        :param extension: The extension of this RouteFull.
        :type: ExtensionSummary
        """

        self._extension = extension

    @property
    def rules(self):
        """
        Gets the rules of this RouteFull.
        Array of Rule Set Objects. Required. See below for details. When processing incoming calls, the first matching rule set will be used, and all others will be ignored.

        :return: The rules of this RouteFull.
        :rtype: list[RuleSet]
        """
        return self._rules

    @rules.setter
    def rules(self, rules):
        """
        Sets the rules of this RouteFull.
        Array of Rule Set Objects. Required. See below for details. When processing incoming calls, the first matching rule set will be used, and all others will be ignored.

        :param rules: The rules of this RouteFull.
        :type: list[RuleSet]
        """

        self._rules = rules

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, RouteFull):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other