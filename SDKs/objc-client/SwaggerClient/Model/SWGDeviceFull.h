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


#import "SWGLine.h"
#import "SWGSipAuthentication.h"


@protocol SWGDeviceFull
@end

@interface SWGDeviceFull : SWGObject

/* ID [optional]
 */
@property(nonatomic) NSNumber* _id;
/* User-supplied name, otherwise NULL [optional]
 */
@property(nonatomic) NSString* name;

@property(nonatomic) SWGSipAuthentication* sipAuthentication;
/* Array of Line Objects showing which extensions are attached to this device, and their assigned line numbers. See below for details. [optional]
 */
@property(nonatomic) NSArray<SWGLine>* lines;

@end