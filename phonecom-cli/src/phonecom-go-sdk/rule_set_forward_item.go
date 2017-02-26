/* 
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

// Array of Forward Item Objects. See below for details. Required.
type RuleSetForwardItem struct {

	// Required. Must equal phone_number or extension.
	Type_ string `json:"type,omitempty"`

	// Required if type = \"extension\". Extension that callers should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.
	Extension ExtensionSummary `json:"extension,omitempty"`

	// Required if type = \"phone_number\". Phone number that callers should be directed to. Must be a string in E.164 format.
	Number string `json:"number,omitempty"`

	// Boolean. Optional. Default is FALSE. Use this to activate call screening. If TRUE, the timeout on the parent action should be at least 30 seconds.
	Screening bool `json:"screening,omitempty"`

	// Optional. Must equal calling_number or called_number. Defines which phone number should be used for Caller ID. Default is calling_number.
	CallerId string `json:"caller_id,omitempty"`

	// Optional string. If screening = TRUE, this value will be passed into our Text-To-Speech engine and used to inform the caller of who they have reached.
	VoiceTag string `json:"voice_tag,omitempty"`

	// Optional. Must equal one of: DEFAULT, STYLE_2, STYLE_3, STYLE_4, STYLE_5, STYLE_6, STYLE_7, STYLE_8, or STYLE_9. Identifies the style of ring tone you will hear when an incoming call is waiting.
	DistinctiveRing string `json:"distinctive_ring,omitempty"`
}