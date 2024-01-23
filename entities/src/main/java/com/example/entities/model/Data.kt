/* 
Copyright (c) 2024 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */
import com.google.gson.annotations.SerializedName

data class Data (

	@SerializedName("search_parameters") val search_parameters : Search_parameters,
	@SerializedName("created_at") val created_at : String,
	@SerializedName("airlines") val airlines : List<Airlines>,
	@SerializedName("airports") val airports : List<Airports>,
	@SerializedName("stop_counts") val stop_counts : List<Int>,
	@SerializedName("baggages") val baggages : List<Int>,
	@SerializedName("filter_boundaries") val filter_boundaries : Filter_boundaries,
	@SerializedName("has_vi_flight") val has_vi_flight : Boolean,
	@SerializedName("info_message") val info_message : String,
	@SerializedName("search_url") val search_url : String,
	@SerializedName("short_search_url") val short_search_url : String,
	@SerializedName("currencies") val currencies : Currencies,
	@SerializedName("bus_search_data_tab") val bus_search_data_tab : String,
	@SerializedName("flights") val flights : Flights,
	@SerializedName("price_history") val price_history : Price_history
)