#import <Foundation/Foundation.h>
#import "SWGObject.h"

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
*/


#import "SWGFilterIdNamePhoneNumberArray.h"
#import "SWGPhoneNumberContact.h"
#import "SWGSortIdNamePhoneNumber.h"


@protocol SWGListPhoneNumbers
@end

@interface SWGListPhoneNumbers : SWGObject


@property(nonatomic) SWGFilterIdNamePhoneNumberArray* filters;

@property(nonatomic) SWGSortIdNamePhoneNumber* sort;

@property(nonatomic) NSNumber* total;

@property(nonatomic) NSNumber* offset;

@property(nonatomic) NSNumber* limit;
/* Array of Contact Phone Number Objects. See below for details. [optional]
 */
@property(nonatomic) NSArray<SWGPhoneNumberContact>* items;

@end