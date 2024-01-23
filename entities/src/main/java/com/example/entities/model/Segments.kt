/* 
Copyright (c) 2024 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */
import com.google.gson.annotations.SerializedName

data class Segments (

	@SerializedName("departure_datetime") val departure_datetime : Departure_datetime,
	@SerializedName("display_departure_datetime") val display_departure_datetime : String,
	@SerializedName("arrival_datetime") val arrival_datetime : Arrival_datetime,
	@SerializedName("display_arrival_datetime") val display_arrival_datetime : String,
	@SerializedName("class") val class1 : String,
	@SerializedName("flight_number") val flight_number : String,
	@SerializedName("origin") val origin : String,
	@SerializedName("destination") val destination : String,
	@SerializedName("marketing_airline") val marketing_airline : String,
	@SerializedName("operating_airline") val operating_airline : String,
	@SerializedName("available_seats") val available_seats : Int,
	@SerializedName("origin_terminal") val origin_terminal : String,
	@SerializedName("destination_terminal") val destination_terminal : String,
	@SerializedName("segment_delay") val segment_delay : String,
	@SerializedName("duration") val duration : Duration,
	@SerializedName("is_train") val is_train : Boolean,
	@SerializedName("segment_attributes") val segment_attributes : Segment_attributes,
	@SerializedName("is_virtual_interlining") val is_virtual_interlining : Boolean
)