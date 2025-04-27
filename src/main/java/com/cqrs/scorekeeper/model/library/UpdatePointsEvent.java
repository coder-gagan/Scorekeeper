package com.cqrs.scorekeeper.model.library;

import java.io.Serializable;
import java.time.Instant;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePointsEvent implements Serializable {
	String tableId;
	Integer gameweek;
	Instant timeStamp;
	Record homeTeamDetails;
	Record awayTeamDetails;
}
