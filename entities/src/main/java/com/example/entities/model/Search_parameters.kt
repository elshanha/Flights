/* 
Copyright (c) 2024 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */
import com.google.gson.annotations.SerializedName

data class Search_parameters (

	@SerializedName("request_id") val request_id : String,
	@SerializedName("provider") val provider : String,
	@SerializedName("origin") val origin : Origin,
	@SerializedName("destination") val destination : Destination,
	@SerializedName("origins") val origins : List<Origins>,
	@SerializedName("destinations") val destinations : List<Destinations>,
	@SerializedName("departure_dates") val departure_dates : List<String>,
	@SerializedName("departure_date") val departure_date : String,
	@SerializedName("display_departure_date") val display_departure_date : String,
	@SerializedName("display_departure_dates") val display_departure_dates : List<String>,
	@SerializedName("return_date") val return_date : String,
	@SerializedName("display_return_date") val display_return_date : String,
	@SerializedName("adult") val adult : Int,
	@SerializedName("senior") val senior : Int,
	@SerializedName("student") val student : Int,
	@SerializedName("child") val child : Int,
	@SerializedName("infant") val infant : Int,
	@SerializedName("passenger_count") val passenger_count : Int,
	@SerializedName("passenger_servisable_count") val passenger_servisable_count : Int,
	@SerializedName("version") val version : Int,
	@SerializedName("is_one_way") val is_one_way : Boolean,
	@SerializedName("is_domestic") val is_domestic : Boolean,
	@SerializedName("is_direct") val is_direct : Boolean,
	@SerializedName("is_refundable") val is_refundable : Boolean,
	@SerializedName("flight_class") val flight_class : String
)