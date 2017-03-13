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


#import "SWGFilterIdNameArray.h"
#import "SWGQueueFull.h"
#import "SWGSortIdName.h"


@protocol SWGListQueues
@end

@interface SWGListQueues : SWGObject


@property(nonatomic) SWGFilterIdNameArray* filters;

@property(nonatomic) SWGSortIdName* sort;

@property(nonatomic) NSNumber* total;

@property(nonatomic) NSNumber* offset;

@property(nonatomic) NSNumber* limit;

@property(nonatomic) NSArray<SWGQueueFull>* items;

@end