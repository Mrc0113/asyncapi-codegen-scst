
package acme.rideshare.expense;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class RideReceipt {

	public RideReceipt () {
	}
	public RideReceipt (
		String totalOwed, 
		String duration, 
		String totalCharged, 
		String distance, 
		String distanceLabel, 
		String subtotal, 
		String totalFare, 
		String requestId, 
		String currencyCode) {
		this.totalOwed = totalOwed;
		this.duration = duration;
		this.totalCharged = totalCharged;
		this.distance = distance;
		this.distanceLabel = distanceLabel;
		this.subtotal = subtotal;
		this.totalFare = totalFare;
		this.requestId = requestId;
		this.currencyCode = currencyCode;
	}


	@JsonProperty("total_owed")
	private String totalOwed;
	private String duration;
	@JsonProperty("total_charged")
	private String totalCharged;
	private String distance;
	@JsonProperty("distance_label")
	private String distanceLabel;
	private String subtotal;
	@JsonProperty("total_fare")
	private String totalFare;
	@JsonProperty("request_id")
	private String requestId;
	@JsonProperty("currency_code")
	private String currencyCode;

	public String getTotalOwed() {
		return totalOwed;
	}

	public RideReceipt setTotalOwed(String totalOwed) {
		this.totalOwed = totalOwed;
		return this;
	}


	public String getDuration() {
		return duration;
	}

	public RideReceipt setDuration(String duration) {
		this.duration = duration;
		return this;
	}


	public String getTotalCharged() {
		return totalCharged;
	}

	public RideReceipt setTotalCharged(String totalCharged) {
		this.totalCharged = totalCharged;
		return this;
	}


	public String getDistance() {
		return distance;
	}

	public RideReceipt setDistance(String distance) {
		this.distance = distance;
		return this;
	}


	public String getDistanceLabel() {
		return distanceLabel;
	}

	public RideReceipt setDistanceLabel(String distanceLabel) {
		this.distanceLabel = distanceLabel;
		return this;
	}


	public String getSubtotal() {
		return subtotal;
	}

	public RideReceipt setSubtotal(String subtotal) {
		this.subtotal = subtotal;
		return this;
	}


	public String getTotalFare() {
		return totalFare;
	}

	public RideReceipt setTotalFare(String totalFare) {
		this.totalFare = totalFare;
		return this;
	}


	public String getRequestId() {
		return requestId;
	}

	public RideReceipt setRequestId(String requestId) {
		this.requestId = requestId;
		return this;
	}


	public String getCurrencyCode() {
		return currencyCode;
	}

	public RideReceipt setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}


	public String toString() {
		return "RideReceipt ["
		+ " totalOwed: " + totalOwed
		+ " duration: " + duration
		+ " totalCharged: " + totalCharged
		+ " distance: " + distance
		+ " distanceLabel: " + distanceLabel
		+ " subtotal: " + subtotal
		+ " totalFare: " + totalFare
		+ " requestId: " + requestId
		+ " currencyCode: " + currencyCode
		+ " ]";
	}
}

